package P1;
import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("======================");
        

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100){
            System.out.println("Nilai tidak valid!!");
            System.out.println("=======================");
            System.exit(0);
        }

        nilaiAkhir = ((0.2)*nilaiTugas + (0.2)*nilaiKuis + (0.3)*nilaiUTS + (0.3)*nilaiUAS);
        System.out.println("Nilai akhir : "+nilaiAkhir);

        if(nilaiAkhir >= 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
        }else if(nilaiAkhir >= 73 && nilaiAkhir < 80){
            nilaiHuruf = "B+";
        }else if(nilaiAkhir >= 65 && nilaiAkhir < 73){
            nilaiHuruf = "B";
        }else if(nilaiAkhir >= 60 && nilaiAkhir < 65){
            nilaiHuruf = "C+";
        }else if(nilaiAkhir >= 50 && nilaiAkhir < 60){
            nilaiHuruf = "C";
        }else if(nilaiAkhir >= 39 && nilaiAkhir < 50){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf :"+nilaiHuruf);
        System.out.println("======================");

        if(nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || 
           nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")){
            System.out.println("\nSELAMAT ANDA LULUS");
        }else{
            System.out.println("\nMAAF ANDA TIDAK LULUS");
        }
        System.out.println("======================");
        sc.close();
    }
}