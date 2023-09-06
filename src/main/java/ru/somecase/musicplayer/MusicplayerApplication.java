package ru.somecase.musicplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.somecase.musicplayer.model.MusicPlayer;
import ru.somecase.musicplayer.model.MusicStyle;

import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class MusicplayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicplayerApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicplayerApplication.class);
		MusicPlayer player = context.getBean(MusicPlayer.class);
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				String styleString = scan.nextLine();
				if (Objects.equals(styleString, "CLOSE")) break;
				MusicStyle style = MusicStyle.valueOf(styleString);
				player.playMusic(style);
			}
			catch (IllegalArgumentException e) {
				System.out.println("Enter ROCK, CLASSICAL or CLOSE");
			}
		}
	}

}
