package com.springforum.Spring.Forum.services;

import com.springforum.Spring.Forum.domain.User;
import com.springforum.Spring.Forum.repository.UserRepository;
import com.springforum.Spring.Forum.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
