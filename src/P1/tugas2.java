package P1;

import java.util.Scanner;

public class tugas2 {

    static String[][] inputJadwal(int n, Scanner sc) {
        String[][] jadwal = new String[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Jadwal ke-" + (i + 1) + " ---");
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
        return jadwal;
    }

    static void tampilkanSemua(String[][] jadwal) {
        System.out.println("\n==============================================================");
        System.out.println("                   Seluruh Jadwal Kuliah");
        System.out.println("==============================================================");
        System.out.printf("%-5s %-30s %-10s %-10s %-12s\n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-5d %-30s %-10s %-10s %-12s\n",
                (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("==============================================================");
    }

    static void tampilkanByHari(String[][] jadwal, String hari) {
        System.out.println("\n==============================================================");
        System.out.println("          Jadwal Kuliah Hari: " + hari);
        System.out.println("==============================================================");
        System.out.printf("%-5s %-30s %-10s %-12s\n", "No", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("==============================================================");
        boolean ada = false;
        int no = 1;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-30s %-10s %-12s\n", no++, jadwal[i][0], jadwal[i][1], jadwal[i][3]);
                ada = true;
            }
        }
        if (!ada) System.out.println("Tidak ada jadwal pada hari " + hari);
        System.out.println("==============================================================");
    }

    static void tampilkanByMatkul(String[][] jadwal, String matkul) {
        System.out.println("\n==============================================================");
        System.out.println("     Jadwal Kuliah Mata Kuliah: " + matkul);
        System.out.println("==============================================================");
        System.out.printf("%-5s %-10s %-10s %-12s\n", "No", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");
        boolean ada = false;
        int no = 1;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-5d %-10s %-10s %-12s\n", no++, jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ada = true;
            }
        }
        if (!ada) System.out.println("Mata kuliah " + matkul + " tidak ditemukan.");
        System.out.println("==============================================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = inputJadwal(n, sc);

        tampilkanSemua(jadwal);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilkanByHari(jadwal, hari);

        System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
        String matkul = sc.nextLine();
        tampilkanByMatkul(jadwal, matkul);

        sc.close();
    }
}