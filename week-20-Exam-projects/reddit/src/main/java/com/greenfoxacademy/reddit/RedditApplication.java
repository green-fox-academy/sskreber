package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("Dear JavaScript", "http://9gag.com", 791L));
        postRepository.save(new Post("Crockford", "http://9gag.com", 567L));
        postRepository.save(new Post("Hello prog world", "http://9gag.com", 888L));
        postRepository.save(new Post("Madame Butterknife", "http://9gag.com", 658L));
        postRepository.save(new Post("ASS stands for Android Studio, Sweetie", "http://9gag.com", 995L));
    }
}
