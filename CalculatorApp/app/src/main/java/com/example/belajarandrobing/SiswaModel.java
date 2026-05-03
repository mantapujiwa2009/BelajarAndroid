package com.example.belajarandrobing;

public class SiswaModel {
    String nama;
    String absen;
    String alamat;
    int profile;

    public SiswaModel(String nama, String absen, String alamat, int profile) {
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
        this.profile = profile;
    }

    public String getNama() {
        return nama;
    }

    public String getAbsen() {
        return absen;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getProfile() {
        return profile;
    }
}