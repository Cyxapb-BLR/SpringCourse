package com.matskevich.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    /* @Autowired
     private Music music;*/
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
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

    public String playMusic() {
       return "Playing: " + classicalMusic.getSong();
       // System.out.println("Playing: " + rockMusic.getSong());
    }

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
