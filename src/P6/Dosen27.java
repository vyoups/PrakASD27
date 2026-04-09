package P6;

public class Dosen27 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    Dosen27(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    Dosen27() {
    }

    void tampil() {
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("JK     : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia   : " + usia);
        System.out.println("------------------------------");
    }

    Dosen27[] dataDosen = new Dosen27[10];
    int idx;

    void tambah(Dosen27 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampilData() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort ASC (usia termuda ke tertua)
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen27 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    // Selection Sort DSC (usia tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen27 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    // Insertion Sort ASC
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen27 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}