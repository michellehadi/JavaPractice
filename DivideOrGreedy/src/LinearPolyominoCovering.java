public class LinearPolyominoCovering {
    public static String findCovering (String region) {
        int count = 0;
        String res = "";
        for (int i=0; i<region.length(); i++) { // XX..XXXX...XXXXXXXX
            if (region.charAt(i) == 'X') {
                count++;
            }
            else if (region.charAt(i) == '.') {
                res = polyominoes(count, res);
                if (res.equals("impossible")) {
                    return res;
                }
                else count = 0;
            }
        }
        res = polyominoes(count,res);
        if (res.charAt(res.length()-1) == '.') {
            return res.substring(0,res.length()-1);
        }
        else return res;
    }
    public static String polyominoes (int count, String res) {
        while (count != 0) {
            if (count % 2 == 0) {
                int divide = count / 4;
                if (divide > 0) {
                    for (int j = 0; j < divide; j++) {
                        res += "AAAA";
                        count -= 4;
                    }
                } else {
                    res += "BB";
                    count -= 2;
                }
            } else {
                return "impossible";
            }
        }
        res += ".";
        return res;
    }
    public static void main (String[] args) {
        System.out.println("XXXXXX");
        System.out.println("Returns: " + findCovering("XXXXXX"));
        System.out.println();
        System.out.println("XX.XX");
        System.out.println("Returns: " + findCovering("XX.XX"));
        System.out.println();
        System.out.println("XXXX....XXX.....XX");
        System.out.println("Returns: " + findCovering("XXXX....XXX.....XX"));
        System.out.println();
        System.out.println("X");
        System.out.println("Returns: " + findCovering("X"));
        System.out.println();
        System.out.println("XX.XXXXXXXXXX..XXXXXXXX...XXXXXX");
        System.out.println("Returns: " + findCovering("XX.XXXXXXXXXX..XXXXXXXX...XXXXXX"));

    }
}
