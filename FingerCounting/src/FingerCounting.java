public class FingerCounting {
    public static void main (String[] args) {
        System.out.println(maxNumber(5,973));
    }
    public static int maxNumber(int weakFinger, int maxCount) {
        if (weakFinger == 1 && maxCount == 0) {
            return 0;
        }
        // state: currentCount, weakFingerUsed, currentFinger, thumbToPinky - direction

        // set the initial state
        int currentCount = 1;
        int weakFingerUsed;
        if (weakFinger == 1) {
            weakFingerUsed = 1;
        } else {
            weakFingerUsed = 0;
        }
        int currentFinger = 1;
        boolean thumbToPinky = true;

        // simulation
        while (true) {
            // count to the next number
            // Rule:Start toward thumb(1) toward pinky(5), counts each finger in order, reverse direction at two ends
            // update state
            currentCount += 1;
            if (weakFinger == currentCount) {
                weakFingerUsed += 1;
            }
            if (currentFinger < 5 && thumbToPinky) {
                currentFinger += 1;
            }
            if (currentFinger > 1 && !thumbToPinky) {
                currentFinger -= 1;
            }
            if (currentFinger == 5 && thumbToPinky) {
                currentFinger = 4;
                thumbToPinky = false;
            }
            if (currentFinger == 1 && !thumbToPinky) {
                currentFinger = 2;
                thumbToPinky = true;
            }
            // break if weakFingerUsed reaches weakFinger
            if (weakFingerUsed > weakFinger) {
                break;
            }
        }
        //You are given weakFinger and maxCount
        //Return the largest number he can count to.
        // simulation ended
        return currentCount - 1;
    }
}
