package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class PostController {

    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Object listPosts() {
        return postService.findAllItems();
    }

    @PostMapping("/posts")
    public Object addPost(@RequestBody Post post) {
        postService.addItem(post);
        return postService.findItemById(post.getId());
    }

    @PutMapping("/posts/{id}/upvote")
    public Object upvotePost(@PathVariable(value = "id") Long id) {
        postService.increaseVotesOfPostById(id);
        return postService.findItemById(id);
    }

    @PutMapping("/posts/{id}/downvote")
    public Object downvotePost(@PathVariable(value = "id") Long id) {
        postService.decreaseVotesOfPostById(id);
        return postService.findItemById(id);
    }
}
