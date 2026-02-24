package P2;

public class dosenmain27 {
    public static void main(String[] args) {
        dosen27 dosen1 = new dosen27();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Andi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Matematika";        
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.ubahBidangKeahlian("Fisika");
        dosen1.tampilkanInformasi();
    }
}
