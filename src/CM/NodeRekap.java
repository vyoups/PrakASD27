package CM;

public class NodeRekap {
    String namaPesanan;
    int JumlahPesanan;
    int jumlah;
    NodeRekap next;

    public NodeRekap(String namaPesanan, int JumlahPesanan) {
        this.namaPesanan = namaPesanan;
        this.JumlahPesanan = JumlahPesanan;
        this.next = null;
        this.jumlah = 1;
    }
}
