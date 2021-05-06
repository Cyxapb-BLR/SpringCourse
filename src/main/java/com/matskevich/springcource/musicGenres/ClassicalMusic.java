package com.matskevich.springcource.musicGenres;

import com.matskevich.springcource.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    /*private ClassicalMusic() {
    }

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }*/
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}