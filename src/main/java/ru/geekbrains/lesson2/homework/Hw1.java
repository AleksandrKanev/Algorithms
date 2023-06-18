package ru.geekbrains.lesson2.homework;

public class Hw1 {
    public static void main(String[] args) {
        int[] array = new int[]{23, 321, 561, 465, 68, 165, 61, 2};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapyfy(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;

            heapyfy(array, i, 0);
        }
    }

    private static void heapyfy(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        if (largest != rootIndex) {
            int tmp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = tmp;

            heapyfy(array, heapSize, largest);
        }
    }


}
