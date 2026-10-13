package RandomQ;

/**
 * WAP TO CHECK A YEAR IS LEAP YEAR OR NOT
 * EX: 1600, 2024, 2008 -> Leap Year,
 * 2023, 1954, 2005 -> Not Leap Year
 */
public class _17_LeapYear {
    public static void main(String[] args) {
        int year = 2400;

        boolean isLeapYr = isLeapYear(year);

        if (isLeapYr) System.out.println("PASSED: "+year+" is a Leap Year");
        else System.out.println("FAILED: "+year+" is not a Leap Year");
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
