/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Diecast {
    
    private String kodeDiecast;
    private String namaDiecast;
    private String merek;
    private String skala;
    private int tahunRilis;
    private double harga;
    private Kategori kategori;

    public Diecast(String kodeDiecast, String namaDiecast, String merek, String skala,
                    int tahunRilis, double harga, Kategori kategori) {
        this.kodeDiecast = kodeDiecast;
        setNamaDiecast(namaDiecast);   
        this.merek = merek;
        this.skala = skala;
        setTahunRilis(tahunRilis);     
        setHarga(harga);               
        this.kategori = kategori;
    }

    public String getKodeDiecast() {
        return kodeDiecast;
    }

    public void setKodeDiecast(String kodeDiecast) {
        this.kodeDiecast = kodeDiecast;
    }

    public String getNamaDiecast() {
        return namaDiecast;
    }

    public void setNamaDiecast(String namaDiecast) {
        // VALIDASI: nama diecast tidak boleh kosong
        if (namaDiecast != null && !namaDiecast.trim().isEmpty()) {
            this.namaDiecast = namaDiecast;
        } else {
            System.out.println(">> ERROR VALIDASI: Nama diecast tidak boleh kosong! Set ke 'Tanpa Nama'.");
            this.namaDiecast = "Tanpa Nama";
        }
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getSkala() {
        return skala;
    }

    public void setSkala(String skala) {
        this.skala = skala;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        // VALIDASI: tahun rilis harus masuk akal
        if (tahunRilis >= 1900 && tahunRilis <= 2100) {
            this.tahunRilis = tahunRilis;
        } else {
            System.out.println(">> ERROR VALIDASI: Tahun rilis tidak valid (" + tahunRilis + ")! Diset ke 2000.");
            this.tahunRilis = 2000;
        }
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        // VALIDASI: harga tidak boleh negatif
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println(">> ERROR VALIDASI: Harga tidak boleh negatif (" + harga + ")! Diset ke 0.");
            this.harga = 0;
        }
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        String namaKategori = (kategori != null) ? kategori.getNamaKategori() : "-";
        System.out.printf("%-8s | %-20s | %-10s | %-6s | %-5d | Rp%-13.0f | %s\n",
                kodeDiecast, namaDiecast, merek, skala, tahunRilis, harga, namaKategori);
    }
}
