import java.util.Scanner;
public class EllysPronounciation {
    public static int getGood(String[] words) {
        int counter = 0;
        for (int i=0; i< words.length; i++) {
            if (checkAlphabets(words[i],0,0,0)) {
                counter++;
            }
        }
        return counter;
    }
    public static boolean checkAlphabets(String word, int vowel, int consonant, int index) { //wrath, 0, 0, 0
        // base case
        if (word.length() == index) {
            if (vowel == consonant) {
                return true;
            } else {
                return false;
            }
        }
        if (word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i' || word.charAt(index) == 'o' || word.charAt(index) == 'u') {
            return checkAlphabets(word,vowel+1, consonant, index+1);
        } else
            return checkAlphabets(word,vowel,consonant+1,index+1);
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        int num = input.nextInt();input.nextLine();
        String[] words = new String[num];
        for (int i=0; i<num; i++) {
            words[i] = input.nextLine();
        }
        System.out.println("Output: " + getGood(words));
        System.out.println("Input: ");
        int num1 = input.nextInt();input.nextLine();
        String[] words1 = new String[num1];
        for (int i=0; i<num1; i++) {
            words1[i] = input.nextLine();
        }
        System.out.println("Output: " + getGood(words1));
        System.out.println("Input: ");
        int num2 = input.nextInt();input.nextLine();
        String[] words2 = new String[num2];
        for (int i=0; i<num2; i++) {
            words2[i] = input.nextLine();
        }
        System.out.println("Output: " + getGood(words2));
        System.out.println("Input: ");
        int num3 = input.nextInt();input.nextLine();
        String[] words3 = new String[num3];
        for (int i=0; i<num3; i++) {
            words3[i] = input.nextLine();
        }
        System.out.println("Output: " + getGood(words3));
        System.out.println("Input: ");
        int num4 = input.nextInt();input.nextLine();
        String[] words4 = new String[num4];
        for (int i=0; i<num4; i++) {
            words4[i] = input.nextLine();
        }
        System.out.println("Output: " + getGood(words4));
    }
}
