/*public class ShorterSuperSum {
    public static int calculate (int k, int n) {
        // base case
        if (k == 0) {
            return n;
        }
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += calculate(k-1,i);
        }
        return sum;
    }
    public static void main (String[] args) {
        System.out.println("1");
        System.out.println("3");
        System.out.println("Returns : " + calculate(1,3));
        System.out.println("2");
        System.out.println("3");
        System.out.println("Returns : " + calculate(2,3));
        System.out.println("4");
        System.out.println("10");
        System.out.println("Returns : " + calculate(4,10));
        System.out.println("10");
        System.out.println("10");
        System.out.println("Returns : " + calculate(10,10));
    }
}
*/