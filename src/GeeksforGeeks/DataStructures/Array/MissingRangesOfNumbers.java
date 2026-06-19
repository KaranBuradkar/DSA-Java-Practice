package GeeksforGeeks.DataStructures.Array;

// TASK: You have an inclusive interval [lower, upper] and a sorted array of unique integers arr[],
// all of which lie within this interval. A number x is considered missing if x is in the range [lower, upper]
// but not present in arr[]. Your task is to return the smallest set of sorted ranges that includes
// all missing numbers, ensuring no element from arr is within any range, and every missing number
// is covered exactly once.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/missing-ranges-of-numbers1019/1
// INPUT: int lower = 10;
//        int upper = 50;
//        int[] arr = {14, 15, 20, 30, 31, 45};
// OUTPUT: [[10, 13], [16, 19], [21, 29], [32, 44], [46, 50]]

import java.util.ArrayList;
import java.util.List;

public class MissingRangesOfNumbers {
    public static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        int curr = lower;

        for (int num : arr) {
            if (num != curr) {
                int start = curr;
                int end = num - 1;
                curr = num;

                result.add(List.of(start, end));
            }
            curr++;
        }
        
        if(curr <= upper) result.add(List.of(curr, upper));
        
        return result;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
}