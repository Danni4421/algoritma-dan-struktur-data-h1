/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class tugas2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("::::: VELOCITY :::::");

        while (true) {

            System.out.print("\n\n1. Hitung Kecepatan\n"
                    + "2. Hitung Jarak\n"
                    + "3. Hitung Waktu\n"
                    + "Masukkan Pilihan : ");
            int getPilihan = sc.nextInt();

            if (getPilihan == 1) {
                System.out.print("\n::::: HITUNG KECEPATAN :::::\n"
                        + "Masukkan Jarak Tempuh (meter) : ");
                double jarak = sc.nextDouble();
                System.out.print("Masukkan Waktu Tempuh (detik) : ");
                int waktuTempuh = sc.nextInt();

                double getKecepatan = setVelocity(jarak, waktuTempuh);

                System.out.printf("Kecepatan Anda Adalah : %.2fm/s", getKecepatan);

            } else if (getPilihan == 2) {
                System.out.print("\n::::: HITUNG JARAK :::::\n"
                        + "Masukkan waktu (detik) : ");
                int waktu = sc.nextInt();
                System.out.print("Masukkan Kecepatan (m/s) : ");
                double kecepatan = sc.nextDouble();

                double getJarak = setJarak(waktu, kecepatan);

                System.out.printf("Jarak yang Anda tempuh adalah : %.2fm", getJarak);

            } else if (getPilihan == 3) {
                System.out.print("\n::::: HITUNG WAKTU :::::\n"
                        + "Masukkan Jarak (meter) : ");
                double jarak = sc.nextDouble();
                System.out.print("Masukkan Kecepatan (m/s) : ");
                double kecepatan = sc.nextDouble();

                double getWaktu = setTime(jarak, kecepatan);

                System.out.printf("Waktu yang Anda tempuh adalah : %.2fs", getWaktu);

            } else {
                System.out.print("Maaf Pilihan Tidak Tersedia!! Ingin Menghentikan Program?[y/n] : ");
                char getInput = sc.next().charAt(0);
                if (getInput == 'y') {
                    break;
                }
            }
        }
    }

    static double setTime(double jarak, double kecepatan) {
        double time = 0;
        time = jarak / kecepatan;
        return time;
    }

    static double setJarak(int waktu, double kecepatan) {
        double jarak = 0;
        jarak = waktu * kecepatan;
        return jarak;
    }

    static double setVelocity(double jarak, int waktuTempuh) {
        double result = 0;

        result = jarak / waktuTempuh;

        return result;
    }

}
