/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class fungsi1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] royalGarden = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        System.out.println("::::: ROYAL GARDEN :::::");
        while (true) {
            
            System.out.print("\n1. Stock Semua Bunga\n"
                    + "2. Stock Jenis Bunga Cabang Tertentu\n"
                    + "Masukkan Pilihan : "); 
                    int getPilihan = sc.nextInt();
                    if (getPilihan == 1) {
                        showAllStock(royalGarden);
                    } else if (getPilihan == 2){
                        System.out.print("\nMasukkan Tempat : "
                            + "\n1. Royal Garden 1"
                            + "\n2. Royal Garden 2"
                            + "\n3. Royal Garden 3"
                            + "\n4. Royal Garden 4"
                            + "\nMasukkan Pilihan : ");
                            int getInputPlace = sc.nextInt();
                            
                            System.out.print("\nPilih Bunga : \n"
                                    + "1. Aglonema\n"
                                    + "2. Keladi\n"
                                    + "3. Alocasia\n"
                                    + "4. Mawar\n"
                                    + "Masukkan Pilihan : ");
                                int getInputFlower = sc.nextInt();
                                
                        pickStock(getInputPlace, getInputFlower, royalGarden);
                    } else {
                        System.out.println("Terima Kasih");
                        break;
                    }
        }
    }
    
    static void showAllStock (int[][] stock) {
        for (int i = 0; i < stock.length; i++) {
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
            for (int j = 0; j < stock[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Aglonema : " + stock[i][j]);
                        break;
                    case 1:
                        System.out.println("Keladi : " + stock[i][j]);
                        break;
                    case 2:
                        System.out.println("Alocasia : " + stock[i][j]);
                        break;
                    case 3:
                        System.out.println("Mawar : " + stock[i][j]);
                        break;
                }
            }
            System.out.println("");
        }
    }
    
    static void pickStock(int place, int flower, int[][] stock) {
        String placeName = "", flowerName = "";
        
        switch (place) {
            case 1:
                placeName = "Royal Garden 1";
                break;
            case 2:
                placeName = "Royal Garden 2";
                break;
            case 3:
                placeName = "Royal Garden 3";
                break;
            case 4:
                placeName = "Royal Garden 4";
                break;
        }
        
        switch (flower) {
            case 1:
                flowerName = "Aglonema";
                break;
            case 2:
                flowerName = "Keladi";
                break;
            case 3:
                flowerName = "Alocasia";
                break;
            case 4:
                flowerName = "Mawar";
                break;
        }
       
        System.out.printf("Bunga %s dari %s Memiliki Stock : %d",flowerName, placeName, stock[1 - place][flower - 1]);
        
    }
}
