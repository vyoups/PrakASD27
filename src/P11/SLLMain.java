package P11;

import java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("-- Mahasiswa ke-" + i + " --");
            System.out.print("NIM   : "); String nim  = sc.nextLine();
            System.out.print("Nama  : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kls  = sc.nextLine();
            System.out.print("IPK   : "); double ipk  = sc.nextDouble(); sc.nextLine();
            sll.addLast(new Mahasiswa27(nim, nama, kls, ipk));
        }

        sll.print();
        sc.close();
    }
}