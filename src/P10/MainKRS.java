package P10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian Saat Ini");
            System.out.println("7. Jumlah yang Sudah Proses KRS");
            System.out.println("8. Jumlah yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : "); String nim   = sc.nextLine();
                    System.out.print("Nama  : "); String nama  = sc.nextLine();
                    System.out.print("Prodi : "); String prodi = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS: " + antrian.jumlahDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah yang belum proses KRS: " + antrian.jumlahBelumKRS());
                    System.out.println("Sisa kuota DPA: " + (antrian.MAX_DPA - antrian.jumlahDilayani()));
                    break;
                case 9:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}