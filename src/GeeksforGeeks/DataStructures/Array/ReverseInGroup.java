package GeeksforGeeks.DataStructures.Array;

// TASK: Given an array arr[] of positive integers. Reverse every sub-array group of size k.
// Note: If at any instance, the remaining elements are fewer than k, reverse all of them.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
// INPUT: arr[] = [1, 2, 3, 4, 5], k = 3
// OUTPUT: [3, 2, 1, 5, 4]

public class ReverseInGroup {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length - 1;
        int rep = n / k;
        int i;
        for (i = 0; i < rep + 1; i++) {

            int start = i * k;
            int end = Math.min(start + k - 1, n);

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }
}

