package P6;

import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("--- Mahasiswa ke-" + i + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa27(nim, nama, kelas, ipk));
        }

        System.out.println("\nData sebelum sorting : ");
        list.tampil();

        list.bubbleSort();
        System.out.println("Data setelah Bubble Sort (DESC) : ");
        list.tampil();

        list.selectionSort();
        System.out.println("Data yang sudah terurut dengan Selection Sort (ASC) : ");
        list.tampil();

        list.insertionSort();
        System.out.println("Data yang sudah terurut dengan Insertion Sort (ASC) : ");
        list.tampil();
        sc.close();
    }
}