/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Diecast;
import model.Kategori;
import model.ManajemenKoleksi;
 
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenKoleksi manajemen = new ManajemenKoleksi();
        boolean berjalan = true;
 
        // Data awal kategori (contoh data bootstrap)
        manajemen.tambahKategori(new Kategori("K01", "Sport Car", "Diecast mobil sport berperforma tinggi"));
        manajemen.tambahKategori(new Kategori("K02", "JDM", "Diecast mobil Jepang (Japan Domestic Market)"));
 
        while (berjalan) {
            System.out.println("\n===== SISTEM MANAJEMEN KOLEKSI DIECAST =====");
            System.out.println("1. Tambah Data Diecast");
            System.out.println("2. Tampilkan Semua Data Diecast");
            System.out.println("3. Cari Data Diecast");
            System.out.println("4. Update Data Diecast");
            System.out.println("5. Hapus Data Diecast");
            System.out.println("6. Tambah Kategori");
            System.out.println("7. Tampilkan Semua Kategori");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
 
            int pilihan = bacaAngkaInt(scanner);
            scanner.nextLine(); // Bersihkan buffer newline setelah nextInt()
 
            switch (pilihan) {
                case 1:
                    tambahDataDiecast(scanner, manajemen);
                    break;
                case 2:
                    manajemen.tampilkanSemuaDiecast();
                    break;
                case 3:
                    cariDataDiecast(scanner, manajemen);
                    break;
                case 4:
                    updateDataDiecast(scanner, manajemen);
                    break;
                case 5:
                    hapusDataDiecast(scanner, manajemen);
                    break;
                case 6:
                    tambahDataKategori(scanner, manajemen);
                    break;
                case 7:
                    manajemen.tampilkanKategori();
                    break;
                case 0:
                    berjalan = false;
                    System.out.println("\n>> INFO: Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println(">> ERROR: Menu tidak tersedia, silakan pilih ulang.");
            }
        }
        scanner.close();
    }
 
    private static void tambahDataDiecast(Scanner scanner, ManajemenKoleksi manajemen) {
        System.out.println("\n--- TAMBAH DATA DIECAST ---");
        System.out.print("Kode Diecast: ");
        String kode = scanner.nextLine();
 
        if (manajemen.cariDiecast(kode) != null) {
            System.out.println(">> ERROR: Kode diecast sudah digunakan.");
            return;
        }
 
        System.out.print("Nama Diecast: ");
        String nama = scanner.nextLine();
 
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
 
        System.out.print("Skala (contoh 1:64): ");
        String skala = scanner.nextLine();
 
        System.out.print("Tahun Rilis: ");
        int tahun = scanner.nextInt();
        scanner.nextLine();
 
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
 
        manajemen.tampilkanKategori();
        System.out.print("Kode Kategori: ");
        String kodeKategori = scanner.nextLine();
        Kategori kategori = manajemen.cariKategori(kodeKategori);
 
        if (kategori == null) {
            System.out.println(">> INFO: Kategori tidak ditemukan, data disimpan tanpa kategori.");
        }
 
        Diecast diecast = new Diecast(kode, nama, merek, skala, tahun, harga, kategori);
        manajemen.tambahDiecast(diecast);
    }
 
    private static void cariDataDiecast(Scanner scanner, ManajemenKoleksi manajemen) {
        System.out.println("\n--- CARI DATA DIECAST ---");
        System.out.print("Masukkan kode diecast yang dicari: ");
        String kode = scanner.nextLine();
        Diecast hasil = manajemen.cariDiecast(kode);
 
        if (hasil != null) {
            System.out.println(">> Data ditemukan:");
            System.out.printf("%-8s | %-20s | %-10s | %-6s | %-5s | %-15s | %s\n",
                    "Kode", "Nama", "Merek", "Skala", "Tahun", "Harga", "Kategori");
            hasil.tampilkanInfo();
        } else {
            System.out.println(">> INFO: Data dengan kode tersebut tidak ditemukan.");
        }
    }
 
    private static void updateDataDiecast(Scanner scanner, ManajemenKoleksi manajemen) {
        System.out.println("\n--- UPDATE DATA DIECAST ---");
        System.out.print("Masukkan kode diecast yang akan diupdate: ");
        String kode = scanner.nextLine();
 
        if (manajemen.cariDiecast(kode) == null) {
            System.out.println(">> ERROR: Data tidak ditemukan.");
            return;
        }
 
        System.out.print("Nama Diecast baru: ");
        String nama = scanner.nextLine();
 
        System.out.print("Merek baru: ");
        String merek = scanner.nextLine();
 
        System.out.print("Skala baru: ");
        String skala = scanner.nextLine();
 
        System.out.print("Tahun Rilis baru: ");
        int tahun = scanner.nextInt();
        scanner.nextLine();
 
        System.out.print("Harga baru: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
 
        manajemen.tampilkanKategori();
        System.out.print("Kode Kategori baru: ");
        String kodeKategori = scanner.nextLine();
        Kategori kategori = manajemen.cariKategori(kodeKategori);
 
        boolean berhasil = manajemen.updateDiecast(kode, nama, merek, skala, tahun, harga, kategori);
        System.out.println(berhasil ? ">> SUCCESS: Data berhasil diupdate." : ">> ERROR: Update gagal.");
    }
 
    private static void hapusDataDiecast(Scanner scanner, ManajemenKoleksi manajemen) {
        System.out.println("\n--- HAPUS DATA DIECAST ---");
        System.out.print("Masukkan kode diecast yang akan dihapus: ");
        String kode = scanner.nextLine();
        boolean berhasil = manajemen.hapusDiecast(kode);
        System.out.println(berhasil ? ">> SUCCESS: Data berhasil dihapus." : ">> ERROR: Data tidak ditemukan.");
    }
 
    private static void tambahDataKategori(Scanner scanner, ManajemenKoleksi manajemen) {
        System.out.println("\n--- TAMBAH KATEGORI ---");
        System.out.print("Kode Kategori: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Kategori: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String deskripsi = scanner.nextLine();
 
        manajemen.tambahKategori(new Kategori(kode, nama, deskripsi));
    }
    private static int bacaAngkaInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print(">> INPUT: Masukkan angka yang valid. Pilih menu: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
