
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.File;
public class DerSeqDriver {
    public static void main(String [] args){
        int correctCount = 0;
        int totalCount = 0;
        String rec;
        DerivativeSequence test =  new DerivativeSequence();
        try {
            Files.write(Paths.get("marker-record"), "".getBytes());
        } catch (IOException e) {}

        totalCount++;
        System.out.println("case1");
        System.out.println("testing with input:");
        System.out.println("{5, 6, 3, 9, -1},1");
        System.out.println("expecting output:");
        System.out.println("{1, -3, 6, -10}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{5, 6, 3, 9, -1},1)));
        // System.out.println(test.derSeq(new int[]{5, 6, 3, 9, -1},1));
// if (Math.abs(test.derSeq(new int[]{5, 6, 3, 9, -1},1)-new int[]{1, -3, 6, -10})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{5, 6, 3, 9, -1},1),new int[]{1, -3, 6, -10})) {
// if (test.derSeq(new int[]{5, 6, 3, 9, -1},1)==new int[]{1, -3, 6, -10}) {
            System.out.println("Correct");
            rec = "1 case1\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case1\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case2");
        System.out.println("testing with input:");
        System.out.println("{5, 6, 3, 9, -1},4");
        System.out.println("expecting output:");
        System.out.println("{-38}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{5, 6, 3, 9, -1},4)));
        // System.out.println(test.derSeq(new int[]{5, 6, 3, 9, -1},4));
// if (Math.abs(test.derSeq(new int[]{5, 6, 3, 9, -1},4)-new int[]{-38})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{5, 6, 3, 9, -1},4),new int[]{-38})) {
// if (test.derSeq(new int[]{5, 6, 3, 9, -1},4)==new int[]{-38}) {
            System.out.println("Correct");
            rec = "1 case2\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case2\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case3");
        System.out.println("testing with input:");
        System.out.println("{0, 3, 9, 18},3");
        System.out.println("expecting output:");
        System.out.println("{0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{0, 3, 9, 18},3)));
        // System.out.println(test.derSeq(new int[]{0, 3, 9, 18},3));
// if (Math.abs(test.derSeq(new int[]{0, 3, 9, 18},3)-new int[]{0})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{0, 3, 9, 18},3),new int[]{0})) {
// if (test.derSeq(new int[]{0, 3, 9, 18},3)==new int[]{0}) {
            System.out.println("Correct");
            rec = "1 case3\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case3\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case4");
        System.out.println("testing with input:");
        System.out.println("{-100, 100},1");
        System.out.println("expecting output:");
        System.out.println("{200}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-100, 100},1)));
        // System.out.println(test.derSeq(new int[]{-100, 100},1));
// if (Math.abs(test.derSeq(new int[]{-100, 100},1)-new int[]{200})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-100, 100},1),new int[]{200})) {
// if (test.derSeq(new int[]{-100, 100},1)==new int[]{200}) {
            System.out.println("Correct");
            rec = "1 case4\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case4\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case5");
        System.out.println("testing with input:");
        System.out.println("{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19");
        System.out.println("expecting output:");
        System.out.println("{52428800}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19)));
        // System.out.println(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19));
// if (Math.abs(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19)-new int[]{52428800})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19),new int[]{52428800})) {
// if (test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},19)==new int[]{52428800}) {
            System.out.println("Correct");
            rec = "1 case5\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case5\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case6");
        System.out.println("testing with input:");
        System.out.println("{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15");
        System.out.println("expecting output:");
        System.out.println("{3276800, -3276800, 3276800, -3276800, 3276800}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15)));
        // System.out.println(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15));
// if (Math.abs(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15)-new int[]{3276800, -3276800, 3276800, -3276800, 3276800})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15),new int[]{3276800, -3276800, 3276800, -3276800, 3276800})) {
// if (test.derSeq(new int[]{-100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100},15)==new int[]{3276800, -3276800, 3276800, -3276800, 3276800}) {
            System.out.println("Correct");
            rec = "1 case6\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case6\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case7");
        System.out.println("testing with input:");
        System.out.println("{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10");
        System.out.println("expecting output:");
        System.out.println("{-37681}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10)));
        // System.out.println(test.derSeq(new int[]{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10));
// if (Math.abs(test.derSeq(new int[]{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10)-new int[]{-37681})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10),new int[]{-37681})) {
// if (test.derSeq(new int[]{-94, 83, -100, -90, -99, 3, -97, 7, -15, -30, 74},10)==new int[]{-37681}) {
            System.out.println("Correct");
            rec = "1 case7\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case7\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case8");
        System.out.println("testing with input:");
        System.out.println("{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19");
        System.out.println("expecting output:");
        System.out.println("{3062329}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19)));
        // System.out.println(test.derSeq(new int[]{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19));
// if (Math.abs(test.derSeq(new int[]{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19)-new int[]{3062329})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19),new int[]{3062329})) {
// if (test.derSeq(new int[]{-21, 75, 67, 80, 66, 50, 70, -13, -47, -44, 7, 71, 6, 45, 16, 70, -23, -68, -84, -17},19)==new int[]{3062329}) {
            System.out.println("Correct");
            rec = "1 case8\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case8\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case9");
        System.out.println("testing with input:");
        System.out.println("{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19");
        System.out.println("expecting output:");
        System.out.println("{13232177}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19)));
        // System.out.println(test.derSeq(new int[]{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19));
// if (Math.abs(test.derSeq(new int[]{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19)-new int[]{13232177})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19),new int[]{13232177})) {
// if (test.derSeq(new int[]{71, 96, -32, -12, -11, 51, -62, 92, -95, -89, -57, 44, 45, 5, -83, -6, 70, -45, 73, 78},19)==new int[]{13232177}) {
            System.out.println("Correct");
            rec = "1 case9\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case9\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case10");
        System.out.println("testing with input:");
        System.out.println("{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13");
        System.out.println("expecting output:");
        System.out.println("{-148860, 143067, -113928, 38763, 86614, -230187, 346834}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13)));
        // System.out.println(test.derSeq(new int[]{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13));
// if (Math.abs(test.derSeq(new int[]{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13)-new int[]{-148860, 143067, -113928, 38763, 86614, -230187, 346834})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13),new int[]{-148860, 143067, -113928, 38763, 86614, -230187, 346834})) {
// if (test.derSeq(new int[]{-8, -19, 35, -16, 8, 10, 71, -9, -38, -70, 60, 79, -74, -5, -95, 65, -84, -75, 1, 0},13)==new int[]{-148860, 143067, -113928, 38763, 86614, -230187, 346834}) {
            System.out.println("Correct");
            rec = "1 case10\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case10\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case11");
        System.out.println("testing with input:");
        System.out.println("{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12");
        System.out.println("expecting output:");
        System.out.println("{-100566, 99399, -100788, 84901, -48983, 8048, 18673, -23704}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12)));
        // System.out.println(test.derSeq(new int[]{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12));
// if (Math.abs(test.derSeq(new int[]{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12)-new int[]{-100566, 99399, -100788, 84901, -48983, 8048, 18673, -23704})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12),new int[]{-100566, 99399, -100788, 84901, -48983, 8048, 18673, -23704})) {
// if (test.derSeq(new int[]{-54, 14, -51, 77, -95, -73, -72, -27, -87, -3, -62, -72, -52, -81, -25, 37, 15, -43, 74, 48},12)==new int[]{-100566, 99399, -100788, 84901, -48983, 8048, 18673, -23704}) {
            System.out.println("Correct");
            rec = "1 case11\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case11\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case12");
        System.out.println("testing with input:");
        System.out.println("{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18");
        System.out.println("expecting output:");
        System.out.println("{-817623, 452095}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18)));
        // System.out.println(test.derSeq(new int[]{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18));
// if (Math.abs(test.derSeq(new int[]{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18)-new int[]{-817623, 452095})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18),new int[]{-817623, 452095})) {
// if (test.derSeq(new int[]{-4, 68, -27, 88, 37, 2, 69, 8, -69, -77, -63, 46, 73, -24, 8, -76, -96, -42, -12, 77},18)==new int[]{-817623, 452095}) {
            System.out.println("Correct");
            rec = "1 case12\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case12\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case13");
        System.out.println("testing with input:");
        System.out.println("{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15");
        System.out.println("expecting output:");
        System.out.println("{-1374708}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15)));
        // System.out.println(test.derSeq(new int[]{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15));
// if (Math.abs(test.derSeq(new int[]{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15)-new int[]{-1374708})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15),new int[]{-1374708})) {
// if (test.derSeq(new int[]{-55, -60, -31, -12, -3, -8, -55, -92, 61, -87, 45, -35, 32, -97, -46, -49},15)==new int[]{-1374708}) {
            System.out.println("Correct");
            rec = "1 case13\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case13\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case14");
        System.out.println("testing with input:");
        System.out.println("{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17");
        System.out.println("expecting output:");
        System.out.println("{2536680, -2841097, 2691891}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17)));
        // System.out.println(test.derSeq(new int[]{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17));
// if (Math.abs(test.derSeq(new int[]{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17)-new int[]{2536680, -2841097, 2691891})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17),new int[]{2536680, -2841097, 2691891})) {
// if (test.derSeq(new int[]{-75, 20, -29, -82, 76, 79, -11, -43, -40, 51, -7, 47, -15, -18, 0, -2, -26, 69, 65, -3},17)==new int[]{2536680, -2841097, 2691891}) {
            System.out.println("Correct");
            rec = "1 case14\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case14\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case15");
        System.out.println("testing with input:");
        System.out.println("{-68, 87, 65, 63, 75, 64, 13},6");
        System.out.println("expecting output:");
        System.out.println("{-121}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-68, 87, 65, 63, 75, 64, 13},6)));
        // System.out.println(test.derSeq(new int[]{-68, 87, 65, 63, 75, 64, 13},6));
// if (Math.abs(test.derSeq(new int[]{-68, 87, 65, 63, 75, 64, 13},6)-new int[]{-121})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-68, 87, 65, 63, 75, 64, 13},6),new int[]{-121})) {
// if (test.derSeq(new int[]{-68, 87, 65, 63, 75, 64, 13},6)==new int[]{-121}) {
            System.out.println("Correct");
            rec = "1 case15\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case15\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case16");
        System.out.println("testing with input:");
        System.out.println("{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19");
        System.out.println("expecting output:");
        System.out.println("{-18916817}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19)));
        // System.out.println(test.derSeq(new int[]{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19));
// if (Math.abs(test.derSeq(new int[]{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19)-new int[]{-18916817})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19),new int[]{-18916817})) {
// if (test.derSeq(new int[]{-56, -9, -63, -11, 46, -22, 61, -20, 86, -13, 58, -26, 57, 46, -78, -6, 57, 7, 85, 97},19)==new int[]{-18916817}) {
            System.out.println("Correct");
            rec = "1 case16\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case16\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case17");
        System.out.println("testing with input:");
        System.out.println("{11, 92, 12},1");
        System.out.println("expecting output:");
        System.out.println("{81, -80}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{11, 92, 12},1)));
        // System.out.println(test.derSeq(new int[]{11, 92, 12},1));
// if (Math.abs(test.derSeq(new int[]{11, 92, 12},1)-new int[]{81, -80})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{11, 92, 12},1),new int[]{81, -80})) {
// if (test.derSeq(new int[]{11, 92, 12},1)==new int[]{81, -80}) {
            System.out.println("Correct");
            rec = "1 case17\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case17\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case18");
        System.out.println("testing with input:");
        System.out.println("{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18");
        System.out.println("expecting output:");
        System.out.println("{6169523, -6674245}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18)));
        // System.out.println(test.derSeq(new int[]{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18));
// if (Math.abs(test.derSeq(new int[]{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18)-new int[]{6169523, -6674245})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18),new int[]{6169523, -6674245})) {
// if (test.derSeq(new int[]{92, -90, 17, 7, -84, -56, 78, -41, -44, -42, -1, -59, 83, 59, 48, -88, -49, 89, -57, 39},18)==new int[]{6169523, -6674245}) {
            System.out.println("Correct");
            rec = "1 case18\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case18\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case19");
        System.out.println("testing with input:");
        System.out.println("{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10");
        System.out.println("expecting output:");
        System.out.println("{-36636, 25776}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10)));
        // System.out.println(test.derSeq(new int[]{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10));
// if (Math.abs(test.derSeq(new int[]{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10)-new int[]{-36636, 25776})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10),new int[]{-36636, 25776})) {
// if (test.derSeq(new int[]{-45, -41, -90, 92, -23, 75, 51, 79, 16, 16, 29, 19},10)==new int[]{-36636, 25776}) {
            System.out.println("Correct");
            rec = "1 case19\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case19\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case20");
        System.out.println("testing with input:");
        System.out.println("{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0");
        System.out.println("expecting output:");
        System.out.println("{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0)));
        // System.out.println(test.derSeq(new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0));
// if (Math.abs(test.derSeq(new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0)-new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0),new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60})) {
// if (test.derSeq(new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60},0)==new int[]{4, 71, 10, 9, 62, -42, -95, -82, -60, 6, -23, 8, 64, -35, -80, -18, 82, 89, 11, -60}) {
            System.out.println("Correct");
            rec = "1 case20\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case20\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case21");
        System.out.println("testing with input:");
        System.out.println("{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0");
        System.out.println("expecting output:");
        System.out.println("{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0)));
        // System.out.println(test.derSeq(new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0));
// if (Math.abs(test.derSeq(new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0)-new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0),new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15})) {
// if (test.derSeq(new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15},0)==new int[]{14, -17, 94, -34, -14, 36, 47, -50, 61, 48, -82, 89, -93, 96, -15}) {
            System.out.println("Correct");
            rec = "1 case21\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case21\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case22");
        System.out.println("testing with input:");
        System.out.println("{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19");
        System.out.println("expecting output:");
        System.out.println("{-52428800}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19)));
        // System.out.println(test.derSeq(new int[]{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19));
// if (Math.abs(test.derSeq(new int[]{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19)-new int[]{-52428800})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19),new int[]{-52428800})) {
// if (test.derSeq(new int[]{100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100, 100, -100},19)==new int[]{-52428800}) {
            System.out.println("Correct");
            rec = "1 case22\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case22\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case23");
        System.out.println("testing with input:");
        System.out.println("{4, 4, 4, 4, 4, 4, 4, 4},3");
        System.out.println("expecting output:");
        System.out.println("{0, 0, 0, 0, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{4, 4, 4, 4, 4, 4, 4, 4},3)));
        // System.out.println(test.derSeq(new int[]{4, 4, 4, 4, 4, 4, 4, 4},3));
// if (Math.abs(test.derSeq(new int[]{4, 4, 4, 4, 4, 4, 4, 4},3)-new int[]{0, 0, 0, 0, 0})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{4, 4, 4, 4, 4, 4, 4, 4},3),new int[]{0, 0, 0, 0, 0})) {
// if (test.derSeq(new int[]{4, 4, 4, 4, 4, 4, 4, 4},3)==new int[]{0, 0, 0, 0, 0}) {
            System.out.println("Correct");
            rec = "1 case23\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case23\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case24");
        System.out.println("testing with input:");
        System.out.println("{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10");
        System.out.println("expecting output:");
        System.out.println("{-5965, 10849, -6951, -5769, 18632}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10)));
        // System.out.println(test.derSeq(new int[]{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10));
// if (Math.abs(test.derSeq(new int[]{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10)-new int[]{-5965, 10849, -6951, -5769, 18632})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10),new int[]{-5965, 10849, -6951, -5769, 18632})) {
// if (test.derSeq(new int[]{39, 29, 1, -23, 12, 4, -29, 39, 10, -19, 99, 12, -39, -16, 2},10)==new int[]{-5965, 10849, -6951, -5769, 18632}) {
            System.out.println("Correct");
            rec = "1 case24\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case24\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case25");
        System.out.println("testing with input:");
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19");
        System.out.println("expecting output:");
        System.out.println("{0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.derSeq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19)));
        // System.out.println(test.derSeq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19));
// if (Math.abs(test.derSeq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19)-new int[]{0})<0.001) {
 if (Arrays.equals(test.derSeq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19),new int[]{0})) {
// if (test.derSeq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},19)==new int[]{0}) {
            System.out.println("Correct");
            rec = "1 case25\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case25\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        System.out.println("Total count " + totalCount);
        System.out.println("Correct count " + correctCount);
}}