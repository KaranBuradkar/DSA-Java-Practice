package GeeksforGeeks.DataStructures.Array;

// TASK: Given an unsorted array arr[] of size n, containing elements from the range 1 to n,
// it is known that one number in this range is missing, and another number occurs twice in the array,
// find both the duplicate number and the missing number.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
// INPUT: arr[] = [4, 3, 6, 2, 1, 1]
// OUTPUT: [1, 5]

import java.util.ArrayList;
import java.util.HashSet;

public class MissingAndRepeating {
    static ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                res.add(num);
            }
            set.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                res.add(i);
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}