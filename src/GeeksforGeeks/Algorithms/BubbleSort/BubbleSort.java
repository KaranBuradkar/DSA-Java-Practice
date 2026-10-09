package GeeksforGeeks.Algorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    private static void sort(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 19, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
