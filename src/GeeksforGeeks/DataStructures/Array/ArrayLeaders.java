package GeeksforGeeks.DataStructures.Array;

// TASK: You are given an array arr of positive integers. Your task is to find
// all the leaders in the array. An element is considered a leader if
// it is greater than or equal to all elements to its right.
// The rightmost element is always a leader.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
// INPUT: arr = [16, 17, 4, 3, 5, 2]
// OUTPUT: [17, 5, 2]

import java.util.ArrayList;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        int n = arr.length - 1;
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(arr[n]);
        int max = arr[n];
        
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] >= max) {
                res.addFirst(arr[i]);
                max = arr[i];
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = leaders(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
