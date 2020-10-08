package com.rifqi.soal2;

public class Mahasiswa {
    private String nama, asal, tempatLahir;
    private int nim, umur;

    // constructor kosongan
    public Mahasiswa(){}

    // constructor dengan parameter lengkap
    public Mahasiswa(String nama, String asal, String tempatLahir, int nim, int umur) {
        this.nama = nama;
        this.asal = asal;
        this.tempatLahir = tempatLahir;
        this.nim = nim;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
