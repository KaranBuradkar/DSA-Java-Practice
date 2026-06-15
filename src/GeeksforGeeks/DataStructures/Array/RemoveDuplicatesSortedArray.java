package GeeksforGeeks.DataStructures.Array;

// TASK: You are given a sorted array arr[] containing positive integers.
// Your task is to remove all duplicate elements from this array such
// that each element appears only once. Return an array containing these
// distinct elements in the same order as they appeared.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
// INPUT: arr = [1, 2, 2, 3, 4, 4, 4, 5, 5]
// OUTPUT: [1, 2, 3, 4, 5]

import java.util.ArrayList;

public class RemoveDuplicatesSortedArray {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        // HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                res.add(arr[i]);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        ArrayList<Integer> newSize = removeDuplicates(arr);

        for (Integer num : newSize) {
            System.out.print(num + " ");
        }
    }
}
