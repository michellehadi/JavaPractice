import java.util.HashMap;
public class WritingWords {
    public static int write (String word) {
        HashMap<Character,Integer> words = new HashMap<>();
        for (int i='A'; i<'a';i++) {
            words.put('A'+=1,i-i+1);
        }

        return 0;
    }
    public static void main (String[] args) {
        int a = (int) 'A';
        char b = (char) 66;
        System.out.println(b);
    }
}
