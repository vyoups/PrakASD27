package CM;

public class LinkedListRekap {
    NodeRekap head;

    public LinkedListRekap() {
        head = null;
    }
    // Update rekap pesanan, jika nama pesanan sudah ada, jumlahnya ditambah 1
    public void updateRekap(String namaPesanan) {
        NodeRekap curr = head;
        while (curr != null) {
            if (curr.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                curr.jumlah++;
                return;
            }
            curr = curr.next;
        }
        // jika tidak ditemukan, tambahkan node baru di akhir
        NodeRekap baru = new NodeRekap(namaPesanan, 1);
        if (head == null) {
            head = baru;
        } else {
            curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = baru;
        }
    }



    // Tampilkan rekap urutan jumlah terbanyak
    public void cetakRekap() {
        if (head == null) {
            System.out.println("Belum ada rekap pesanan.");
            return;
        }
        System.out.println("======================================");
        System.out.println("REKAP PESANAN PER MENU (TERLARIS)");
        System.out.println("======================================");
        System.out.printf("%-20s %-10s%n", "Nama Pesanan", "Jumlah");
        NodeRekap curr = head;
        while (curr != null) {
            System.out.printf("%-20s %-10d%n", curr.namaPesanan, (int)curr.jumlah);
            curr = curr.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}