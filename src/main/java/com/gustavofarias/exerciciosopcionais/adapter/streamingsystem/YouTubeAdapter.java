package com.gustavofarias.exerciciosopcionais.adapter.streamingsystem;

public class YouTubeAdapter implements Player{
    private YouTubeService youtube;

    public YouTubeAdapter(YouTubeService youtube) {
        this.youtube = youtube;
    }

    @Override
    public void play() {
        youtube.iniciarVideo();
    }

    @Override
    public void stop() {
        youtube.pausarVideo();
    }
}
