package GeeksforGeeks.leetcode;

import java.util.Arrays;
import java.util.HashMap;

// Find indexes of 2 number sum equal to target value
public class q01_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = new int[]{7, 2, 5, 8};
        int target = 10;
        int[] expected = new int[]{1, 3};

        int[] output = twoSum(nums, target);

        if (Arrays.equals(output, expected)) {
            System.out.println("PASSED: "+ Arrays.toString(output));
        } else {
            System.out.println("FAILED: "+ Arrays.toString(output) +
                    ", EXPECTED: "+ Arrays.toString(expected));
        }
    }
}