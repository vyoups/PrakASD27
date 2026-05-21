package P11;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        QueueLayanan antrian = new QueueLayanan();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Sistem Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Cek Antrian Terdepan");
            System.out.println("5. Cek Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : "); String nim  = sc.nextLine();
                    System.out.print("Nama   : "); String nama = sc.nextLine();
                    System.out.print("Kelas  : "); String kls  = sc.nextLine();
                    System.out.print("IPK    : "); double ipk  = sc.nextDouble(); sc.nextLine();
                    antrian.enqueue(new Mahasiswa27(nim, nama, kls, ipk));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilSemua();
                    break;
                case 4:
                    antrian.tampilDepan();
                    break;
                case 5:
                    antrian.tampilBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 8:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);

        sc.close();
    }
}
