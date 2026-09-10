/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ManajemenKoleksi {
   
    
    private ArrayList<Diecast> daftarDiecast;
    private ArrayList<Kategori> daftarKategori;

    // CONSTRUCTOR
    public ManajemenKoleksi() {
        daftarDiecast = new ArrayList<>();
        daftarKategori = new ArrayList<>();
    }

    // METHOD KATEGORI
    public void tambahKategori(Kategori kategori) {
        daftarKategori.add(kategori);
        System.out.println(">> SUCCESS: Kategori berhasil ditambahkan.");
    }

    public void tampilkanKategori() {
        if (daftarKategori.isEmpty()) {
            System.out.println(">> INFO: Belum ada kategori.");
            return;
        }
        System.out.println("=== Daftar Kategori ===");
        for (Kategori k : daftarKategori) {
            k.tampilkanInfo();
        }
    }

    public Kategori cariKategori(String kode) {
        for (Kategori k : daftarKategori) {
            if (k.getKodeKategori().equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }

    // CREATE
    public void tambahDiecast(Diecast diecast) {
        daftarDiecast.add(diecast);
        System.out.println(">> SUCCESS: Data diecast berhasil ditambahkan.");
    }

    // READ 
    public void tampilkanSemuaDiecast() {
        if (daftarDiecast.isEmpty()) {
            System.out.println(">> INFO: Koleksi diecast masih kosong.");
            return;
        }
        System.out.println("=== Koleksi Diecast ===");
        System.out.printf("%-8s | %-20s | %-10s | %-6s | %-5s | %-15s | %s\n",
                "Kode", "Nama", "Merek", "Skala", "Tahun", "Harga", "Kategori");
        System.out.println("--------+-----------------------+------------+--------+-------+-----------------+--------");
        for (Diecast d : daftarDiecast) {
            d.tampilkanInfo();
        }
    }

    // READ
    public Diecast cariDiecast(String kode) {
        for (Diecast d : daftarDiecast) {
            if (d.getKodeDiecast().equalsIgnoreCase(kode)) {
                return d;
            }
        }
        return null;
    }

    // UPDATE
    public boolean updateDiecast(String kode, String namaBaru, String merekBaru, String skalaBaru,
                                  int tahunBaru, double hargaBaru, Kategori kategoriBaru) {
        Diecast d = cariDiecast(kode);
        if (d == null) {
            return false;
        }
        d.setNamaDiecast(namaBaru);
        d.setMerek(merekBaru);
        d.setSkala(skalaBaru);
        d.setTahunRilis(tahunBaru);
        d.setHarga(hargaBaru);
        d.setKategori(kategoriBaru);
        return true;
    }

    // DELETE
    public boolean hapusDiecast(String kode) {
        Diecast d = cariDiecast(kode);
        if (d == null) {
            return false;
        }
        daftarDiecast.remove(d); // HANYA BUTUH 1 KALI REMOVE OBJEK
        return true;
    }
}
