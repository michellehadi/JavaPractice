public class ProblemsToSolve {
    public static int minNumber(int[] pleasantness, int variety) {
        return 0;

//        minNumberFuture(justSolved,minPleasantnessSoFar,maxPleasantnessSoFar) = min {
//            1 + minNumberFuture(current situation + solve next one),
//                1 + minNumberFuture(current situation + skip next one)
        return 1 + minNumberFuture(pleasantness,variety, 0, pleasantness[0], pleasantness[0]);
    }

    public static int minNumberFuture(int[] pleasantness, int variety, int justSolved, int minPleasantnessSoFar, int maxPleasantnessSoFar) {
        // base case
        if (maxPleasantnessSoFar-minPleasantnessSoFar >= variety) {
            return 0;
        }
        if (justSolved == pleasantness.length-1) {
            return 0;
        }
        if (justSolved == pleasantness.length-2) {
            // just solved the second last one, must solve the last one because otherwise we have already returned after the variety check above
            return 1;
        }
        
    }

    public static void main (String[] args) {

    }
}
