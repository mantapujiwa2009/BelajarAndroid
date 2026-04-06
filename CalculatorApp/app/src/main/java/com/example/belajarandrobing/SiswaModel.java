package com.example.belajarandrobing;

public class SiswaModel {
    String nama;
    String absen;
    String alamat;

    public SiswaModel(String nama, String absen, String alamat) {
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
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
}
