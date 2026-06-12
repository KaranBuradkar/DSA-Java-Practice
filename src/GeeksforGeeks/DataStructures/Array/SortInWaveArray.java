package GeeksforGeeks.DataStructures.Array;

// TASK: Given a sorted array arr[] of integers. Sort the array into
// a wave-like array(In Place). In other words, arrange the elements
// into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] .....
// and so on. If there are multiple solutions, find the lexicographically smallest one.
// Note: The given array is sorted in ascending order, and modify the given array
// in-place without returning a new array.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
// INPUT: arr = [2, 4, 7, 8, 9, 10]
// OUTPUT: [4, 2, 8, 7, 10, 9]

public class SortInWaveArray {

    public static void sortInWave(int[] arr) {
        // code here
        int n = arr.length - 1;
        for(int i = 0; i < n; i += 2) {
            
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 9, 10};
        System.out.println("Input: ");
        display(arr);

        sortInWave(arr);
        System.out.println("Output: ");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
