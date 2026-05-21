package P11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();

        Mahasiswa27 mhs1 = new Mahasiswa27("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa27 mhs2 = new Mahasiswa27("22212202", "Cintia", "3C", 3.5);
        Mahasiswa27 mhs3 = new Mahasiswa27("23212201", "Bimon", "2B", 3.8);
        Mahasiswa27 mhs4 = new Mahasiswa27("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "
                + sll.indexOf("Bimon"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}