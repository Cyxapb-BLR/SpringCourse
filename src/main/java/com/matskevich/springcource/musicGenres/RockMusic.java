package com.matskevich.springcource.musicGenres;

import com.matskevich.springcource.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
