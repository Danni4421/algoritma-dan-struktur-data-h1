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
public class tugas1 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
                
        // tarif 1kg = 4.5
        // 10kg -> diskon 5%
                
        String namaCustomer[] = new String[10]; 
        int weigthOfLaundry[] = new int[10];
        double incomePerCustomer[] = new double[10];

        System.out.println("LOUNDRY PAK EKO");
        
        while (true) {
            
            System.out.print("\n1. Layanan Cuci Laundry\n"
                    + "2. Laporan Layanan Laundry\n"
                    + "Masukkan Pilihan : ");
                    int getPilihan = sc.nextInt();
                    
                    if (getPilihan == 1) {
                        addCustomerLaundry(namaCustomer, weigthOfLaundry, incomePerCustomer);
                    } else if (getPilihan == 2) {
                        laundryReport(namaCustomer, weigthOfLaundry, incomePerCustomer);
                        
                    }
            
        } 
    }
    
    static void addCustomerLaundry(String[] namaCustomer, int[] beratLaundry, double[] income) {
                System.out.print("\nMasukkan Nama Customer : ");
                sc.nextLine();
                String nameCustomer = sc.nextLine();
                System.out.print("Masukkan Berat Pakaian Laundry : ");
                int weigthLaundry = sc.nextInt();
                
                double priceLaundry = weigthLaundry * 4500;
                
                if (weigthLaundry > 10) {
                    priceLaundry = weigthLaundry * 4500 - ((weigthLaundry * 4500) * 0.05);
                }
                
                for (int i = 0; i < namaCustomer.length; i++) {
                    if (namaCustomer[i] == null) {
                        namaCustomer[i] = nameCustomer;
                        beratLaundry[i] = weigthLaundry;
                        income[i] = priceLaundry;
                        break;
                    }
                }   
        }
    
    static void laundryReport(String[] namaCustomer, int[] weigth, double[] income) {
          System.out.println("\n\n::::: LAPORAN HASIL LAUNDRY :::::");
          for (int i = 0; i < namaCustomer.length; i++) {
            if (namaCustomer[i] != null) {
                System.out.print("\nNama Customer : " + namaCustomer[i] + 
                    "\nBerat Pakaian Customer : " + weigth[i] + 
                    "\nTotal Harga Customer : " + income[i] + 
                        "\n================================");
            } else {
                break;
            }
          }
          
          System.out.print("\n\n::::: Total Penghasilan :::::\n");
          double totalIncome = 0;
          for (int i = 0; i < income.length; i++) {
              totalIncome += income[i];
          }
          System.out.println("Penghasilan Hari Ini Adalah : " + totalIncome);
    }   
}
