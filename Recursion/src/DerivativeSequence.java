public class DerivativeSequence {
    public int[] derSeq(int[] a, int n) {
        // base case
        if (n == 0) {
            return a;
        }
        int[] b = new int[a.length-1];
        for (int i=0; i<a.length-1; i++) {
            b[i] = a[i+1] - a[i];
        }
        return derSeq(b,n-1);
    }
}