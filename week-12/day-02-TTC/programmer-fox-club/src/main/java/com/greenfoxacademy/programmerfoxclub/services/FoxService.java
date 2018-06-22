package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {

    public List<Fox.Trick> getLearnedTricks(Fox fox);

    public void saveTrick(Fox.Trick trick);

    public void saveFox(Fox fox);

    public boolean doesFoxNameExist(String name);

    public Fox getFoxByName(String name);
}
