package P6;

import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27(jumlah); 

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("--- Mahasiswa ke-" + i + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            // sc.nextLine(); ← DIHAPUS

            list.tambah(new Mahasiswa27(nim, nama, kelas, ipk));
        }

        // System.out.println("\nData sebelum sorting : ");
        // list.tampil();

        // list.bubbleSort();
        // System.out.println("Data setelah Bubble Sort (DESC) : ");
        // list.tampil();

        // list.selectionSort();
        // System.out.println("Data yang sudah terurut dengan Selection Sort (ASC) : ");
        // list.tampil();

        // list.insertionSort();
        // System.out.println("Data yang sudah terurut dengan Insertion Sort (ASC) : ");
        // list.tampil();
        list.tampil();
        System.out.println("--------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------");
        System.out.println("masukan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        System.out.println("--------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah - 1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        // System.out.println("menggunakan sequential search");
        // double posisi = list.sequentialSearch(cari);
        // int pss= (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        sc.close();
    }
}