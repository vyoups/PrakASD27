package CM;

public class NodePesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    NodePesanan prev;
    NodePesanan next;

    public NodePesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}
