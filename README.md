## Sistem Manajemen Koleksi Diecast

## Deskripsi Singkat Program:

Program ini adalah aplikasi Java untuk mengelola koleksi diecast (mainan miniatur kendaraan) seperti hotwheels, matchbox, mini gt. Dengan program ini, kamu bisa menambah, melihat, mengubah, dan menghapus data diecast beserta kategorinya.



## Penjelasan Alur Program

Saat program dijalankan, kamu akan melihat menu utama. Kamu tinggal pilih angka sesuai menu yang diinginkan lalu masukkan angka sesuai.

### A. Menu Diecast:
Di menu ini, kamu bisa manage data diecast yang ada.

1. **Tambah Data Diecast**
   - Kita bisa memasukkan kode, nama, merek, skala, tahun, harga, dan pilih kategorinya.
   - Data akan disimpan di ArrayList.
   - Program kemudian akan mengecek apakah kode sudah ada atau belum.

2. **Lihat Semua Data Diecast**
   - Program akan tampilkan tabel berisi semua diecast yang sudah kita tambahkan.
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

### B. Menu Kategori:
Di menu ini, kamu bisa atur kategori diecast dia ini masuk kategori jdm, edm atau semacemnya.

1. **Tambah Kategori**
   - Masukkan kode kategori, nama, sama deskripsi.
   - Data akan disimpan di ArrayList.

2. **Lihat Semua Kategori**
   - Program akan tampilkan semua kategori yang sudah ada.
   - Kalau belum ada, program kasih tahu lewat pesan.

3. **Kembali**
   - Balik ke menu utama.

### C. Keluar Program:
Pilih angka 0 di menu utama, program akan berhenti dan bilang "Terima kasih telah menggunakan program ini."


## Penjelasan Letak Penerapan Nilai Tambah

### A. Access Modifier (private & public):
Semua atribut di Kategori.java, Diecast.java, dan ManajemenKoleksi.java dibuat `private` agar tidak bisa langsung diakses. Data hanya bisa diakses lewat method `public` (getter & setter). ArrayList di ManajemenKoleksi juga `private` agar aman dari perubahan tiba tiba atau sembarangan.

### B. Encapsulation (Pembungkusan Data):
Constructor guna memanggil setter (bukan langsung assign/input nilai) supaya validasi jalan pas objek dibuat. Getter dan setter tidak hanya cuman membaca/mengubah nilai, tapi juga ada sedikit logika validasi di dalamnya.

### C. Validasi Input:
- **Main.java** — Method `bacaAngkaInt()` memastikan input menu harus angka
- **Diecast.java** — Setter validasi nama tidak kosong, tahun 1900-2100, harga tidak negatif
- **Kategori.java** — Setter validasi nama kategori tidak kosong
- **Main.java saat tambah** — Cek apakah kode diecast sudah ada atau belum


