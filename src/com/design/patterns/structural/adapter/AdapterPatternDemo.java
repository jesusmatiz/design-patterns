package com.design.patterns.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "audio 1.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "mi pelicula.vlc");
		audioPlayer.play("avi", "pelicula formato.avi");
	}

}
