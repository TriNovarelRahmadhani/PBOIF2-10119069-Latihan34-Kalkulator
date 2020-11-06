/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program kalkulator
 */
public class PBOIF210119069Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        Kalkulator penghitung = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        penghitung.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        penghitung.value2 = scanner.nextDouble();
        System.out.println();
        System.out.printf("Hasil Pertambahan\t: %.1f%n",penghitung.addValue());
        System.out.printf("Hasil Pengurangan\t: %.1f%n",penghitung.subValue());
        System.out.printf("Hasil Perkalian\t: %.1f%n",penghitung.multiplyValue());
        System.out.printf("Hasil Pembagian\t: %.1f%n",penghitung.divideValue());
        System.out.printf("Hasil Sisa\t\t: %.1f%n",penghitung.divValue());
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
    }
    
}
