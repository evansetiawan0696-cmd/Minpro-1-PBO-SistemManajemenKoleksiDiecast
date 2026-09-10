/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Kategori {

    private String kodeKategori;
    private String namaKategori;
    private String deskripsi;

    public Kategori(String kodeKategori, String namaKategori, String deskripsi) {
        this.kodeKategori = kodeKategori;
        setNamaKategori(namaKategori); // Gunakan setter agar tervalidasi saat objek dibuat
        this.deskripsi = deskripsi;
    }

    public String getKodeKategori() {
        return kodeKategori;
    }

    public void setKodeKategori(String kodeKategori) {
        this.kodeKategori = kodeKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        // VALIDASI: nama kategori tidak boleh kosong
        if (namaKategori != null && !namaKategori.trim().isEmpty()) {
            this.namaKategori = namaKategori;
        } else {
            System.out.println(">> ERROR VALIDASI: Nama kategori tidak boleh kosong! Set ke 'Tanpa Nama'.");
            this.namaKategori = "Tanpa Nama";
        }
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void tampilkanInfo() {
        System.out.printf("%-6s | %-20s | %-30s\n", kodeKategori, namaKategori, deskripsi);
    }
}

