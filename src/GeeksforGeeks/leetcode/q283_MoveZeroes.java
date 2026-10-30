package GeeksforGeeks.leetcode;

import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it
// while maintaining the relative order of the non-zero elements.
public class q283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zc = 0;
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zc++;
            } else {
                nums[l] = nums[i];
                l++;
            }
        }

        while(zc > 0) {
            zc--;
            nums[l] = 0;
            l++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 0, 4, 1, 0, 6, 0, 3};
        int[] expected = new int[] {5, 4, 1, 6, 3, 0, 0, 0};
        moveZeroes(nums);

        if (Arrays.equals(nums, expected)) {
            System.out.println("PASSED: "+ Arrays.toString(nums));
        } else {
            System.out.println("FAILED: "+ Arrays.toString(nums) +", EXPECTED: "+ Arrays.toString(expected));
        }
    }
}
