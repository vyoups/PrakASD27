package P7;

public class Peminjaman27 {
    Mahasiswa27 mhs;
    Buku27 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    
 
    public Peminjaman27(Mahasiswa27 mhs, Buku27 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }
 
    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
            if(buku.tahunTerbit <= 2020){ // untuk kondisi buku lama, denda dikurangi 50%
                denda = (int) (denda * 0.5); 
            }
        }
        else {
            terlambat = 0;
            denda = 0;
        }
    }
 
    public void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat + " | Denda: " + denda);
    }

    public static void insertionSort(Peminjaman27[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Peminjaman27 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static Peminjaman27[] sortByNim(Peminjaman27[] original) {
        Peminjaman27[] sorted = original.clone();
        int n = sorted.length;
        for (int i = 1; i < n; i++) {
            Peminjaman27 key = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }
        return sorted;
    }

    public static int binarySearchNim(Peminjaman27[] sorted, String nim) {
        int left = 0;
        int right = sorted.length - 1;

        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = sorted[mid].mhs.nim.compareTo(nim);
            if (cmp == 0) {
                result = mid;
                right = mid - 1;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
