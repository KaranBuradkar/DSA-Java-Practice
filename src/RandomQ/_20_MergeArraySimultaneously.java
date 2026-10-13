package RandomQ;

import java.util.Arrays;

/**
 * WAP TO MERGE TWO ARRAYS
 * EX: a = [10, 5, 8], b = [4, 9, 32, 6]
 * output: ans = [10, 4, 5, 9, 8, 32, 6]
 */
public class _20_MergeArraySimultaneously {

    public static void main(String[] args) {
        int[] a = {10, 5, 8};
        int[] b = {2, 4, 9};
        int[] expected = {10, 2, 5, 4, 8, 9};

        int[] ans = merge(a, b);

        if (Arrays.equals(expected, ans)) System.out.println("PASSED: Array merge successfully");
        else System.out.println("FAILED: Are is not merge, expected: "+ Arrays.toString(expected)
                +" and result: "+ Arrays.toString(ans));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];

        int ansPtr = 0, aPtr = 0, bPtr = 0;

        while (ansPtr < ans.length) {
            if (aPtr < a.length) {
                ans[ansPtr] = a[aPtr];
                aPtr++;
                ansPtr++;
            }
            if (bPtr < a.length && ansPtr < ans.length) {
                ans[ansPtr] = b[bPtr];
                bPtr++;
                ansPtr++;
            }
        }

        return ans;
    }
}
