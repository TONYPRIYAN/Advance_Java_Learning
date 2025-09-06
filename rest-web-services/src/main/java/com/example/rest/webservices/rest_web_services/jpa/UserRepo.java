package com.example.rest.webservices.rest_web_services.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.webservices.rest_web_services.user.User;

public interface UserRepo extends JpaRepository<User, Integer>
{

}
