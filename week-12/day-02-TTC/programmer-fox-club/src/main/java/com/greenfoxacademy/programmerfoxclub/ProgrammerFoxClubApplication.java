package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.greenfoxacademy.programmerfoxclub.models.Fox.Trick.PLAY_CHESS;
import static com.greenfoxacademy.programmerfoxclub.models.Fox.Trick.SURF;

@SpringBootApplication
public class ProgrammerFoxClubApplication implements CommandLineRunner {

    @Autowired
    FoxRepository foxRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerFoxClubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        foxRepository.saveFox(new Fox("Bogyo"));
        foxRepository.saveFox(new Fox("Tiger"));
        foxRepository.saveFox(new Fox("Mr Green"));
        foxRepository.getFoxByName("Bogyo").addNewTrick(SURF);
        foxRepository.getFoxByName("Bogyo").addNewTrick(PLAY_CHESS);
    }
}
