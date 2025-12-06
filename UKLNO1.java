/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno1;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
import java.util.Scanner;
public class UKLNO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();

        System.out.print("Deret Fibonacci: ");
        
        if (n > 100) {
            System.out.println("Jumlah elemen terlalu besar.");
            return;
        }
        if (n < 10) {
            System.out.println("Input terlalu kecil");
            return;
        }

        int angka1 = 0, angka2 = 1;
        int ganjil = 0, genap = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print(angka1 + " ");

            // Hitung ganjil atau genap
            if (angka1 % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            // Proses Fibonacci
            int angkaSelanjutnya = angka1 + angka2;
            angka1 = angka2;
            angka2 = angkaSelanjutnya;
        }

        System.out.println("\n---------------------------");
        System.out.println("Jumlah bilangan genap : " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}