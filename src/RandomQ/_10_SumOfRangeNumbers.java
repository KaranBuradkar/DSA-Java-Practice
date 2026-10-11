package RandomQ;

/**
 * WAP TO SUM OF RANGE start TO end
 * ex: -1 to 5 -> 14
 */
public class _10_SumOfRangeNumbers {
    public static void main(String[] args) {
        int start = -1;
        int end = 5;
        int expect = 14;

        int total = sumOfRange(start, end);
        if (total == expect) System.out.println("PASSED: "+total);
        else System.out.println("FAILED: "+total+", EXPECT: "+expect);
    }

    // BRUTE FORCE
    private static int sumOfRange(int start, int end) {
        int total = 0;
        while (start <= end) {
            total = total + start;
            start++;
        }
        return total;
    }


}
