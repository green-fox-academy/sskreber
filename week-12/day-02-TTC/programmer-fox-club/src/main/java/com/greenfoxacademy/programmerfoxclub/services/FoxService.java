package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;

import java.util.List;

public interface FoxService {

    public List<Trick> getLearnedTricks(Fox fox);

    public void saveFox(Fox fox);

    public boolean doesFoxNameExist(String name);

    public Fox getFoxByName(String name);

    public Fox getFoxById(long id);

    public static void setLoggedInFox(Fox loggedInFox) {
        FoxRepository.setLoggedInFox(loggedInFox);
    }

    public static Fox getLoggedInFox() {
        return FoxRepository.loggedInFox;
    }
}
