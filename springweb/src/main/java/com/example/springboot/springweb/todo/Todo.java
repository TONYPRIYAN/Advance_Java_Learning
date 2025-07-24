package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {

    public Todo() {
        // Default constructor for JPA
    }

    @Id
    @GeneratedValue
    private Integer id;

    private String usrname;

    // Renamed from "desc" to "description" to avoid SQL keyword conflict
    @Size(min = 10, max = 50, message = "Character range from 10 - 50")
    private String description;

    private LocalDate target;
    private boolean done;

    public Todo(int id, String usrname, String description, LocalDate target, boolean done) {
        super();
        this.id = id;
        this.usrname = usrname;
        this.description = description;
        this.target = target;
        this.done = done;
    }

    // --- Getters and Setters ---

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTarget() {
        return target;
    }

    public void setTarget(LocalDate target) {
        this.target = target;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + usrname + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + target +
                ", done=" + done +
                '}';
    }
}

