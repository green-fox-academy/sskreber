package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
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

    public List<Fox.Trick> getLearnedTricks(Fox fox) {
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

//    public void saveTrick(Fox fox, Fox.Trick trick) {
//       foxRepository.saveTrick(fox, trick);
//    }
}
