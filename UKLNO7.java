/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno7;

/**
 *
 * @author wahyuqaisshadwisampurno
 */
import java.util.Scanner;
public class UKLNO7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); // buang newline

        String[] namaPaket = new String[jumlahPaket];
        long[] totalBiaya = new long[jumlahPaket];
        long[] totalPendapatan = new long[jumlahPaket];
        long[] labaRugi = new long[jumlahPaket];
        String[] status = new String[jumlahPaket];

        // Variabel untuk mencari laba terbesar
        long labaTertinggi = Long.MIN_VALUE;
        String paketLabaTertinggi = "";

        long totalKeseluruhan = 0;

        // Input data setiap paket
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\n=== Paket ke-" + (i + 1) + " ===");

            System.out.print("Nama Paket: ");
            namaPaket[i] = input.nextLine();

            System.out.print("Biaya produksi per event: ");
            long biaya = input.nextLong();

            System.out.print("Harga jual per event: ");
            long harga = input.nextLong();

            System.out.print("Jumlah event terjual: ");
            int event = input.nextInt();
            input.nextLine(); // buang newline

            // Hitung
            totalBiaya[i] = biaya * event;
            totalPendapatan[i] = harga * event;
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];

            // Tentukan status
            if (labaRugi[i] > 0) {
                status[i] = "Laba";
            } else if (labaRugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }

            totalKeseluruhan += labaRugi[i];

            // Cek laba tertinggi
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                paketLabaTertinggi = namaPaket[i];
            }
        }

        // Output
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println(
                namaPaket[i] + " | Rp" + totalBiaya[i] +
                " | Rp" + totalPendapatan[i] +
                " | Rp" + labaRugi[i] +
                " | " + status[i]
            );
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Paket dengan Laba Tertinggi: " + paketLabaTertinggi + " (Rp" + labaTertinggi + ")");
    }
}
