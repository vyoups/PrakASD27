package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");

        String namaMatkul[] = {"Pancasia", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", 
                                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
                                "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double nilaiMatkul[] = new double[namaMatkul.length];
        int sks[] = {2, 2, 3, 2, 2, 2, 2, 2};

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("masukkan nilai untuk MK " + namaMatkul[i] + ": ");
            nilaiMatkul[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("=======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s %-12s %-12s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < nilaiMatkul.length; i++) {
            String nilaiHuruf;
            double nilaiBobot = 0;

            if (nilaiMatkul[i] >= 80 && nilaiMatkul[i] <= 100) {
                nilaiHuruf = "A";   nilaiBobot = 4.0;
            } else if (nilaiMatkul[i] >= 73 && nilaiMatkul[i] < 80) {
                nilaiHuruf = "B+";  nilaiBobot = 3.5;
            } else if (nilaiMatkul[i] >= 65 && nilaiMatkul[i] < 73) {
                nilaiHuruf = "B";   nilaiBobot = 3.0;
            } else if (nilaiMatkul[i] >= 60 && nilaiMatkul[i] < 65) {
                nilaiHuruf = "C+";  nilaiBobot = 2.5;
            } else if (nilaiMatkul[i] >= 50 && nilaiMatkul[i] < 60) {
                nilaiHuruf = "C";   nilaiBobot = 2.0;
            } else if (nilaiMatkul[i] >= 39 && nilaiMatkul[i] < 50) {
                nilaiHuruf = "D";   nilaiBobot = 1.0;
            } else {
                nilaiHuruf = "E";   nilaiBobot = 0.0;
            }

            totalNilai += nilaiBobot * sks[i];
            totalSKS += sks[i];

            System.out.printf("%-40s %-12.2f %-12s %-10.2f\n", namaMatkul[i], nilaiMatkul[i], nilaiHuruf, nilaiBobot);
        }

        System.out.println("=======================");
        double ipSemester = totalNilai / totalSKS;
        System.out.printf("IP : %.2f\n", ipSemester);

        sc.close();
    }
}