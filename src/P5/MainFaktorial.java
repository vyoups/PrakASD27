package P5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int nilai = sc.nextInt();

        BruteFoceDevideConquer fk = new  BruteFoceDevideConquer();
        System.out.println("Nilai Faktorial dengan Brute Force: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial dengan Divide Conquer: " + fk.faktorialDC(nilai));

        sc.close();
    }
}
