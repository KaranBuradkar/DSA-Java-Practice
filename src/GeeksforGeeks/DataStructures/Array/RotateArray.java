package GeeksforGeeks.DataStructures.Array;// TASK: Given an array arr[] . Rotate the array to the left (counter-clockwise direction) by d steps,
//       where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.
// DIFFICULTY: Medium
// LINK: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
// INPUT: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
// OUTPUT: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

public class RotateArray {
    static void rotateArr(int[] arr, int d) {
        
        int len = arr.length;
        d = d % len;
        
        // 1. Reverse sub array 0 to d
        reverse(arr, 0, d-1);
        
        // 2. Reverse remaining subarray
        len = len - 1;
        reverse(arr, d, len);
        
        // 3. Reverse whole array
        reverse(arr, 0, len);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int d = 3;
        System.out.println("Input: ");
        display(arr);

        rotateArr(arr, d);

        System.out.println("Output: ");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}