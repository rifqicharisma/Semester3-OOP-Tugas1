package com.rifqi.soal2;

import java.util.Scanner;

public class DemoMahasiswa {
    public static void main(String[] args) {
        // deklarasi array
        Mahasiswa arrayMahasiswa[] = new Mahasiswa[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== PENDAFTARAN MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM : ");
        int nim = scanner.nextInt();
        System.out.print("Asal : ");
        String asal = scanner.next();
        System.out.print("Tempat Lahir : ");
        String tempatLahir = scanner.next();
        System.out.print("Umur : ");
        int umur = scanner.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(nama, asal, tempatLahir, nim, umur);
        arrayMahasiswa[0] = mahasiswa;
        for (Mahasiswa x: arrayMahasiswa) {
            System.out.println("===== REVIEW PEMDAFTARAN =====");
            System.out.println("Nama : "+x.getNama());
            System.out.println("NIM : "+x.getNim());
            System.out.println("Asal: "+x.getAsal());
            System.out.println("Tempat Lahir : "+x.getTempatLahir());
            System.out.println("Umur : "+x.getUmur());
        }
    }
}
