package RandomQ;

/**
 * WAP TO FIND LCM
 * ex: lcm(12, 18);
 * lcm = (| a * b |) / gcd(a, b);
 */
public class _12_FindLCM {

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int expected = 36;

        int lcm = findLCM(a, b);

        if (lcm == expected) System.out.println("PASSED: "+lcm);
        else System.out.println("FAILED: "+lcm+", EXPECTED: "+expected);
    }

    private static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs( (a / gcdOptimize(a, b)) * b);
    }

    // BRUTE FORCE
    private static int gcd(int a, int b) {
        int n = Math.min(a, b);
        int gcd = 1;
        for (int i = 2; i <= n; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // OPTIMIZE APPROACH
    private static int gcdOptimize(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
