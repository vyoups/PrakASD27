package P1;
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.print("Masukan 2 angka NIM terakhir anda : ");
        n = sc.nextInt();
        
        while (n < 10) {
            n += 10;
            System.out.println(n);
        }
        
        for (int i = 0; i < n; i++) {
            if (i == 10 || i == 15) {
                continue; 
            }
            
            if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
        
        sc.close();
    }
}