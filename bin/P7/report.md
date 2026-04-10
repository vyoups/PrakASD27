|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 7 SEARCHING  

## Hasil Running Praktikum ke-1
Hasilnya menunjukan program dapat dijalankan
```
--- Mahasiswa ke-1 ---
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.6
--- Mahasiswa ke-2 ---
NIM   : 222
Nama  : tio
Kelas : 2
IPK   : 3.8
--- Mahasiswa ke-3 ---
NIM   : 33
Nama  : ila
Kelas : 2
IPK   : 3.0
--- Mahasiswa ke-4 ---
NIM   : 444
Nama  : lia
Kelas : 2
IPK   : 3.5
--- Mahasiswa ke-5 ---
NIM   : 555
Nama  : fia
Kelas : 2
IPK   : 3.3
NIM : 111
Nama : adi
Kelas : 2
IPK : 3.6
-------------------
NIM : 222
Nama : tio
Kelas : 2
IPK : 3.8
-------------------
NIM : 33
Nama : ila
Kelas : 2
IPK : 3.0
-------------------
NIM : 444
Nama : lia
Kelas : 2
IPK : 3.5
-------------------
NIM : 555
Nama : fia
Kelas : 2
IPK : 3.3
-------------------
--------------------
Pencarian Data
---------------------
masukan ipk mahasiswa yang dicari: 
IPK : 3.5
menggunakan sequential search
data mahasiswa dengan IPK : 3.5 ditemukan pada index : 3
NIM : 444
Nama : lia
IPK : 3.5
```
## Jawaban dari pertanyaan praktikum ke-1
1. - tampilPosisi hanya menampilkan informasi posisi/indeks di mana data ditemukan, tanpa menampilkan detail datanya. Contoh output: "data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3".

    - Sedangkan tampilDataSearch menampilkan detail lengkap data mahasiswa (nim, nama, kelas, ipk) yang ditemukan pada indeks tersebut. Keduanya sama-sama menerima parameter pos untuk mengecek apakah data ditemukan (pos != -1) atau tidak.

 ---

 2. break berfungsi untuk menghentikan perulangan for lebih awal begitu data yang dicari sudah ditemukan. Tanpa break, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ketemu, yang berarti membuang waktu komputasi. Dengan break, program langsung keluar dari loop sehingga lebih efisien.

 ---

 3. Variabel pos berfungsi sebagai penanda lokasi (indeks array) di mana data yang dicari ditemukan. Nilai awalnya -1 sebagai tanda bahwa data belum/tidak ditemukan. Jika data ditemukan, pos diisi dengan nilai indeks j tempat data tersebut berada. Nilai pos ini kemudian digunakan oleh method tampilPosisi dan tampilDataSearch untuk menentukan apakah data berhasil ditemukan atau tidak, serta untuk mengakses elemen listMhs[pos].

 ---

 4. Akan menampilkan data yang pertama kali ditemukan (indeks terkecil). Karena pada sequential search loop berjalan dari indeks 0 ke atas, dan begitu data pertama yang cocok ditemukan langsung dieksekusi break sehingga loop berhenti. Data kedua yang nilainya sama tidak akan pernah dicapai.

---

5. Jika break dihapus, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ditemukan di tengah. Akibatnya, jika ada lebih dari satu data dengan nilai IPK yang sama, variabel posisi akan terus ditimpa (overwrite) dengan indeks yang lebih baru. Sehingga hasil akhirnya bukan data pertama yang ditemukan, melainkan data terakhir yang memiliki nilai sama. Selain itu, performa menjadi lebih buruk karena tidak ada early exit.

---

## Hasil Running Praktikum ke-2
Hasilnya menunjukan program dapat dijalankan
```

```