package com.matskevich.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        System.out.println("Computer " + id + " " + musicPlayer.playMusic(MusicalGenre.ROCK) + "(rock)");
        System.out.println("Next song:");
        return "Computer " + id + " " + musicPlayer.playMusic(MusicalGenre.CLASSICAL) + "(classical)";
    }
}
