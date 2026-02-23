package P1;

public class fungsi {

    static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * 75000) + (keladi * 50000) + (alocasia * 60000) + (mawar * 10000);
    }

    static String hitungStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("==================================================");
        System.out.println("         Laporan Pendapatan RoyalGarden");
        System.out.println("==================================================");
        System.out.printf("%-15s %-15s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("==================================================");

        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = hitungPendapatan(stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
            String status = hitungStatus(pendapatan);
            System.out.printf("%-15s Rp%-13d %-15s\n", cabang[i], pendapatan, status);
        }

        System.out.println("==================================================");
    }
}