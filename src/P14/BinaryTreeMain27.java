package P14;

public class BinaryTreeMain27 {
    public static void main(String[] args) {

        BinaryTree27 bst = new BinaryTree27();

        // Tugas 1: addRekursif
        System.out.println("=== TUGAS 1: addRekursif ===");
        bst.addRekursif(new Mahasiswa27("244160121", "Ali",    "A", 3.57));
        bst.addRekursif(new Mahasiswa27("244160221", "Badar",  "B", 3.85));
        bst.addRekursif(new Mahasiswa27("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa27("244160220", "Dewi",   "B", 3.54));
        bst.addRekursif(new Mahasiswa27("244160131", "Devi",   "A", 3.72));
        bst.addRekursif(new Mahasiswa27("244160205", "Ehsan",  "D", 3.37));
        bst.addRekursif(new Mahasiswa27("244160170", "Fizi",   "B", 3.46));
        System.out.println("InOrder setelah addRekursif:");
        bst.traverseInOrder(bst.root);

        // Tugas 2: cariMinIPK & cariMaxIPK
        System.out.println("\n=== TUGAS 2: cariMinIPK & cariMaxIPK ===");
        bst.cariMinIPK();
        bst.cariMaxIPK();

        // Tugas 3: tampilMahasiswaIPKdiAtas
        System.out.println("\n=== TUGAS 3: tampilMahasiswaIPKdiAtas ===");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        // Tugas 4: BinaryTreeArray add & traversePreOrder
        System.out.println("\n=== TUGAS 4: BinaryTreeArray add & traversePreOrder ===");
        BinaryTreeArray27 bta = new BinaryTreeArray27();
        bta.add(new Mahasiswa27("244160121", "Ali",    "A", 3.57));
        bta.add(new Mahasiswa27("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa27("244160221", "Badar",  "B", 3.75));
        bta.add(new Mahasiswa27("244160220", "Dewi",   "B", 3.35));
        bta.add(new Mahasiswa27("244160131", "Devi",   "A", 3.48));
        bta.add(new Mahasiswa27("244160205", "Ehsan",  "D", 3.61));
        bta.add(new Mahasiswa27("244160170", "Fizi",   "B", 3.86));
        System.out.println("PreOrder Traversal (Array):");
        bta.traversePreOrder(0);
        System.out.println("\nInOrder Traversal (Array):");
        bta.traverseInOrder(0);
    }
}