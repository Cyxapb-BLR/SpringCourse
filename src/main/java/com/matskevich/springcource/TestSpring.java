package com.matskevich.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        //Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        /*Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        musicPlayer.setMusic(music1);
        musicPlayer.playMusic();*/

       /* ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());*/

        /*ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1.getSong());*/

       /* Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);*/

       /* MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer.getVolume());
        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/
      /*  musicPlayer.playMusic();
        System.out.println("name: " + musicPlayer.getName());
        System.out.println("volume: " + musicPlayer.getVolume());
        System.out.println();
        musicPlayer.playMusicList();*/
        context.close();
    }
}
