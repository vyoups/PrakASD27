package P6;

public class SortingMain27 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting27 dataurut1 = new Sorting27(a, a.length);
        System.out.println("Data awal 1 : ");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan Bubble Sort :     ");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting27 dataurut2 = new Sorting27(b, b.length);
        System.out.println("\nData awal 2 : ");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data setelah diurutkan dengan Selection Sort : ");
        dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        Sorting27 dataurut3 = new Sorting27(c, c.length);
        System.out.println("\nData awal 3 : ");     
        dataurut3.tampil();
        dataurut3.InsertionSort();
        System.out.println("Data setelah diurutkan dengan Insertion Sort : ");
        dataurut3.tampil();
    }
}
