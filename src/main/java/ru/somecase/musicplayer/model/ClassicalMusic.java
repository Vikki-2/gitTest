package ru.somecase.musicplayer.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    private List<String> playlist = Arrays.asList("Beethoven – Symphony No.5", "Vivaldi – The Four Seasons", "Schubert – Ave Maria");

    public String getSong() {
        Random random = new Random();
        return playlist.get(random.nextInt(playlist.size()));
    }
}
