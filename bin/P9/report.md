|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020238|
| Nama |  Rifat Marciano Putera |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/vyoups/PrakASD27

# Jobsheet 9 Stack

## Hasil Running Praktikum ke-1
```Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: dudung
NIM: 23456765432
Kelas: TI 1F
Tugas dudung berhasil dikumpulkan!
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Erik
NIM: 2332142536  
Kelas: TI 1A
Tugas Erik berhasil dikumpulkan!
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh: Erik

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: tika
NIM: 234567891
Kelas: TI 1C
Tugas tika berhasil dikumpulkan!
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar Tugas:
Nama    NIM     Kelas
dudung 23456765432 TI 1F
Erik 2332142536 TI 1A
tika 234567891 TI 1C


Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari tika
Masukan nilai (0-100): 87
Nilai tugas tika adalah 87

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar Tugas:
Nama    NIM     Kelas
dudung 23456765432 TI 1F
Erik 2332142536 TI 1A


Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
Pilih: 
```
## Jawaban dari pertanyaan praktikum ke-1
1. Tambahkan method main , Posisi whilenya salah
--- 
2. 5 data
```java
StackTugasMahasiswa27 stack = new StackTugasMahasiswa27(5);
```
---
3.  Untuk mencegah stack overflow. Yaitu kondisi ketika data dimasukkan melebihi kapasitas array.
java
---

## Hasil Running Praktikum ke-2
```
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
5. Hitung Jumlah Tugas
Pilih: 1
Nama: Tika
NIM: 12345
Kelas: TI 1F
Tugas Tika berhasil dikumpulkan!
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat Daftar Tugas
5. Hitung Jumlah Tugas
Pilih: 2
Menilai tugas dari Tika
Masukan nilai (0-100): 87
Nilai tugas Tika adalah 87
Niai biner tugas: 1010111

```
## Jawaban dari pertanyaan praktikum ke-2
1. Tahap 1: Nilai dibagi 2 terus, sisanya di-push ke stack. Jadi sisa-sisa itu nyimpen digit binernya dari yang paling kanan (LSB) dulu.
Tahap 2: Semua isi stack di-pop dan digabung jadi String. Karena stack itu LIFO, yang keluar duluan justru digit paling kiri (MSB), jadi urutannya udah bener otomatis.
---
2.  Kalau kondisi diubah jadi while (kode != 0)
Untuk input positif hasilnya sama aja, nggak ada bedanya. Tapi kalau inputnya negatif, while (nilai != 0) bisa jadi infinite loop karena nilai negatif dibagi 2 terus nggak bakal nyentuh 0. Sedangkan while (nilai > 0) lebih aman karena langsung berhenti kalau nilainya 0 atau negatif.


## Hasil Running Tugas 1
```
Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID Surat: 001
Nama Mahasiswa: RIska
Kelas: AB 1C
Jenis Izin (S=Sakit / I=Izin): S
Durasi (hari): 2
Surat dari RIska berhasil diterima.

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID Surat: 002
Nama Mahasiswa: Rifat
Kelas: TI 1F
Jenis Izin (S=Sakit / I=Izin): i
Durasi (hari): 2
Surat dari Rifat berhasil diterima.

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 3
Surat terakhir dari: Rifat
ID Surat  : 002
Kelas     : TI 1F
Jenis Izin: Izin
Durasi    : 2 hari

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 4
Masukkan nama mahasiswa: riska
Surat ditemukan!
ID Surat  : 001
Nama      : RIska
Kelas     : AB 1C
Jenis Izin: Sakit
Durasi    : 2 hari

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 2
Memproses surat dari: Rifat
Jenis Izin : Izin
Durasi     : 2 hari
Status     : Surat berhasil divalidasi.

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 2
Memproses surat dari: RIska
Jenis Izin : Sakit
Durasi     : 2 hari
Status     : Surat berhasil divalidasi.

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 5
Keluar dari program.
```