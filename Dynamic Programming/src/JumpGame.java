import java.util.Scanner;
public class JumpGame {
    public int getMin(String blocks) {
        int len = blocks.length();

        // Initialize all data in array to -1 which means currently all of them are not touched yet
        int total[] = new int[len];
        for (int i = 0; i < len; i++) {
            total[i] = -1;
        }

        // RGGGB
        total[0] = 0; // Start from Red where step still 0
        char previous;

        for (int i = 1; i < len; i++) {
            // Check for current color to determine the previous
            if (blocks.charAt(i) == 'R') previous = 'B';
            else if (blocks.charAt(i) == 'G')previous = 'R';
            else previous = 'G';
            // 1. previous = R
            // 2. previous = R
            // 3. previous = R
            // 4. previous = 'g'

            // Loops every combination before current index to check for minimum cost
            for (int prev = 0; prev < i; prev++) {
                // 0.0 R 0
                // 1.0 R 0
                // 2.0 R 0
                // 3.1 G 1

                // If prev block match the previous color and it has been touched then
                // update the data with minimum step
                if (blocks.charAt(prev) == previous && total[prev] != -1) {
                    int j = i - prev;
                    int step = total[prev] + j * j;
                    // 0.0 step = 0 + (1-0) * (1-0) -> 1
                    // 1.0 step = 0 + (2-0) * (2-0) -> 4
                    // 2.0 step = 0 + (3-0) * (3-0) -> 9
                    // 3.1 step = 1 + (4-1) * (4-1) -> 10
                    // 3.2 step = 4 + (4-2) * 4-2) -> 8
                    // 3.3 step = 9 + (4-3) * (4-3) -> 10

                    if (total[i] == -1)
                        total[i] = step;
                        // total[1] = 1
                        // total[2] = 4
                        // total[3] = 9
                        // total[4] = 10

                    else
                        total[i] = total[i] < step ? total[i] : step;
                    // total[4] = 10 < 8 -> 8
                    // total[4] = 8< 10 -> 8
                }
            }
        }

        // return the last index that contain the total minimum step so far
        return total[len - 1];
    }

    public static void main(String[] args) {
        JumpGame game = new JumpGame();

        String blocks;
        Scanner input = new Scanner(System.in);

        System.out.println("Input: ");
        blocks = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks));

        System.out.println("Input: ");
        String blocks1 = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks1));

        System.out.println("Input: ");
        String blocks2 = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks2));

        System.out.println("Input: ");
        String blocks3 = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks3));

        System.out.println("Input: ");
        String blocks4 = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks4));

        System.out.println("Input: ");
        String blocks5 = input.nextLine();

        System.out.println("Output: " + game.getMin(blocks5));
        input.close();
    }
}