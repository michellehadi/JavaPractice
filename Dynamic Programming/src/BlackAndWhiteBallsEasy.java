/*import java.util.*;
public class BlackAndWhiteBallsEasy {
    // {2,2} --> WWBB
    // 1 - WHITE
    // 2 - BLACK
    // White W, White W, Black BB -- 1, 1, 2
    // White W, White WBB -- 1, 2
    // White W, Black WBB -- 1, 2
    // Black WWBB

    //{2 , 1 , 3 } --> WW B WWW
    // 1
    // 1
    //Returns: 14
    // 1. White W, White W, Black B, White W, White W, White W
    // 2. White W, White W, White BW, White W, White W
    // 3. White W, White W, Black BW, White W, White W
    // 4. White W, White W, Black BWWW
    // 5. White W, White W, Black BWW, White W
    // 6. White W, White WB, White W, White W, White W
    // 7. White W, Black WB, White W, White W, White W
    // 8. White W, Black WBWWW
    // 9. White W, Black WBWW, White W
    // 10. White W, Black WBW, White W, White W
    // 11. Black WWBWWW
    // 12. Black WWB, White W, White W, White W
    // 13. Black WWBW, White W, White W
    // 14. Black WWBWW, White W

    public static int getNumber(int[] balls, int white, int black) {
        ArrayList<String> resultBalls = new ArrayList<>();
        String a = "";
        String[] colorBalls = {"W", "B"};
        for (int i=0; i<balls.length; i++) {
            for (int j=0; j<balls[i]; j++) {
                //resultBalls.add(colorBalls[i%2]);
                a += colorBalls[i%2];
            }
        }

    }
    public static boolean checkBlackWhite (String a) {
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) == 'W') {
                return true;
            }
            else
        }
    }

    public static void main (String[] args) {

    }
}
*/