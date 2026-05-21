package P12;

public class DoubleLinkList27 {
    Node27 head;
    Node27 tail;
    int size;

    public DoubleLinkList27() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa27 data) {
        Node27 newNode = new Node27(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;

        System.out.println("Data berhasil ditambahkan di awal");
    }

    public void addLast(Mahasiswa27 data) {
        Node27 newNode = new Node27(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;

        System.out.println("Data berhasil ditambahkan di akhir");
    }

    public void insertAfter(String keyNim, Mahasiswa27 data) {
        Node27 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node27 newNode = new Node27(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Data berhasil disisipkan");
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;

        System.out.println("Data awal berhasil dihapus");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;

        System.out.println("Data akhir berhasil dihapus");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node27 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node27 current = tail;

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa27 data) {

        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node27 current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node27 newNode = new Node27(data);

        newNode.next = current.next;
        newNode.prev = current;

        current.next.prev = newNode;
        current.next = newNode;

        size++;

        System.out.println("Data berhasil ditambahkan pada index " + index);
    }

    public void removeAfter(String keyNim) {

        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node27 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM tersebut tidak ada");
            return;
        }

        Node27 deleted = current.next;

        System.out.println("Data yang dihapus:");
        deleted.data.tampil();

        current.next = deleted.next;

        if (deleted.next != null) {
            deleted.next.prev = current;
        } else {
            tail = current;
        }

        size--;

        System.out.println("Data berhasil dihapus");
    }

    public void remove(int index) {

        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node27 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data yang dihapus:");
        current.data.tampil();

        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;

        System.out.println("Data berhasil dihapus");
    }

    public void getFirst() {

        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            System.out.println("Data node pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {

        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            System.out.println("Data node terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {

        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node27 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    public int size() {
        return size;
    }
}