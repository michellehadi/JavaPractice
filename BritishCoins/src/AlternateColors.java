import java.lang.reflect.Array;
import java.util.*;

public class AlternateColors {
    public static String getColor(long r, long g, long b, long k) {
        // cannot simulate, because k could be as large as 10^12, which is too large
        // print("entering", r, g, b, k)
        // trivial cases) only one color left
            if ( r == 0 && g == 0)
                return "blue";
            if ( r == 0 && b == 0)
                return "green";
            if ( g == 0 && b == 0)
                return "red";
        // case 1, r,g,b > 0
        // the minimum number of cycles r->g->b that I can run with is min{k//3, r, g, b}
            if (Math.min([r, g, b]) > 0) {
            int minRounds = Math.min(new long {k / 3, r, g, b});
            r -= minRounds;
            b -= minRounds;
            g -= minRounds;
            k -= 3 * minRounds;
            if ( Math.min([r, g, b]) > 0) {
                if (k == 0 || k == 1 || k == 2)
                    return ["blue", "red", "green"][k];
                else
             return getColor(r, g, b, k);
//        // case 2, r,g > 0, b = 0
//            if ( Math.min([r, g]) > 0 && b == 0) {
//                minRounds = Math.min([k / 2, r, g]);
//                r -= minRounds;
//                g -= minRounds;
//                k -= 2 * minRounds;
//            if (Math.min([r, g]) > 0) {
//                if ( k in [0, 1]) {
//            return ["green", "red"][k];
//                else
//            return getColor(r, g, b, k);
//        // case 3, r,b > 0, g = 0
//            if ( min([r, b]) > 0 && g == 0)
//            minRounds = min([k // 2, r, b])
//            r -= minRounds
//            b -= minRounds
//            k -= 2 * minRounds
//            if ( min([r, b]) > 0)
//            if ( k in [0, 1])
//            return ["blue", "red"][k]
//            else)
//            return getColor(r, g, b, k)
//        // case 4, g,b > 0, r = 0
//            if ( min([g, b]) > 0 && r == 0)
//            minRounds = min([k // 2, g, b])
//            g -= minRounds
//            b -= minRounds
//            k -= 2 * minRounds
//            if ( min([g, b]) > 0)
//            if ( k in [0, 1])
//            return ["blue", "green"][k]
//            else)
//            return getColor(r, g, b, k)
//    // print(getColor(1, 1, 1, 3))
//            print(getColor(3, 4, 5, 4))
//            print(getColor(653, 32, 1230, 556))
//            print(getColor(1000000000000, 1, 1, 1000000000002))

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input) ");
        String input1 = input.nextLine();
        long a = Long.parseLong(input1);

        String input2 = input.nextLine();
        long b = Long.parseLong(input2);

        String input3 = input.nextLine();
        long c = Long.parseLong(input3);

        String input4 = input.nextLine();
        long d = Long.parseLong(input4);

        System.out.println(getColor(a,b,c,d));

    }
}
