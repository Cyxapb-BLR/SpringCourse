package com.matskevich.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    /*@Autowired
    @Qualifier("classicalMusic")
    private Music music;*/
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    // private List<String> musicList = new ArrayList<>();


    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicalGenre musicalGenre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);        // рандом [0-3)
        //System.out.println(randomNumber);
        if (musicalGenre == MusicalGenre.ROCK) {
            return rockMusic.getMusicList().get(randomNumber);
            // System.out.println(rockMusic.getMusicList().get(randomNumber));
        }
        if (musicalGenre == MusicalGenre.CLASSICAL) {
            return classicalMusic.getMusicList().get(randomNumber);
            // System.out.println(classicalMusic.getMusicList().get(randomNumber));
        }
        System.out.println("NULL");
        return null;
        // System.out.println("Playing: " + rockMusic.getSong());
    }
    /* @Autowired
     private Music music;*/
    /*private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }*/
/* private List<Music> musicList = new ArrayList<>();
     private String name;
     private int volume;*/
   /* //@Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }*/

   /* @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }*/

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
//


  /*  public void playMusicList() {
        for (Music song : musicList) {
            music = song;
            playMusic();
        }
    }*/
}
