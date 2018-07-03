package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements GenericService<Post> {

    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void addItem(Post item) {
        postRepository.save(item);
    }

    @Override
    public void deleteItem(Post item) {
        postRepository.delete(item);
    }

    @Override
    public void updateItem(Post item) {
        postRepository.save(item);
    }

    @Override
    public List<Post> findAllItems() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public Post findItemById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post findItemByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    @Override
    public Post findByUrl(String url) {
        return postRepository.findByUrl(url);
    }
}
