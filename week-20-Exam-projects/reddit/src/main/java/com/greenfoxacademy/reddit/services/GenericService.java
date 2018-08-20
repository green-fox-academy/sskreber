package com.greenfoxacademy.reddit.services;

import java.util.List;

public interface GenericService<Type> {

    public void addItem(Type item);

    public void deleteItem(Type item);

    public void updateItem(Type item);

    public List<Type> findAllItems();

    public Type findItemById(Long id);

    public Type findItemByTitle(String title);

    public Type findByUrl(String url);
}
