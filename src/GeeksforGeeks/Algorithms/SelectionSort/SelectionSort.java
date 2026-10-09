package GeeksforGeeks.Algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    private static void sort(int[] arr) {
        int minNumIdx, swapTemp;
        for (int i = 0; i < arr.length; i++) {
            minNumIdx = i;
            for (int fastPtr = i + 1; fastPtr < arr.length; fastPtr++) {
                if (arr[fastPtr] < arr[minNumIdx]) {
                    minNumIdx = fastPtr;
                }
            }

            swapTemp = arr[i];
            arr[i] = arr[minNumIdx];
            arr[minNumIdx] = swapTemp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 19, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
