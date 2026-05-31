package P14;

public class BinaryTreeArray27 {
    Mahasiswa27[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray27() {
        this.dataMahasiswa = new Mahasiswa27[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa27 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // TUGAS 4: add
    void add(Mahasiswa27 data) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i] == null) {
                dataMahasiswa[i] = data;
                if (i > idxLast) idxLast = i;
                return;
            }
        }
        System.out.println("Array penuh, tidak bisa menambah data.");
    }

    // TUGAS 4: traversePreOrder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}