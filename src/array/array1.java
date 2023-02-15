package array;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dani
 */
public class array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] royalGarden = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
        boolean condition = true;
        
        while (condition) {
            System.out.print("\nMENU\n1. Jumlah Stock Setiap Cabang\n"
                    + "2. Update Stock\n"
                    + "3. Total Pendapatan\n"
                    + "4. Keluar\n"
                    + "Masukkan Perintah : ");
            int getInput = sc.nextInt();
            switch (getInput) {
                case 1:
                    for (int i = 0; i < royalGarden.length; i++) {
                        switch (i) {
                            case 0:
                                System.out.println("\nRoyal Garden 1");
                                break;
                            case 1:
                                System.out.println("Royal Garden 2");
                                break;
                            case 2:
                                System.out.println("Royal Garden 3");
                                break;
                            case 3:
                                System.out.println("Royal Garden 4");
                                break;
                        }
                        for (int j = 0; j < royalGarden[0].length; j++) {
                            switch (j) {
                                case 0:
                                    System.out.println("Aglonema : " + royalGarden[i][j]);
                                    break;
                                case 1:
                                    System.out.println("Keladi : " + royalGarden[i][j]);
                                    break;
                                case 2:
                                    System.out.println("Alocasia : " + royalGarden[i][j]);
                                    break;
                                case 3:
                                    System.out.println("Mawar : " + royalGarden[i][j]);
                                    break;
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukkan Tempat : "
                            + "\n1. Royal Garden 1"
                            + "\n2. Royal Garden 2"
                            + "\n3. Royal Garden 3"
                            + "\n4. Royal Garden 4"
                            + "\nMasukkan Pilihan : ");
                            int getInputPlace = sc.nextInt();
                            
                            do {
                                System.out.print("\nPilih Bunga : \n"
                                    + "1. Aglonema\n"
                                    + "2. Keladi\n"
                                    + "3. Alocasia\n"
                                    + "4. Mawar\n"
                                    + "Masukkan Pilihan : ");
                                int getInputFlower = sc.nextInt();

                                switch (getInputPlace) {
                                    case 1:
                                        System.out.println("Stock : " + royalGarden[getInputPlace - 1][getInputFlower - 1]);
                                        break;
                                    case 2:
                                        System.out.println("Stock : " + royalGarden[getInputPlace - 1][getInputFlower - 1]);
                                        break;
                                    case 3:
                                        System.out.println("Stock : " + royalGarden[getInputPlace - 1][getInputFlower - 1]);
                                        break;
                                    case 4:
                                        System.out.println("Stock : " + royalGarden[getInputPlace - 1][getInputFlower - 1]);
                                        break;
                                }

                                System.out.print("Ubah data [y/n] : ");
                                char getConfirmInput = sc.next().charAt(0);
                                if (getConfirmInput == 'y') {
                                    System.out.println("Masukkan Perubahan [note: - untuk mengurangi] : ");
                                    int getInputUpdate = sc.nextInt();
                                    royalGarden[getInputPlace - 1][getInputFlower - 1] += getInputUpdate;
                                }
                                
                                System.out.print("Ingin Merubah Data Lain? ");
                                char changeAgain = sc.next().charAt(0);
                                if (changeAgain != 'y') {
                                    break;
                                }
                                
                            } while (true);
                            break;
                case 3:
                    System.out.print("\nTOTAL PENJUALAN\n1. Royal Garden 1\n"
                            + "2. Royal Garden 2\n"
                            + "3. Royal Garden 3\n"
                            + "4. Royal Garden 4\n"
                            + "Masukkan Pilihan : ");
                            int getPilihan = sc.nextInt();
                            getPilihan -= 1;
                            int totalPenjualan = 0;
                            for (int i = 0; i < royalGarden[0].length; i++) {
                                switch (i) {
                                    case 0:
                                        totalPenjualan += royalGarden[getPilihan][i] * aglonema;
                                        break;
                                    case 1:
                                        totalPenjualan += royalGarden[getPilihan][i] * keladi;
                                        break;
                                    case 2:
                                        totalPenjualan += royalGarden[getPilihan][i] * alocasia;
                                        break;
                                    case 3:
                                        totalPenjualan += royalGarden[getPilihan][i] * mawar;
                                        break;
                                }
                            }
                            
                            System.out.println(totalPenjualan);
                    break;
                case 4:
                    condition = false;
                    break;
                    
            }
        }
        
    }
}
