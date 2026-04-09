package P6;

import java.util.Scanner;

public class DosenMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen27 dd = new Dosen27();
        int pilihan;

        do {
            System.out.println("\n====== MENU DATA DOSEN ======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda - Tertua) [Bubble Sort]");
            System.out.println("4. Sorting DSC (Usia Tertua - Termuda) [Selection Sort]");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    Dosen27 d = new Dosen27(kode, nama, jk, usia);
                    dd.tambah(d);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n=== DATA DOSEN ===");
                    dd.tampilData();
                    break;

                case 3:
                    dd.SortingASC();
                    System.out.println("\nData berhasil diurutkan ASC (Termuda ke Tertua):");
                    dd.tampilData();
                    break;

                case 4:
                    dd.sortingDSC();
                    System.out.println("\nData berhasil diurutkan DSC (Tertua ke Termuda):");
                    dd.tampilData();
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}