package com.gustavofarias.exerciciosopcionais.adapter.streamingsystem;

public class SpotifyAdapter implements Player{
    private SpotifyService spotify;

    public SpotifyAdapter(SpotifyService spotify) {
        this.spotify = spotify;
    }

    @Override
    public void play() {
        spotify.startSong();
    }

    @Override
    public void stop() {
        spotify.endSong();
    }
}
