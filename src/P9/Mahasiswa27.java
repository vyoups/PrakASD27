package P9;

public class Mahasiswa27 {
    public String nama, nim, kelas;
    public int nilai;

    Mahasiswa27 (String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }   

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}