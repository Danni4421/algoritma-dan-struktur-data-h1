/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class perulangan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        String nim;
        System.out.print("Masukkan NIM : ");
        nim = sc.next();
        
        String twoDigits = nim.charAt(nim.length() - 2) + "" + nim.charAt(nim.length() - 1);
        int getTwoDigits = Integer.parseInt(twoDigits);
        
        if (getTwoDigits < 10) {
            getTwoDigits += 10;
        }
        
        int c = 0;
        for (int i = 0; i < getTwoDigits; i++) {
            if (c == day.length) {
                c = 0;
            }
            System.out.println(day[c] + " ");
            c++;
        }
    }
}
