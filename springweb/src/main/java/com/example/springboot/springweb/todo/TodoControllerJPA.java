package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControllerJPA {

    // Removed the confusing TodoService, using only the repository
    private final TodoRepository todoRepo;

    public TodoControllerJPA(TodoRepository todoRepo) {
        super();
        this.todoRepo = todoRepo;
    }

    @RequestMapping("list-todos")
    public String displayTodos(ModelMap map) {
        String username = getLoggedInUsername();
        List<Todo> todolist = todoRepo.findByUsrname(username);
        map.addAttribute("todolist", todolist);
        return "todos";
    }

    @RequestMapping(value = "add-todos", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap map) {
        String username = getLoggedInUsername();
        
        // Use the default constructor. The ID will be null by default.
        Todo todo = new Todo(); 
        
        // Set the other properties
        todo.setUsrname(username);
        todo.setDescription(""); // Set a default empty description
        todo.setTarget(LocalDate.now().plusMonths(2));
        todo.setDone(false);
        
        map.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "add-todos", method = RequestMethod.POST)
    public String addNewTodo(@Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        }
        String username = getLoggedInUsername();
        todo.setUsrname(username);
        todoRepo.save(todo); // Save directly to the database
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoRepo.deleteById(id); // Delete directly from the database
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap map) {
        // Find the todo from the database
        Todo todo = todoRepo.findById(id).get();
        map.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(@Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        }
        String username = getLoggedInUsername();
        todo.setUsrname(username);
        todoRepo.save(todo); // Update directly in the database
        return "redirect:list-todos";
    }

    // A single, reliable way to get the logged-in user's name
    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}

