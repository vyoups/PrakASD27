|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 10 Queue

## Hasil Running Praktikum ke-1
```
Masukkan kapasitas queue: 4
Masukan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Clear
--------------------------------
1
Masukkan data baru: 15
Masukan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Clear
--------------------------------
1
Masukkan data baru: 31
Masukan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Clear
--------------------------------
3
Elemen terdepan: 15
```
## Jawaban dari pertanyaan praktikum ke-1
1. front = rear = -1 menandakan queue belum memiliki elemen sama sekali (kondisi kosong). Indeks -1 dipakai sebagai sentinel/penanda bahwa belum ada posisi valid. Sedangkan size = 0 karena memang jumlah elemen yang tersimpan adalah nol. Saat elemen pertama masuk (enqueue), barulah front dan rear diset ke 0.
---
2. Ini adalah teknik Circular Queue. Ketika rear sudah di posisi paling akhir array (max - 1), daripada berhenti, rear kembali ke indeks 0. Tujuannya agar slot array yang sudah dikosongkan oleh dequeue bisa digunakan lagi, sehingga memori tidak terbuang percuma.
---
3. Sama seperti pada Enqueue, ini juga bagian dari mekanisme Circular Queue untuk front. Ketika elemen terdepan sudah berada di indeks terakhir (max - 1) dan dikeluarkan, maka front direset ke 0 agar pembacaan data berikutnya kembali dari awal array secara melingkar.
---
4. Karena pada Circular Queue, elemen pertama tidak selalu berada di indeks 0. Bisa saja setelah beberapa kali dequeue, front sudah bergeser ke indeks 3 misalnya. Jika dimulai dari 0, data yang ditampilkan akan salah (menampilkan slot kosong atau data yang sudah dihapus).
---
5. Ini adalah rumus pergerakan indeks secara melingkar (circular). Setiap iterasi, i maju satu langkah. Ketika i mencapai max - 1 (ujung array), operasi % max akan mengembalikannya ke 0, sehingga penelusuran bisa berlanjut dari awal array tanpa ArrayIndexOutOfBoundsException.
---
6. Queue overflow terjadi ketika method Enqueue dipanggil saat IsFull() bernilai true, yaitu ketika size == max. Program mendeteksi kondisi ini dan menolak penambahan data baru.
---

## Hasil dari praktikum ke-2
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI      
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.
```