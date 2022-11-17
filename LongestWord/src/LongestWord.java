import java.util.*;

public class LongestWord {
    public static String findLongestWord(String s, List<String> dictionary) {
        ArrayList<String> listWord = new ArrayList<>();
        ArrayList<String> afterElimination = new ArrayList<>();
        for (int i=0; i< dictionary.size(); i++) { // ale, apple, apple, apple, apple, plea
            if (stringCompare(s,dictionary.get(i))) {
                listWord.add(dictionary.get(i));
            }
        }
        for (int k=0; k<listWord.size(); k++) {
            System.out.println("BEFORE" + listWord.get(k));
        }
        afterElimination.add(listWord.get(0));
        int max = listWord.get(0).length();
        for (int j=1; j<listWord.size(); j++) {
            if (listWord.get(j).length() > max) {
                afterElimination.clear();
                afterElimination.add(listWord.get(j));
                max = listWord.get(j).length();
            }
            else if (listWord.get(j).length() == max) {
                afterElimination.add(listWord.get(j));
            }
        }
        for (int m=0; m<afterElimination.size(); m++) {
            System.out.println("AFTER" + afterElimination.get(m));
        }
        Collections.sort(afterElimination);
        return afterElimination.get(0);
    }

    public static boolean stringCompare(String s, String word) { // abpcplea -> ale, apple, plea
        int counter = 0;
        int j = 0;
        for (int i=0; i<word.length(); i++) {
            for (; j < s.length(); j++) { // loopingan kedua = kata yg kedua
                if (word.charAt(i) == s.charAt(j)) {
                    counter++;
                    j++;
                    break;
                }
            }
        }
        if (counter == word.length()) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> dictionary = new ArrayList<String>();
        System.out.println("Input: ");
        String a = input.nextLine();
        int num = input.nextInt();input.nextLine();
        for (int i=0; i<num; i++) {
            dictionary.add(input.nextLine());
        }
        System.out.println("Output: " + findLongestWord(a, dictionary));
    }
}
