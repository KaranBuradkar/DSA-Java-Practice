package GeeksforGeeks.leetcode;

import java.util.HashSet;

// Given an integer array nums, return true if any value
// appears at least twice in the array, and
// return false if every element is distinct.
public class q217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int n : nums) {
            if(s.contains(n)) {
                return true;
            }
            s.add(n);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9, 0, 4, 8, 9, 5};
        boolean expected = true;
        boolean output = containsDuplicate(nums);

        if (expected == output) {
            System.out.println("PASSED: "+output);
        } else {
            System.out.println("FAILED: "+output+", EXPECTED: "+expected);
        }
    }
}
