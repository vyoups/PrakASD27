package P2;

public class Mahasiswa27 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa27(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    public Mahasiswa27() {
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    void ubahIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
    
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("Nilai IPK tidak valid. Harus antara 0.0 dan 4.0.");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}   