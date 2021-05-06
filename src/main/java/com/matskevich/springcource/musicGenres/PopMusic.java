package com.matskevich.springcource.musicGenres;

import com.matskevich.springcource.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Руки Вверх - Крошка моя";
    }
}
