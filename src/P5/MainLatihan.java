package P5;

public class MainLatihan {
    public static void main(String[] args) {
 
        Mahasiswa[] data = new Mahasiswa[8];
        data[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        data[1] = new Mahasiswa("Budi",  "220101002", 2022, 85, 88);
        data[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        data[3] = new Mahasiswa("Dian",  "220101004", 2021, 76, 79);
        data[4] = new Mahasiswa("Eko",   "220101005", 2023, 92, 95);
        data[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        data[6] = new Mahasiswa("Gina",  "220101007", 2023, 80, 83);
        data[7] = new Mahasiswa("Hadi",  "220101008", 2020, 82, 84);
 
        NilaiMahasiswa nm = new NilaiMahasiswa();
 
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer) : " + nm.maxUTSDC(data, 0, data.length - 1));
        System.out.println("b) Nilai UTS terendah  (Divide and Conquer) : " + nm.minUTSDC(data, 0, data.length - 1));
        System.out.println("c) Rata-rata nilai UAS (Brute Force)        : " + nm.rataUASBF(data));
    }
}
