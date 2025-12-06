/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno2;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
public class UKLNO2 {

    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {

            // Untuk angka 1, output khusus
            if (i == 1) {
                System.out.println(i + ". saya senang");
                break;
            }

            // Pola 3 baris berulang:
            // i % 3 == 2 → saya anak moklet
            // i % 3 == 1 → saya anak wikusama
            // i % 3 == 0 → saya angkatan 33

            if (i % 3 == 2) {
                System.out.println(i + ". saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println(i + ". saya anak wikusama");
            } else { // i % 3 == 0
                System.out.println(i + ". saya angkatan 33");
            }
        }
    }
}