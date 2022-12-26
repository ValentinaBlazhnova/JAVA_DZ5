// Реализовать алгоритм пирамидальной сортировки (HeapSort).
package DZ5;

public class HeapSort {
    static void heapify(int[] array, int size, int i) {
        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && array[l] > array[max]) {
            max = l;
        }

        if (r < size && array[r] > array[max]) {
            max = r;
        }

        if (max != i) {
            int swap = array[i];
            array[i] = array[max];
            array[max] = swap;

            heapify(array, size, max);
        }
    }

    /*
     * Метод для сортировки кучи
     */
    static void sort(int[] array) {
        for (int i = array.length / 2 - 2; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }

    }

    /**
     * Метод для вывода массива
     */
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 3, 65, 24, 78, 8};
        HeapSort hs = new HeapSort();
        hs.sort(array);
        System.out.print("Array is: ");
        printArray(array);
    }
}
