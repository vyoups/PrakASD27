package P3;
import java.util.Scanner;

public class Matakuliahdemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah Matakuliah : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Matakuliah27[] arrayOfMatakuliah = new Matakuliah27[jumlah];
        
        String kode = null, nama = null;
        int sks = 0, jumlahJam = 0;

        for (int i = 0; i < 3; i++) {
        System.out.println("Masukan data matakuliah ke-" + (i+1));
        System.out.print("Kode       : "); kode = sc.nextLine();
        System.out.print("Nama       : "); nama = sc.nextLine();
        System.out.print("SKS        : "); sks = sc.nextInt();
        System.out.print("Jumlah Jam : "); jumlahJam = sc.nextInt(); sc.nextLine();
        arrayOfMatakuliah[i] = new Matakuliah27(kode, nama, sks, jumlahJam);
        System.out.println("-----------------------------");
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Data matakuliah ke-" + (i+1));
        arrayOfMatakuliah[i].cetakInfo();
        System.out.println("-----------------------------");
        
    }
        sc.close();
    }
}