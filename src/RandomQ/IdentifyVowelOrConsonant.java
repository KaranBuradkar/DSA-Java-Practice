package RandomQ;

public class IdentifyVowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'i';
        int identified = identifyVowelOrConsonant(ch);

        System.out.print(ch + " : ");
        if (identified == -1) System.out.println("Invalid character");
        else if (identified == 0) System.out.println("Consonant");
        else if (identified == 1) System.out.println("Vowel");
    }

    private static int identifyVowelOrConsonant(char ch) {
        if ('a' > ch || ch > 'z') {
            return -1;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            return 1;
        }

        return 0;
    }
}
