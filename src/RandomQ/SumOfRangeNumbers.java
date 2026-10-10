package RandomQ;

public class SumOfRangeNumbers {
    public static void main(String[] args) {
        int start = -1;
        int end = 5;
        int expect = 14;

        int total = sumOfRange(start, end);
        if (total == expect) System.out.println("PASSED: "+total);
        else System.out.println("FAILED: "+total+", EXPECT: "+expect);
    }

    private static int sumOfRange(int start, int end) {
        int total = 0;
        while (start <= end) {
            total = total + start;
            start++;
        }
        return total;
    }


}
