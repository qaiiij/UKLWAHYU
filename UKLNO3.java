/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno3;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
import java.util.Scanner;
public class UKLNO3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int n = input.nextInt();

        long faktorial = 1;

        if (n < 0) {
            System.out.println("Faktorial tidak dapat dihitung untuk bilangan negatif.");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
