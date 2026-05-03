package P9;


public class StackKonversi27 {
    int [] tumpukanBiner;
    int size;
    int top;

    public StackKonversi27(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack sudah kosong!");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
