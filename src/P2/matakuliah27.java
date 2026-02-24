package P2;

public class matakuliah27 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        this.sks = sksBaru;
    }

    void tambahJam(int jamTambahan) {
        this.jumlahJam += jamTambahan;
    }

    void kurangiJam(int jamPengurangan) {
        if (jamPengurangan <= jumlahJam) {
            this.jumlahJam -= jamPengurangan;
        } else {
            System.out.println("Jumlah jam yang dikurangi melebihi jumlah jam saat ini.");
        }
    }
}
