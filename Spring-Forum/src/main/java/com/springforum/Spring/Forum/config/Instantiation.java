package com.springforum.Spring.Forum.config;

import com.springforum.Spring.Forum.domain.User;
import com.springforum.Spring.Forum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{

        userRepository.deleteAll();

        User lucas = new User(null, "Lucas de Paula", "lucas@gmail.com");
        User zutomayo = new User(null, "Zutto mayonaka de iinoni", "zutto@gmail.com");
        User miku = new User(null, "Hatsune Miku", "miku@gmail.com");

        userRepository.saveAll(Arrays.asList(lucas, zutomayo, miku));
    }
}
