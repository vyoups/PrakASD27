|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 11 Linked List

## Hasil Running Praktikum ke-1
```
Linked list kosong
Isi Linked List:
Dirga      21212203     4D    3.6

Isi Linked List:
Dirga      21212203     4D    3.6
Alvaro     24212200     1A    4.0

Isi Linked List:
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5
Alvaro     24212200     1A    4.0
```
## Pertanyaan Dari Praktikum ke-1
1. Karena sll.print() dipanggil sebelum data apapun ditambahkan. Saat itu head == null, jadi kondisi isEmpty() bernilai true dan program langsung masuk ke blok else yang mencetak "Linked list kosong".
---
2. temp adalah pointer sementara yang digunakan untuk traverse (menelusuri) linked list dari node ke node berikutnya tanpa mengubah posisi head. Kalau kita langsung geser head, kita kehilangan referensi ke awal list. Dengan temp, kita bisa jalan-jalan di list dengan aman.
---

## Hasil running Praktikum ke-2
```
Data index 1 : 
Cintia     22212202     3C    3.5
data mahasiswa an Bimon berada pada index : 2
Isi Linked List:
Cintia     22212202     3C    3.5
Bimon      23212201     2B    3.8

Isi Linked List:
Bimon      23212201     2B    3.8

```

## Pertanyaan Untuk Praktikum ke-2
1. Karena begitu node yang cocok ditemukan dan dihapus, pencarian harus langsung dihentikan. Tanpa break, loop akan terus jalan ke node berikutnya yang sudah tidak valid (karena pointer sudah diputus), yang bisa menyebabkan error atau penghapusan yang salah.
---
2. - temp.next = temp.next.next → ini yang "menghapus" node target. Node sebelumnya (temp) langsung nyambung ke node dua langkah depan, sehingga node target tidak bisa diakses lagi (ter-skip). 
- if (temp.next == null) { tail = temp; } → setelah skip, kalau ternyata temp sekarang jadi node terakhir (next-nya null), maka tail harus diupdate ke temp. Ini penting supaya tail selalu nunjuk ke node paling belakang.

## Hasil Running Tugas
```
=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 1
NIM    : 123
Nama   : Riska
Kelas  : 1C
IPK    : 2.9
Mahasiswa Riska berhasil masuk antrian.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 1
NIM    : 124
Nama   : Rifat
Kelas  : 1F
IPK    : 3.6
Mahasiswa Rifat berhasil masuk antrian.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 3
=== Daftar Antrian ===
1. Riska      123          1C    2.9
2. Rifat      124          1F    3.6
Total: 2 mahasiswa


=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 4
Antrian terdepan: Riska      123          1C    2.9

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 5
Antrian paling akhir: Rifat      124          1F    3.6

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 6
Jumlah antrian: 2

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 7
Antrian tidak kosong.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 8
Antrian belum penuh.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 2
Memanggil: 
Riska      123          1C    2.9

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 3
=== Daftar Antrian ===
1. Rifat      124          1F    3.6
Total: 1 mahasiswa


=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 9
Antrian berhasil dikosongkan.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 3
Antrian kosong.

=== Sistem Antrian Unit Kemahasiswaan ===
1. Daftar Antrian
2. Panggil Antrian
3. Tampilkan Semua Antrian
4. Cek Antrian Terdepan
5. Cek Antrian Terakhir
6. Cek Jumlah Antrian
7. Cek Antrian Kosong
8. Cek Antrian Penuh
9. Kosongkan Antrian
0. Keluar
Pilihan: 0
Keluar.

```