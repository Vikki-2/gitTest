package ru.somecase.musicplayer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicStyle style) {
        String song = "";
        switch (style) {
            case ROCK -> song = "Playing: " + rockMusic.getSong();
            case CLASSICAL -> song = "Playing: " + classicalMusic.getSong();
        }
        System.out.println(song);
    }
}
