package P5;

class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;
 
    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}
 
public class NilaiMahasiswa {
 
    int maxUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) return arr[l].nilaiUTS;
 
        int mid = (l + r) / 2;
        int leftMax  = maxUTSDC(arr, l, mid);
        int rightMax = maxUTSDC(arr, mid + 1, r);
 
        return (leftMax > rightMax) ? leftMax : rightMax;
    }
 
    int minUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) return arr[l].nilaiUTS;
 
        int mid = (l + r) / 2;
        int leftMin  = minUTSDC(arr, l, mid);
        int rightMin = minUTSDC(arr, mid + 1, r);
 
        return (leftMin < rightMin) ? leftMin : rightMin;
    }
 
    double rataUASBF(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}
 

