package com.matskevich.springcource.config;

import com.matskevich.springcource.*;
import com.matskevich.springcource.musicGenres.ClassicalMusic;
import com.matskevich.springcource.musicGenres.PopMusic;
import com.matskevich.springcource.musicGenres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        //return new MusicPlayer(classicalMusic(), rockMusic());
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList() {
        /*List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(popMusic());
        return musicList;*/
        return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
    }
}
