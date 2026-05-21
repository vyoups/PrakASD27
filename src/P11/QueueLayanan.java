package P11;

public class QueueLayanan {
    private NodeAntrian front;
    private NodeAntrian rear;  
    private int size;
    private final int MAX_SIZE = 10; 

    public QueueLayanan() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa27 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambah.");
            return;
        }
        NodeAntrian node = new NodeAntrian(mhs);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil: ");
        front.data.tampilInformasi();
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampilInformasi();
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Antrian ===");
        NodeAntrian tmp = front;
        int no = 1;
        while (tmp != null) {
            System.out.print(no++ + ". ");
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println("Total: " + size + " mahasiswa\n");
    }

    public int jumlahAntrian() {
        return size;
    }
}