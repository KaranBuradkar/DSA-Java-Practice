package RandomQ;

import java.util.HashSet;
import java.util.Set;

/**
 * WAP TO FIND FACTORS OF A NUMBER
 * EX: 6 -> [1, 2, 3, 6]
 */
public class _16_FactorsOfANumber {
    public static void main(String[] args) {
        int number = 8;
        Set<Integer> expectedFactors = Set.of(1, 4, 2, 8);

        Set<Integer> result = factors(number);

        if (expectedFactors.equals(result)) System.out.println("PASSED: "+result);
        else System.out.println("FAILED: "+result+", EXPECTED: "+expectedFactors);
    }

    private static Set<Integer> factors(int number) {
        Set<Integer> result = new HashSet<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
