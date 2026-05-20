package P10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalDilayani;
    final int MAX_DPA = 30;

    public AntrianKRS(int max) {
        this.max       = max;
        this.data      = new Mahasiswa[max];
        this.front     = 0;
        this.rear      = -1;
        this.size      = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. " + "Posisi antrian: " + size);
    }

    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        if (totalDilayani >= MAX_DPA) {
            System.out.println("DPA sudah menangani " + MAX_DPA +
                               " mahasiswa. Kapasitas DPA penuh!");
            return;
        }

        System.out.println("=== Memanggil antrian untuk proses KRS ===");
        int dipanggil = 0;
        while (!isEmpty() && dipanggil < 2 && totalDilayani < MAX_DPA) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            dipanggil++;
            System.out.print("Mahasiswa " + dipanggil + ": ");
            mhs.tampilkanData();
        }
        System.out.println("Total yang sudah proses KRS: " + totalDilayani);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir dalam antrian:");
        data[rear].tampilkanData();
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahDilayani() {
        return totalDilayani;
    }

    public int jumlahBelumKRS() {
        return size; 
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear  = -1;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}