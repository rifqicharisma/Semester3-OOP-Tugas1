package com.rifqi.soal3;

import java.util.Scanner;

public class Karyawan {
    private static String nama = "", jenisKelamin = "", tempatLahir= "", jabatan="", perkawinan="";
    private static int umur = 0;

    public void cetakData(){
        System.out.println("===== DATA DIRI ANDA =====");
        System.out.println("Nama : " + nama);
        System.out.println("Tempat Lahir : " + tempatLahir);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Jabatan/Pangkat : " + jabatan);
        System.out.println("Status Perkawinan : " + perkawinan);
        System.out.println("Umur : " + umur);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== DETAIL PRAJURIT KOPASSUS =====");
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Tempat Lahir : ");
        tempatLahir = scanner.next();
        System.out.print("Jenis Kelamin (L/P): ");
        jenisKelamin = scanner.next();
        System.out.print("Jabatan/Pangkat : ");
        jabatan = scanner.next();
        System.out.print("Status Perkawinan : ");
        perkawinan = scanner.next();
        System.out.print("Umur : ");
        umur = scanner.nextInt();
        System.out.println();
        Karyawan karyawan = new Karyawan();
        karyawan.cetakData();
    }
}
