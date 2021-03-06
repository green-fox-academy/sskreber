package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

    private FoxRepository foxRepository;

    @Autowired
    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public List<Trick> getLearnedTricks(Fox fox) {
        return fox.getLearnedTricks();
    }

    public void saveFox(Fox fox) {
        foxRepository.saveFox(fox);
    }

    public boolean doesFoxNameExist(String name) {
        return foxRepository.doesFoxNameExist(name);
    }

    public Fox getFoxByName(String name) {
        return foxRepository.getFoxByName(name);
    }

    public static void setLoggedInFox(Fox loggedInFox) {
        FoxRepository.setLoggedInFox(loggedInFox);
    }

    public static Fox getLoggedInFox() {
        return FoxRepository.loggedInFox;
    }

    public Fox getFoxById(long id) {
        return foxRepository.getFoxById(id);
    }
}
