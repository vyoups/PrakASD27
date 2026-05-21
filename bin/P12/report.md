|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 12 Double Linked List

## Hasil Running Praktikum ke-1
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
0. Keluar
Pilihan : 2
NIM   : 123005
Nama  : Harry
Kelas : 1A
IPK   : 3.76
Data berhasil ditambahkan di akhir

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
0. Keluar
Pilihan : 3
Masukkan NIM tujuan : 123005
Masukkan data baru
NIM   : 123010
Nama  : Potter
Kelas : 1B
IPK   : 3.55
Data berhasil disisipkan

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
0. Keluar
Pilihan : 6
NIM   : 123005
Nama  : Harry
Kelas : 1A
IPK   : 3.76
NIM   : 123010
Nama  : Potter
Kelas : 1B
IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
0. Keluar
Pilihan : 0
Program selesai
```
## Jawaban dari pertanyaan praktikum ke-1
1. Single Linked List adalah linked list yang setiap node hanya memiliki satu pointer yaitu next, sehingga traversal hanya bisa dilakukan dari depan ke belakang. Sedangkan Double Linked List memiliki dua pointer yaitu next dan prev, sehingga traversal dapat dilakukan dari depan ke belakang maupun dari belakang ke depan. Selain itu, proses penyisipan dan penghapusan node pada Double Linked List lebih mudah karena node memiliki akses ke node sebelumnya dan sesudahnya.
---
2. Atribut next digunakan untuk menyimpan alamat node berikutnya sehingga proses traversal maju dapat dilakukan. Sedangkan atribut prev digunakan untuk menyimpan alamat node sebelumnya sehingga traversal mundur dapat dilakukan. Kedua atribut tersebut juga membantu dalam proses penambahan, penyisipan, dan penghapusan node agar hubungan antar node tetap terhubung dengan benar.
---
3. Konstruktor pada class DoubleLinkedList berfungsi untuk menginisialisasi linked list dalam keadaan kosong dengan memberikan nilai null pada head dan tail. Hal ini menunjukkan bahwa belum ada node yang tersimpan di dalam linked list saat objek pertama kali dibuat.
---
4. Karena saat linked list masih kosong dan hanya memiliki satu node, maka node tersebut menjadi node pertama sekaligus node terakhir. Oleh karena itu, head dan tail harus menunjuk ke node yang sama agar linked list dapat dikenali dengan benar.
---

## Hasil Running Dari Praktikum ke-2 
```
==== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
7. Tampilkan Reverse
0. Keluar
Pilihan : 5
Data akhir berhasil dihapus

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
7. Tampilkan Reverse
0. Keluar
Pilihan : 6
NIM   : 123005
Nama  : Harry
Kelas : 1A
IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data di Awal
2. Tambah Data di Akhir
3. Tambah Data Setelah NIM tertentu
4. Hapus Data Awal
5. Hapus Data Akhir
6. Tampilkan Data
7. Tampilkan Reverse
0. Keluar
Pilihan : 0
Program selesai
```

## Jawaban dari pertanyaan praktikum ke-2
1. - Statement head = head.next; digunakan untuk memindahkan posisi head ke node berikutnya setelah node pertama dihapus. Dengan demikian, node kedua akan menjadi node pertama yang baru pada linked list.

- Sedangkan statement head.prev = null; digunakan untuk menghapus hubungan antara node baru dengan node lama yang sebelumnya berada di depan. Hal ini dilakukan agar node pertama yang sudah dihapus tidak lagi terhubung dengan linked list.
---
