package com.matskevich.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Hungarian Rhapsody");
        musicList.add("Symphony No. 5");
        musicList.add("Serenade No. 13");
    }
   /* private ClassicalMusic() {
    }

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }*/

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public List<String> getMusicList() {
        return musicList;
    }
}
