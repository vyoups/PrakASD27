package P9;

public class StackTugasMahasiswa27 {
    Mahasiswa27 [] stack;
    int size;
    int top;

    public StackTugasMahasiswa27(int size){
        this.size = size;
        stack = new Mahasiswa27[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa27 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa27 pop(){
        if (!isEmpty()){
            Mahasiswa27 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack sudah kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa27 peek(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack sudah kosong");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + " " + stack[i].nim + " " + stack[i].kelas);
        }
        System.out.println("");
    }

    public int hitungTugas(){
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai){
        StackKonversi27 stack = new StackKonversi27();
        while (nilai > 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
