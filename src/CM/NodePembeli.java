package CM;
public class NodePembeli {
    int noAntrian;
    String namaPembeli;
    String noHp;
    NodePembeli prev;
    NodePembeli next;

    public NodePembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}
