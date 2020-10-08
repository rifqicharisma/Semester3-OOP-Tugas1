package com.rifqi.soal1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // parameter dideklarasikan di awal agar dapat digunakan berulang kali
        float suhu;
        // user memilih konversi
        System.out.println("Pilih Konversi : ");
        System.out.println("1. Celcius -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Kelvin");
        System.out.println("3. Kelvin -> Reamur");
        System.out.println("4. Reamur -> Celcius");
        System.out.print("Pilihan Anda : ");
        int input = scanner.nextInt();

        if (input==1){
            System.out.print("Masukkan Celcius : ");
            suhu = scanner.nextInt();
            // memanggil objek dari class Konversi dengan parameter
            Konversi pass = new Konversi(suhu, suhu, suhu, suhu);
            // mengkalkulasi
            pass.calculate(pass);
            // menampilkan hasil dari kalkulasi
            System.out.println(pass.celciusToF);
        }else if(input==2){
            System.out.print("Masukkan Fahrenheit : ");
            suhu = scanner.nextInt();
            Konversi pass = new Konversi(suhu, suhu, suhu, suhu);
            pass.calculate(pass);
            System.out.println(pass.fahrenheitToK);
        }else if(input==3){
            System.out.print("Masukkan Kelvin : ");
            suhu = scanner.nextInt();
            Konversi pass = new Konversi(suhu, suhu, suhu, suhu);
            pass.calculate(pass);
            System.out.println(pass.kelvinToR);
        }else{
            System.out.print("Masukkan Reamur : ");
            suhu = scanner.nextInt();
            Konversi pass = new Konversi(suhu, suhu, suhu, suhu);
            pass.calculate(pass);
            System.out.println(pass.reamurToC);
        }
    }
}
