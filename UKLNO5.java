/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno5;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
import java.util.HashMap;
public class UKLNO5 {

    public static void main(String[] args) {
         // Contoh array
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        // HashMap untuk menyimpan angka dan jumlah kemunculannya
        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung frekuensi
        for (int angka : array) {
            if (frekuensi.containsKey(angka)) {
                frekuensi.put(angka, frekuensi.get(angka) + 1);
            } else {
                frekuensi.put(angka, 1);
            }
        }

        // Menampilkan hasil
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }
    }
}
