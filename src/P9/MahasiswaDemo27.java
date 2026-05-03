package P9;
import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        StackTugasMahasiswa27 stack = new StackTugasMahasiswa27(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Hitung Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa27 mhs = new Mahasiswa27(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan!", mhs.nama);
                    break;
                case 2:
                    Mahasiswa27 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d%n", dinilai.nama, dinilai.nilai);
                    }
                    break;
                case 3:
                    Mahasiswa27 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh: %s%n", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    int jumlahTugas = stack.hitungTugas();
                    System.out.printf("Jumlah tugas yang telah dikumpulkan: %d%n", jumlahTugas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4); 
        sc.close();
    }
}