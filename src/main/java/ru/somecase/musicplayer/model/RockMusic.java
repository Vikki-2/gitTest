package ru.somecase.musicplayer.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    private List<String> playlist = Arrays.asList("Europe - The Final Countdown", "Metallica – Nothing Else Matters", "Bon Jovi - Livin' on a Prayer");

    public String getSong() {
        Random random = new Random();
        return playlist.get(random.nextInt(playlist.size()));
    }
}
