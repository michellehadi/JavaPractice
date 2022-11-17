import java.util.*;
public class ListeningIn {
    public static String probableMatch(String typed, String phrases) {
        if (typed.length() > phrases.length()) {
            return "UNMATCHED";
        } else {
            String answer = findAlphabets(typed, phrases, " ",0, 0);
            return answer;
        }
    }
    public static String findAlphabets(String typed, String phrases, String answer, int indexTyped, int indexPhrases) {
        // base case
        if (typed.length() == indexTyped) {
            answer += phrases.substring(indexPhrases);
            return answer;
        }
        if (typed.charAt(indexTyped) != phrases.charAt(indexPhrases)) {
            return findAlphabets(typed,phrases, answer + phrases.charAt(indexPhrases), indexTyped, indexPhrases+1);
        } else {
            return findAlphabets(typed,phrases, answer, indexTyped+1, indexPhrases+1);
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String typed = input.nextLine();
        String phrases = input.nextLine();
        System.out.println("Output: " + probableMatch(typed,phrases));

        System.out.println("Input: ");
        String typed1 = input.nextLine();
        String phrases1 = input.nextLine();
        System.out.println("Output: " + probableMatch(typed1,phrases1));

        System.out.println("Input: ");
        String typed2 = input.nextLine();
        String phrases2 = input.nextLine();
        System.out.println("Output: " + probableMatch(typed2,phrases2));
    }
}
