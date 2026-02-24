package P2;

public class matakuliahmain27 {
    public static void main(String[] args) {
        matakuliah27 mk1 = new matakuliah27();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 48;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(16);
        mk1.tampilkanInformasi();

        matakuliah27 mk2 = new matakuliah27();
        mk2.kodeMK = "IF102";
        mk2.nama = "Struktur Data";
        mk2.sks = 3;
        mk2.jumlahJam = 48;

        mk2.tampilkanInformasi();
        mk2.kurangiJam(8);
        mk2.tampilkanInformasi();
    }
}
