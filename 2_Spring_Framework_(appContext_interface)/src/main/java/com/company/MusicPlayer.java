package com.company;

public class MusicPlayer {
    private Music music;
    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(String s) {
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}

