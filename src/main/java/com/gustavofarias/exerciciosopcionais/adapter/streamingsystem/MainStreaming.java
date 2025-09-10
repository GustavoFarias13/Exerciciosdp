package com.gustavofarias.exerciciosopcionais.adapter.streamingsystem;

public class MainStreaming {
    public static void main(String[] args) {
        Player p1 = new SpotifyAdapter(new SpotifyService());
        p1.play();
        p1.stop();

        Player p2 = new YouTubeAdapter(new YouTubeService());
        p2.play();
        p2.stop();
    }
}
