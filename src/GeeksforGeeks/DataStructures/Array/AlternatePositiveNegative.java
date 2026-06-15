package GeeksforGeeks.DataStructures.Array;

// TASK: Given an unsorted array arr containing both positive and negative numbers.
// Your task is to rearrange the array and convert it into an array of alternate
// positive and negative numbers without changing the relative order.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
// INPUT: [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
// OUTPUT: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(Integer num : arr) {
            if(num >= 0) pos.add(num);
            else neg.add(num);
        }
        
        int np = 0, pp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(pp < pos.size() && (i % 2 == 0 || np >= neg.size())) {
                arr.set(i, pos.get(pp++));
            }
            else if(np < neg.size()) {
                arr.set(i, neg.get(np++));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));
        rearrange(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}