package P12;

import java.util.Scanner;

public class DoubleLinkedListMain27 {

    public static Mahasiswa27 inputMahasiswa(Scanner scan) {

        System.out.print("NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa27(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DoubleLinkList27 list = new DoubleLinkList27();

        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Tambah Data Setelah NIM tertentu");
            System.out.println("4. Hapus Data Awal");
            System.out.println("5. Hapus Data Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Reverse"); 
            System.out.println("0. Keluar");

            System.out.print("Pilihan : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa27 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa27 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM tujuan : ");
                    String keyNim = scan.nextLine();

                    System.out.println("Masukkan data baru");
                    Mahasiswa27 data = inputMahasiswa(scan);

                    list.insertAfter(keyNim, data);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 0);

        scan.close();
    }
}