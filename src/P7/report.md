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
--- Mahasiswa ke-1 ---
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.1
--- Mahasiswa ke-2 ---
NIM   : 222
Nama  : ila
Kelas : 2
IPK   : 3.2
--- Mahasiswa ke-3 ---
NIM   : 333
Nama  : lia
Kelas : 2
IPK   : 3.3
--- Mahasiswa ke-4 ---
NIM   : 444
Nama  : susi
Kelas : 2
IPK   : 3.5
--- Mahasiswa ke-5 ---
NIM   : 555
Nama  : anita
Kelas : 2
IPK   : 3.7
NIM : 111
Nama : adi
Kelas : 2
IPK : 3.1
-------------------
NIM : 222
Nama : ila
Kelas : 2
IPK : 3.2
-------------------
NIM : 333
Nama : lia
Kelas : 2
IPK : 3.3
-------------------
NIM : 444
Nama : susi
Kelas : 2
IPK : 3.5
-------------------
NIM : 555
Nama : anita
Kelas : 2
IPK : 3.7
-------------------
--------------------
Pencarian Data
---------------------
masukan ipk mahasiswa yang dicari: 
IPK : 3.7
--------------------
Menggunakan Binary Search
---------------------
data mahasiswa dengan IPK : 3.7 ditemukan pada index : 4
NIM : 555
Nama : anita
IPK : 3.7
```

## Jawaban dari pertanyaan praktikum ke-2
1. ```
    mid = (left + right) / 2;
    ```
    ---
2. ```
    else if (listMhs[mid].ipk > cari) {
        return findBinarySearch(cari, left, mid - 1);  // cari di bagian kiri
    } else {
        return findBinarySearch(cari, mid + 1, right); // cari di bagian kanan
    }
    ```
    ---
3.  - left → batas indeks paling kiri dari rentang array yang sedang ditelusuri. Awalnya bernilai 0.
    - right → batas indeks paling kanan dari rentang array yang sedang ditelusuri. Awalnya bernilai n-1.
    - mid → indeks tengah yang dihitung dari (left + right) / 2. Digunakan sebagai titik perbandingan untuk menentukan apakah pencarian dilanjutkan ke kiri atau ke kanan.
    ---
4. Program tetap bisa berjalan (tidak error), namun hasilnya bisa salah atau data tidak ditemukan meskipun sebenarnya ada. Binary search mengasumsikan data sudah terurut. Jika tidak urut, logika perbandingan left dan right yang mempersempit rentang pencarian menjadi tidak valid — program bisa "salah arah" membuang sisi yang justru berisi data yang dicari, sehingga mengembalikan -1 (tidak ditemukan) secara keliru. 
---

5. Hasilnya tidak akan ditemukan (return -1). Karena kode asli mengasumsikan data urut ascending, sedangkan data dimasukkan secara descending. Pada kondisi ini ketika listMhs[mid].ipk > cari, program akan mencari ke kiri — padahal data yang lebih kecil justru ada di kanan.
    ```
    int findBinarySearch(double cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk) {
            return mid;
        } else if (listMhs[mid].ipk < cari) {
            // data descending: yang lebih besar ada di KIRI
            return findBinarySearch(cari, left, mid - 1);
        } else {
            // yang lebih kecil ada di KANAN
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
        }
    ```
    ---

6. Binary search menentukan data tidak ditemukan ketika kondisi right >= left tidak lagi terpenuhi, yaitu saat right < left. Ini berarti rentang pencarian sudah habis dipersempit hingga tidak ada elemen tersisa untuk diperiksa, namun tidak ada yang cocok. Pada titik itu fungsi mengembalikan nilai -1 sebagai tanda data tidak ada dalam array.

    ---