package com.springforum.Spring.Forum.config;

import com.springforum.Spring.Forum.domain.Post;
import com.springforum.Spring.Forum.domain.User;
import com.springforum.Spring.Forum.repository.PostRepository;
import com.springforum.Spring.Forum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User lucas = new User(null, "Lucas de Paula", "lucas@gmail.com");
        User zutomayo = new User(null, "Zutto mayonaka de iinoni", "zutto@gmail.com");
        User miku = new User(null, "Hatsune Miku", "miku@gmail.com");

        Post firstPost = new Post(null, simpleDateFormat.parse("29/01/2025"), "New albums", "I'm listening to zutomayo's new album!", lucas);
        Post secondPost = new Post(null, simpleDateFormat.parse("05/10/2024"), "New music", "Guys the new single is coming soon", miku);

        userRepository.saveAll(Arrays.asList(lucas, zutomayo, miku));
        postRepository.saveAll(Arrays.asList(firstPost, secondPost));
    }
}
