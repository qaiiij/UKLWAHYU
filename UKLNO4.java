/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno4;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLNO4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100) + 1; // angka random 1–100
        ArrayList<Integer> daftarTebakan = new ArrayList<>();
        int tebakan = 0;

        System.out.println("=== Permainan Tebak Angka (1-100) ===");

        // Loop sampai tebakan benar
        while (tebakan != angkaBenar) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            // Simpan ke ArrayList
            daftarTebakan.add(tebakan);

            // Pengecekan
            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
            }
        }

        // Tampilkan semua tebakan
        System.out.println("\n=== Daftar Semua Tebakan Anda ===");
        for (int i = 0; i < daftarTebakan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTebakan.get(i));
        }
    }
}
