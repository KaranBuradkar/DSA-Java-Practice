package leetcode;

// Find length of the last word in string statement.
public class q58_LengthOfLastWord {
    public static int lastWordLength(String s) {
        boolean notSpace = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && !notSpace) {
                notSpace = true;
            }

            if (notSpace && count > 0 && s.charAt(i) == ' ') break;

            if (notSpace) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int length = lastWordLength("Hii, I am Good");
        System.out.println("Last Word Length: "+length);
    }
}
