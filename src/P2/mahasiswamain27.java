package P2;

public class mahasiswamain27 {
    public static void main(String[] args) {
        Mahasiswa27 mhs1 = new Mahasiswa27();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI-2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI-2K");
        mhs1.ubahIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa27 mhs2 = new Mahasiswa27("Annisa Nabila", "2241720172", 3.25, "TI-2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        
        Mahasiswa27 mhsDaffa = new Mahasiswa27("Daffa", "2241720173", 2.8, "SI-2M");
        mhsDaffa.tampilkanInformasi();
    }
}
