package CM;

public class DaftarPesanan {
    private NodePesanan head;
    private NodePesanan tail;
    private int jumlah;

    public DaftarPesanan() {
        head = null;
        tail = null;
        jumlah = 0;
    }

    public void tambahPesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        NodePesanan baru = new NodePesanan(kodePesanan, namaPesanan, harga, namaPembeli);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
    }

    public void sortByNamaPesanan() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            NodePesanan curr = head;
            while (curr.next != null) {
                if (curr.namaPesanan.compareToIgnoreCase(curr.next.namaPesanan) > 0) {
                    // Tukar data (bukan node pointer)
                    int tmpKode = curr.kodePesanan;
                    String tmpNama = curr.namaPesanan;
                    int tmpHarga = curr.harga;
                    String tmpNamaPembeli = curr.namaPembeli;

                    curr.kodePesanan = curr.next.kodePesanan;
                    curr.namaPesanan = curr.next.namaPesanan;
                    curr.harga = curr.next.harga;
                    curr.namaPembeli = curr.next.namaPembeli;

                    curr.next.kodePesanan = tmpKode;
                    curr.next.namaPesanan = tmpNama;
                    curr.next.harga = tmpHarga;
                    curr.next.namaPembeli = tmpNamaPembeli;

                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sortByNamaPesanan();
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        long total = 0;
        NodePesanan curr = head;
        while (curr != null) {
            System.out.printf("%-14d %-20s %-10d%n", curr.kodePesanan, curr.namaPesanan, curr.harga);
            total += curr.harga;
            curr = curr.next;
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan: Rp %,d%n", total);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getJumlah() {
        return jumlah;
    }
}
