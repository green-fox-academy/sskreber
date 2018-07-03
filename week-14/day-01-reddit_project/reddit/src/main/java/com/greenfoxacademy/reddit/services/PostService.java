package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
     return (List<Post>)postRepository.findAll();
    }

    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }

    public Post findByTitle(String title) {
        return postRepository.findByTitle();
    }

    public Post findByUrlTitle(String url) {
        return postRepository.findByUrl();
    }
}
