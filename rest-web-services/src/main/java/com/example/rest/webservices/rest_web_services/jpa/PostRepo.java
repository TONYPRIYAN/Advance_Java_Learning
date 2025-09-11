package com.example.rest.webservices.rest_web_services.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.webservices.rest_web_services.user.Post;

public interface PostRepo extends JpaRepository<Post, Integer>
{

}
