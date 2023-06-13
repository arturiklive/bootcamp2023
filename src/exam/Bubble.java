package exam;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {5, 6, 4, 3, 2, 7};
        System.out.println("Not sorted - " + Arrays.toString(array));
        System.out.println("Sorted - " + Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tempElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempElement;
                }
            }
        }
        return array;
    }
}
