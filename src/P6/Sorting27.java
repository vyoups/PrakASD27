package P6;

public class Sorting27 {

    int [] data;
    int jmlData;


Sorting27 (int Data[], int jmlDat) {
    jmlData = jmlDat;
    data = new int[jmlDat];
    for (int i = 0; i < jmlData; i++) {
        data [i] = Data [i];
        }
    }

void bubbleSort() {
    for (int i = 0; i < jmlData - 1; i++) {
        for (int j = 0; j < jmlData - i - 1; j++) {
            if (data [j] > data [j + 1]) {
                int temp = data [j];
                data [j] = data [j + 1];
                data [j + 1] = temp;
            }
        }
    }
}

void tampil(){
    for (int i = 0; i < jmlData; i++) {
        System.out.print(data [i] + " ");
    }
    System.out.println();
}

void SelectionSort() {
    for (int i = 0; i < jmlData - 1; i++) {
        int min = i;
        for (int j = i + 1; j < jmlData; j++) {
            if (data [j] < data [min]) {
                min = j;
            }
        }
        int temp = data [min];
        data [min] = data [i];
        data [i] = temp;
        }
    }


void InsertionSort() {
    for (int i = 1; i < jmlData; i++) {
        int temp = data [i];
        int j = i - 1;
        while (j >= 0 && data [j] > temp) {
            data [j + 1] = data [j];
            j--;
        }
        data [j + 1] = temp;
        }
    }
}