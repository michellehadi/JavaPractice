public class FunnyFence {
    public int getLength(String s) {
        int count = 0;
        int max = 0;
        // Base case
        if (s.length() == 0) {
            return 0;
        }
        // looping through all the characters
        char var = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != var) {
                count++;
                var = s.charAt(i);
            }
            else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}
