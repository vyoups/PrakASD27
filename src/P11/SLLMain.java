package P11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();

        Mahasiswa27 mhs1 = new Mahasiswa27("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa27 mhs2 = new Mahasiswa27("22212202", "Cintia", "3C", 3.5);
        Mahasiswa27 mhs3 = new Mahasiswa27("23212201", "Bimon",  "2B", 3.8);
        Mahasiswa27 mhs4 = new Mahasiswa27("21212203", "Dirga",  "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}