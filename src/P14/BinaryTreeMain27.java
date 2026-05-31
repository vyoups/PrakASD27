package P14;

public class BinaryTreeMain27 {
    public static void main(String[] args) {

        BinaryTree27 bst = new BinaryTree27();

        bst.add(new Mahasiswa27("244160121", "Ali",    "A", 3.57));
        bst.add(new Mahasiswa27("244160221", "Badar",  "B", 3.85));
        bst.add(new Mahasiswa27("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa27("244160220", "Dewi",   "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa27("244160131", "Devi",  "A", 3.72));
        bst.add(new Mahasiswa27("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa27("244160170", "Fizi",  "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        BinaryTreeArray27 bta = new BinaryTreeArray27();
        Mahasiswa27 mhs1 = new Mahasiswa27("244160121", "Ali",    "A", 3.57);
        Mahasiswa27 mhs2 = new Mahasiswa27("244160221", "Badar",  "B", 3.85);
        Mahasiswa27 mhs3 = new Mahasiswa27("244160185", "Candra", "C", 3.21);
        Mahasiswa27 mhs4 = new Mahasiswa27("244160220", "Dewi",   "B", 3.54);
        
        Mahasiswa27 mhs5 = new Mahasiswa27("244160131", "Devi",  "A", 3.72);
        Mahasiswa27 mhs6 = new Mahasiswa27("244160205", "Ehsan", "D", 3.37);
        Mahasiswa27 mhs7 = new Mahasiswa27("244160170", "Fizi",  "B", 3.46);

        Mahasiswa27[] dataMhs = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7};
        int idxLast = 6;
        bta.populateData(dataMhs, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
    }
}