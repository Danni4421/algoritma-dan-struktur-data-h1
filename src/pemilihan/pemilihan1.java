/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilihan;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir\n================================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int UTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int UAS = sc.nextInt();
        System.out.print("\n================================\n================================");
        double nilaiAkhir = tugas * 0.2 + UTS * 0.35 + UAS * 0.45;
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        String nilaiHuruf;
        String keterangan = "SELAMAT LULUS";
        
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }
        System.out.println("Nilai Huruf : " + nilaiHuruf + "\n================================\n" + keterangan);
        
    }
}
