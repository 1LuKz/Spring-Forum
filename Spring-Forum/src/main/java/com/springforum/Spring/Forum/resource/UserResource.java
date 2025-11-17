package com.springforum.Spring.Forum.resource;

import com.springforum.Spring.Forum.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User test = new User("1", "Test", "teste@teste.com");
        User anotherTest = new User("2", "Another Test", "anotherteste@teste.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(test, anotherTest));
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
