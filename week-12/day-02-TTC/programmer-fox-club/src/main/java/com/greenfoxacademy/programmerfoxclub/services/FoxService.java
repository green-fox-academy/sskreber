package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {

    public List<Trick> getLearnedTricks(Fox fox);

    public void saveFox(Fox fox);

    public boolean doesFoxNameExist(String name);

    public Fox getFoxByName(String name);

//    public void saveTrick(Fox fox, Fox.Trick trick);
}
