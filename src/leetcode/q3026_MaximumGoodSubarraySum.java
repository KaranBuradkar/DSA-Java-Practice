package leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode 3026: Maximum good subarray sum
public class q3026_MaximumGoodSubarraySum {

    public static long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Long> map = new HashMap<>();

        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int num : nums) {

            // Check num - k
            if (map.containsKey(num - k)) {
                maxSum = Math.max(
                        maxSum,
                        prefixSum + num - map.get(num - k)
                );
            }

            // Check num + k
            if (map.containsKey(num + k)) {
                maxSum = Math.max(
                        maxSum,
                        prefixSum + num - map.get(num + k)
                );
            }

            // Store minimum prefix sum for this value
            map.put(num, Math.min(
                    map.getOrDefault(num, Long.MAX_VALUE),
                    prefixSum)
            );

            prefixSum += num;
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}
