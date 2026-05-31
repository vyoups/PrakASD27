|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 14 Double Linked List

## Hasil Running Praktikum ke-1
```
Daftar semua mahasiswa (in oder traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
```
## Jawaban dari pertanyaan praktikum ke-1
1. Karena BST punya aturan node kiri selalu lebih kecil, node kanan selalu lebih besar dari parent-nya. Jadi saat mencari, kita bisa langsung memutuskan mau ke kiri atau kanan, sehingga tidak perlu mengecek semua node. Binary tree biasa tidak punya aturan urutan, jadi pencarian harus mengecek semua node satu per satu.
---
2. left menunjuk ke node anak kiri (IPK lebih kecil), dan right menunjuk ke node anak kanan (IPK lebih besar). Kedua atribut inilah yang membentuk struktur pohon/tree karena setiap node bisa terhubung ke maksimal 2 node lainnya.
---
3. A. left menunjuk ke node anak kiri (IPK lebih kecil), dan right menunjuk ke node anak kanan (IPK lebih besar). Kedua atribut inilah yang membentuk struktur pohon/tree karena setiap node bisa terhubung ke maksimal 2 node lainnya.

- B. null, karena di konstruktor BinaryTree() diisi root = null, artinya tree masih kosong.
---
4. Method add() memanggil isEmpty() yang mengecek apakah root == null. Karena kosong, node baru langsung dijadikan root. Tree yang tadinya kosong sekarang punya 1 node sebagai akar.
---
5. parent = current → menyimpan posisi node saat ini sebagai parent, karena kalau current bergerak ke bawah dan ternyata null, kita butuh parent untuk menempelkan node baru.

- Jika IPK mahasiswa baru lebih kecil, gerak ke kiri (current = current.left). Kalau posisi kiri kosong (null), tempelkan node baru di sana (parent.left = newNode) lalu return.

- Jika IPK mahasiswa baru lebih besar atau sama, gerak ke kanan (current = current.right). Kalau posisi kanan kosong, tempelkan di sana (parent.right = newNode) lalu return.


## Hasil Running Praktikum ke-2
```
Inorder Traversal Mahasiswa:
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
```
## Jawaban dari pertanyaan praktikum ke-1
1. dataMahasiswa → array yang menyimpan semua node tree
- idxLast → menyimpan indeks terakhir yang terisi, digunakan sebagai batas agar traversal tidak melewati data yang ada
---
2. Untuk mengisi array dataMahasiswa dan nilai idxLast dari luar class. Jadi data tree bisa dimasukkan sekaligus dari main() tanpa harus add satu per satu.
---
3. Untuk menampilkan semua data mahasiswa dalam tree secara terurut (kiri → root → kanan). Karena data di array disusun seperti struktur pohon, traversal inOrder menghasilkan urutan dari nilai terkecil ke terbesar.
---
4. Left = 5, Right = 6
---
5. Menandakan bahwa data terakhir yang valid ada di indeks 6. Jadi saat traversal, proses berhenti di indeks 6 dan tidak lanjut ke indeks 7, 8, 9 yang isinya null. Kalau tanpa ini, traversal bisa error karena mencoba akses data null.
---
6. Rumus standar untuk menemukan posisi child di binary tree berbasis array
---

## Hasil Running Tugas
```
=== TUGAS 1: addRekursif ===
InOrder setelah addRekursif:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

=== TUGAS 2: cariMinIPK & cariMaxIPK ===
Mahasiswa dengan IPK terkecil:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
Mahasiswa dengan IPK terbesar:
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

=== TUGAS 3: tampilMahasiswaIPKdiAtas ===
Mahasiswa dengan IPK di atas 3.5:
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

=== TUGAS 4: BinaryTreeArray add & traversePreOrder ===
PreOrder Traversal (Array):
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86

InOrder Traversal (Array):
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
```