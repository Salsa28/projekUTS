/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_and_searching;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class metode_searching {
    public static void sequential(String[] search) {
        int B[] = {3,10,4,2,8,};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        int cari = input.nextInt();
        int ketemu = 0;
        
        System.out.println("Isi Data A Adalah : ");
            for (int i = 0; i<B.length; i++){
                System.out.print(B[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<B.length; i++){
            if (B[i] == cari){
                ketemu = 1;
                System.out.print("Data Yang Dicari " + cari);
            }
        }
        System.out.println("");
        System.out.println("");
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
    }
    
    public static void main(String[] args){
        int A[] = {3,10,4, 2,8,13};
        metode_sorting.tampil(A);
        metode_sorting.insertionsort(A);
        metode_sorting.tampil(A);
        metode_sorting.sequential(search);
       System.out.print("Salsa Dwi Nur Hidayah");
    }
}

