## Sistem Manajemen Koleksi Diecast

## 1. Deskripsi Singkat Program

Program ini adalah aplikasi Java untuk mengelola koleksi diecast (miniatur kendaraan). Dengan program ini, kamu bisa menambah, melihat, mengubah, dan menghapus data diecast beserta kategorinya. Program menggunakan konsep OOP dan dirancang dengan struktur yang rapi menggunakan package dan class.

---

## 2. Penjelasan Alur Program

Saat program dijalankan, kamu akan melihat menu utama. Kamu tinggal pilih angka sesuai menu yang diinginkan.

### A. Menu Diecast
Di menu ini, kamu bisa manage data diecast yang ada.

1. **Tambah Data Diecast**
   - Masukkan kode, nama, merek, skala, tahun, harga, dan pilih kategorinya.
   - Data akan disimpan di ArrayList.
   - Program akan cek apakah kode sudah ada atau belum.

2. **Lihat Semua Data Diecast**
   - Program akan tampilkan tabel berisi semua diecast yang sudah ditambahkan.
   - Kalau belum ada data, program kasih tau lewat pesan.

3. **Cari Data Diecast**
   - Masukkan kode diecast yang mau dicari.
   - Sistem akan cari dan tampilkan data yang cocok.

4. **Ubah Data Diecast**
   - Masukkan kode diecast yang mau diubah.
   - Lalu masukkan data baru yang diinginkan.
   - Data di ArrayList akan terupdate.

5. **Hapus Data Diecast**
   - Masukkan kode diecast yang mau dihapus.
   - Sistem akan hapus dari ArrayList.
   - Kalau kode tidak ketemu, program kasih tahu lewat pesan error.

6. **Kembali**
   - Balik ke menu utama.

### B. Menu Kategori
Di menu ini, kamu bisa atur kategori diecast.

1. **Tambah Kategori**
   - Masukkan kode kategori, nama, sama deskripsi.
   - Data akan disimpan di ArrayList.

2. **Lihat Semua Kategori**
   - Program akan tampilkan semua kategori yang sudah ada.
   - Kalau belum ada, program kasih tahu lewat pesan.

3. **Kembali**
   - Balik ke menu utama.

### C. Keluar Program
Pilih angka 0 di menu utama, program akan berhenti dan bilang "Terima kasih telah menggunakan program ini."

---
