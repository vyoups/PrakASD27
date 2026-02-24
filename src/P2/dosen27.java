package P2;

public class dosen27 {
    String idDosen;
    String nama;
    Boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(Boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahBidangKeahlian(String bidangKeahlianBaru) {
        this.bidangKeahlian = bidangKeahlianBaru;
    }
}
