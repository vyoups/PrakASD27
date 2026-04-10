package P7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Mahasiswa27[] dataMhs = {
            new Mahasiswa27("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa27("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa27("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku27[] dataBuku = {
            new Buku27("B001", "Algoritma", 2020),
            new Buku27("B002", "Basis Data", 2019),
            new Buku27("B003", "Pemrograman", 2021),
            new Buku27("B004", "Fisika", 2024)
        };

        Peminjaman27[] dataPeminjaman = {
            new Peminjaman27(dataMhs[0], dataBuku[0], 7),   
            new Peminjaman27(dataMhs[1], dataBuku[1], 3),   
            new Peminjaman27(dataMhs[2], dataBuku[2], 10),  
            new Peminjaman27(dataMhs[2], dataBuku[3], 6),  
            new Peminjaman27(dataMhs[0], dataBuku[1], 4)    
        };

        Scanner sc = new Scanner(System.in);
        int pilih = -1;

        while (pilih != 0) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa27 m : dataMhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku27 b : dataBuku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman27 p : dataPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    Peminjaman27[] sorted = dataPeminjaman.clone();
                    Peminjaman27.insertionSort(sorted);
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman27 p : sorted) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.next();

                    Peminjaman27[] sortedByNim = Peminjaman27.sortByNim(dataPeminjaman);

                    int idx = Peminjaman27.binarySearchNim(sortedByNim, nimCari);

                    if (idx == -1) {
                        System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
                    } else {
                        System.out.println("\nHasil pencarian NIM: " + nimCari);
                        for (int i = idx; i < sortedByNim.length; i++) {
                            if (sortedByNim[i].mhs.nim.equals(nimCari)) {
                                sortedByNim[i].tampilPeminjaman();
                            } else {
                                break;
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}