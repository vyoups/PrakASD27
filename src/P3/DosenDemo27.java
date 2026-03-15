package P3;

import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen27[] arrayOfDosen = new Dosen27[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (1=Pria / 0=Wanita) : ");
            Boolean jenisKelamin = sc.nextLine().trim().equals("1");
            System.out.print("Usia           : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen27(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen27 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode           : " + d.kode);
            System.out.println("Nama           : " + d.nama);
            System.out.println("Jenis Kelamin  : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }

        sc.close();
    }
}