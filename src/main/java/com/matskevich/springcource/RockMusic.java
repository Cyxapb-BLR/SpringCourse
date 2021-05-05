package com.matskevich.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicBean")
public class RockMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Wind cries Mary");
        musicList.add("Nothing Else Matters");
        musicList.add("Wind of Change");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public List<String> getMusicList() {
        return musicList;
    }
}
