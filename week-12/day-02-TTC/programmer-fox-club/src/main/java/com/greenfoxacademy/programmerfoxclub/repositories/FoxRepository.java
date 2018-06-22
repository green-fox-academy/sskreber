package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FoxRepository {

    public static Fox loggedInFox;

    public ArrayList<Fox> foxes = new ArrayList<Fox>();

    public void saveFox(Fox fox) {
        foxes.add(fox);
    }

    public boolean doesFoxNameExist(String name) {
        return foxes.stream().anyMatch((fox -> fox.getName().equals(name)));
    }

    public Fox getFoxByName(String name) {
        try {
            for (Fox fox : foxes) {
                if (fox.getName().equals(name)) {
                    return fox;
                }
            }
        }
        catch (NullPointerException nullpointException) {
            return null;
        }
        return null;
    }

    public static Fox getLoggedInFox() {
        return loggedInFox;
    }

    public static void setLoggedInFox(Fox loggedInFox) {
        FoxRepository.loggedInFox = loggedInFox;
    }

    public Fox getFoxById(long id) {
        try {
            for (Fox fox : foxes) {
                if (fox.getId() == id) {
                    return fox;
                }
            }
        }
        catch (NullPointerException nullpointException) {
            return null;
        }
        return null;
    }
}

