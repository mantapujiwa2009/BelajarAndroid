package com.example.belajarandrobing;

public class SongModel {
    String songName;
    String singer;
    String totalStreams;

    public SongModel(String songName, String singer, String totalStreams) {
        this.songName = songName;
        this.singer = singer;
        this.totalStreams = totalStreams;
    }

    public String getSongName() {
        return songName;
    }

    public String getSinger() {
        return singer;
    }

    public String getTotalStreams() {
        return totalStreams;
    }
}
