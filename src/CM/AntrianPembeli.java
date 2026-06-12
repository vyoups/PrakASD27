package CM;

public class AntrianPembeli {
    private NodePembeli head;
    private NodePembeli tail;
    private int jumlah;
    private int counterAntrian;

    public AntrianPembeli() {
        head = null;
        tail = null;
        jumlah = 0;
        counterAntrian = 0;
    }

    public int tambahAntrian(String namaPembeli, String noHp) {
        counterAntrian++;
        NodePembeli baru = new NodePembeli(counterAntrian, namaPembeli, noHp);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
        return counterAntrian;
    }

    public NodePembeli hapusAntrian(int noAntrian) {
        if (head == null) return null;

        NodePembeli curr = head;
        while (curr != null) {
            if (curr.noAntrian == noAntrian) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;

                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;

                curr.prev = null;
                curr.next = null;
                jumlah--;
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
        NodePembeli curr = head;
        while (curr != null) {
            System.out.printf("%-12d %-15s %-15s%n", curr.noAntrian, curr.namaPembeli, curr.noHp);
            curr = curr.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getJumlah() {
        return jumlah;
    }

    public boolean adaAntrian(int noAntrian) {
        NodePembeli curr = head;
        while (curr != null) {
            if (curr.noAntrian == noAntrian) return true;
            curr = curr.next;
        }
        return false;
    }

    public String getNamaPembeli(int noAntrian) {
        NodePembeli curr = head;
        while (curr != null) {
            if (curr.noAntrian == noAntrian) return curr.namaPembeli;
            curr = curr.next;
        }
        return null;
    }
}
