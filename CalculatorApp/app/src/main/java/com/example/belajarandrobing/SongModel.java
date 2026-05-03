package com.example.belajarandrobing;

public class SongModel {
    String songName;
    String singer;
    String totalStreams;
    int songProfile;

    public SongModel(String songName, String singer, String totalStreams, int songProfile) {
        this.songName = songName;
        this.singer = singer;
        this.totalStreams = totalStreams;
        this.songProfile = songProfile;
    }

    public String getSongName() {
        return songName;
    }

    public int getSongProfile() {
        return songProfile;
    }

    public String getSinger() {

        return singer;
    }

    public String getTotalStreams() {

        return totalStreams;
    }
}
