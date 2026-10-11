package RandomQ;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int N = 12;
        int expect = 78;
        // sum of 1 to N
        int sum = sumOfNumberByFormula(N);
        if (sum == expect) System.out.println("PASSED: "+sum);
        else System.out.println("FAILED: "+sum+", EXPECT: " +expect);
    }

    // Arithmetic Progress Formula
    private static int sumOfNumberByFormula(int N) {
        return ( N * (N + 1) ) / 2;
    }

    // Brute force
    private static int sumOfNumber(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }


}
