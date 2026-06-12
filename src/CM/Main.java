package CM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPembeli antrian = new AntrianPembeli();
        DaftarPesanan pesanan = new DaftarPesanan();

        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap Pesanan per Menu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahAntrian(sc, antrian);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    hapusAntrianDanPesan(sc, antrian, pesanan);
                    break;
                case 4:
                    pesanan.cetakLaporan();
                    break;
                case 5: // Rekap pesanan per menu
                    LinkedListRekap rekap = new LinkedListRekap();
                    NodePesanan curr = pesanan.getHead();
                    while (curr != null) {
                        rekap.updateRekap(curr.namaPesanan);
                        curr = curr.next;
                    }
                    rekap.cetakRekap();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }

    static void tambahAntrian(Scanner sc, AntrianPembeli antrian) {
        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine();
        System.out.print("No HP        : ");
        String noHp = sc.nextLine();
        int noAntrian = antrian.tambahAntrian(nama, noHp);
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
    }

    static void hapusAntrianDanPesan(Scanner sc, AntrianPembeli antrian, DaftarPesanan pesanan) {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        antrian.cetakAntrian();
        System.out.print("Masukkan No Antrian yang dipanggil: ");
        int noAntrian = sc.nextInt();
        sc.nextLine();

        if (!antrian.adaAntrian(noAntrian)) {
            System.out.println("Nomor antrian tidak ditemukan.");
            return;
        }

        String namaPembeli = antrian.getNamaPembeli(noAntrian);

        System.out.print("Kode Pesanan  : ");
        int kode = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan  : ");
        String namaPesanan = sc.nextLine();
        System.out.print("Harga         : ");
        int harga = sc.nextInt();
        sc.nextLine();

        antrian.hapusAntrian(noAntrian);
        pesanan.tambahPesanan(kode, namaPesanan, harga, namaPembeli);
        System.out.println(namaPembeli + " telah memesan " + namaPesanan);
    }
}
