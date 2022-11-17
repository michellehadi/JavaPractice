
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.File;
public class Driver {
    public static void main(String [] args){
        int correctCount = 0;
        int totalCount = 0;
        String rec;
        FriendlySequences test =  new FriendlySequences();
        try {
            Files.write(Paths.get("marker-record"), "".getBytes());
        } catch (IOException e) {}

        totalCount++;
        System.out.println("case1");
        System.out.println("testing with input:");
        System.out.println("{112, 12, 21, 354, 534345, 345, 2221}");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{112, 12, 21, 354, 534345, 345, 2221})));
         System.out.println(test.count(new int[]{112, 12, 21, 354, 534345, 345, 2221}));
// if (Math.abs(test.count(new int[]{112, 12, 21, 354, 534345, 345, 2221})-6)<0.001) {
// if (Arrays.equals(test.count(new int[]{112, 12, 21, 354, 534345, 345, 2221}),6)) {
 if (test.count(new int[]{112, 12, 21, 354, 534345, 345, 2221})==6) {
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
        System.out.println("{0, 0, 0, 0}");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 0, 0, 0})));
         System.out.println(test.count(new int[]{0, 0, 0, 0}));
// if (Math.abs(test.count(new int[]{0, 0, 0, 0})-6)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 0, 0, 0}),6)) {
 if (test.count(new int[]{0, 0, 0, 0})==6) {
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
        System.out.println("{}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{})));
         System.out.println(test.count(new int[]{}));
// if (Math.abs(test.count(new int[]{})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{}),0)) {
 if (test.count(new int[]{})==0) {
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
        System.out.println("{970313}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{970313})));
         System.out.println(test.count(new int[]{970313}));
// if (Math.abs(test.count(new int[]{970313})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{970313}),0)) {
 if (test.count(new int[]{970313})==0) {
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
        System.out.println("{4, 547202, 0}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{4, 547202, 0})));
         System.out.println(test.count(new int[]{4, 547202, 0}));
// if (Math.abs(test.count(new int[]{4, 547202, 0})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{4, 547202, 0}),0)) {
 if (test.count(new int[]{4, 547202, 0})==0) {
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
        System.out.println("{486691, 419848666, 684914668, 648694861, 149468686}");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{486691, 419848666, 684914668, 648694861, 149468686})));
         System.out.println(test.count(new int[]{486691, 419848666, 684914668, 648694861, 149468686}));
// if (Math.abs(test.count(new int[]{486691, 419848666, 684914668, 648694861, 149468686})-10)<0.001) {
// if (Arrays.equals(test.count(new int[]{486691, 419848666, 684914668, 648694861, 149468686}),10)) {
 if (test.count(new int[]{486691, 419848666, 684914668, 648694861, 149468686})==10) {
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
        System.out.println("{239534, 243923935, 393925342, 432939235, 993334225, 4, 8}");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{239534, 243923935, 393925342, 432939235, 993334225, 4, 8})));
         System.out.println(test.count(new int[]{239534, 243923935, 393925342, 432939235, 993334225, 4, 8}));
// if (Math.abs(test.count(new int[]{239534, 243923935, 393925342, 432939235, 993334225, 4, 8})-10)<0.001) {
// if (Arrays.equals(test.count(new int[]{239534, 243923935, 393925342, 432939235, 993334225, 4, 8}),10)) {
 if (test.count(new int[]{239534, 243923935, 393925342, 432939235, 993334225, 4, 8})==10) {
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
        System.out.println("{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488}");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488})));
         System.out.println(test.count(new int[]{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488}));
// if (Math.abs(test.count(new int[]{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488})-10)<0.001) {
// if (Arrays.equals(test.count(new int[]{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488}),10)) {
 if (test.count(new int[]{9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488})==10) {
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
        System.out.println("{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4}");
        System.out.println("expecting output:");
        System.out.println("2");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4})));
         System.out.println(test.count(new int[]{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4}));
// if (Math.abs(test.count(new int[]{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4})-2)<0.001) {
// if (Arrays.equals(test.count(new int[]{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4}),2)) {
 if (test.count(new int[]{8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4})==2) {
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
        System.out.println("{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5}");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5})));
         System.out.println(test.count(new int[]{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5}));
// if (Math.abs(test.count(new int[]{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5})-1)<0.001) {
// if (Arrays.equals(test.count(new int[]{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5}),1)) {
 if (test.count(new int[]{2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5})==1) {
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
        System.out.println("{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8})));
         System.out.println(test.count(new int[]{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8}));
// if (Math.abs(test.count(new int[]{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8}),0)) {
 if (test.count(new int[]{1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8})==0) {
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
        System.out.println("{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8}");
        System.out.println("expecting output:");
        System.out.println("4");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8})));
         System.out.println(test.count(new int[]{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8}));
// if (Math.abs(test.count(new int[]{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8})-4)<0.001) {
// if (Arrays.equals(test.count(new int[]{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8}),4)) {
 if (test.count(new int[]{6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8})==4) {
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
        System.out.println("{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2})));
         System.out.println(test.count(new int[]{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2}));
// if (Math.abs(test.count(new int[]{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2}),0)) {
 if (test.count(new int[]{8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2})==0) {
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
        System.out.println("{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0}");
        System.out.println("expecting output:");
        System.out.println("29");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0})));
         System.out.println(test.count(new int[]{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0}));
// if (Math.abs(test.count(new int[]{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0})-29)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0}),29)) {
 if (test.count(new int[]{0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0})==29) {
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
        System.out.println("{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4}");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4})));
         System.out.println(test.count(new int[]{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4}));
// if (Math.abs(test.count(new int[]{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4})-1)<0.001) {
// if (Arrays.equals(test.count(new int[]{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4}),1)) {
 if (test.count(new int[]{3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4})==1) {
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
        System.out.println("{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2}");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2})));
         System.out.println(test.count(new int[]{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2}));
// if (Math.abs(test.count(new int[]{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2})-6)<0.001) {
// if (Arrays.equals(test.count(new int[]{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2}),6)) {
 if (test.count(new int[]{7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2})==6) {
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
        System.out.println("{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0}");
        System.out.println("expecting output:");
        System.out.println("88");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0})));
         System.out.println(test.count(new int[]{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0}));
// if (Math.abs(test.count(new int[]{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0})-88)<0.001) {
// if (Arrays.equals(test.count(new int[]{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0}),88)) {
 if (test.count(new int[]{9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0})==88) {
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
        System.out.println("{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3}");
        System.out.println("expecting output:");
        System.out.println("37");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3})));
         System.out.println(test.count(new int[]{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3}));
// if (Math.abs(test.count(new int[]{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3})-37)<0.001) {
// if (Arrays.equals(test.count(new int[]{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3}),37)) {
 if (test.count(new int[]{2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3})==37) {
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
        System.out.println("{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4}");
        System.out.println("expecting output:");
        System.out.println("4");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4})));
         System.out.println(test.count(new int[]{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4}));
// if (Math.abs(test.count(new int[]{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4})-4)<0.001) {
// if (Arrays.equals(test.count(new int[]{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4}),4)) {
 if (test.count(new int[]{4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4})==4) {
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
        System.out.println("{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4}");
        System.out.println("expecting output:");
        System.out.println("15");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4})));
         System.out.println(test.count(new int[]{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4}));
// if (Math.abs(test.count(new int[]{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4})-15)<0.001) {
// if (Arrays.equals(test.count(new int[]{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4}),15)) {
 if (test.count(new int[]{7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4})==15) {
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
        System.out.println("{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0}");
        System.out.println("expecting output:");
        System.out.println("35");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0})));
         System.out.println(test.count(new int[]{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0}));
// if (Math.abs(test.count(new int[]{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0})-35)<0.001) {
// if (Arrays.equals(test.count(new int[]{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0}),35)) {
 if (test.count(new int[]{2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0})==35) {
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
        System.out.println("{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5}");
        System.out.println("expecting output:");
        System.out.println("67");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5})));
         System.out.println(test.count(new int[]{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5}));
// if (Math.abs(test.count(new int[]{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5})-67)<0.001) {
// if (Arrays.equals(test.count(new int[]{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5}),67)) {
 if (test.count(new int[]{3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5})==67) {
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
        System.out.println("{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893}");
        System.out.println("expecting output:");
        System.out.println("101");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893})));
         System.out.println(test.count(new int[]{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893}));
// if (Math.abs(test.count(new int[]{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893})-101)<0.001) {
// if (Arrays.equals(test.count(new int[]{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893}),101)) {
 if (test.count(new int[]{1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893})==101) {
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
        System.out.println("{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369}");
        System.out.println("expecting output:");
        System.out.println("13");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369})));
         System.out.println(test.count(new int[]{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369}));
// if (Math.abs(test.count(new int[]{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369})-13)<0.001) {
// if (Arrays.equals(test.count(new int[]{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369}),13)) {
 if (test.count(new int[]{2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369})==13) {
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
        System.out.println("{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4}");
        System.out.println("expecting output:");
        System.out.println("18");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4})));
         System.out.println(test.count(new int[]{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4}));
// if (Math.abs(test.count(new int[]{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4})-18)<0.001) {
// if (Arrays.equals(test.count(new int[]{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4}),18)) {
 if (test.count(new int[]{5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4})==18) {
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


        totalCount++;
        System.out.println("case26");
        System.out.println("testing with input:");
        System.out.println("{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6}");
        System.out.println("expecting output:");
        System.out.println("438");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6})));
         System.out.println(test.count(new int[]{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6}));
// if (Math.abs(test.count(new int[]{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6})-438)<0.001) {
// if (Arrays.equals(test.count(new int[]{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6}),438)) {
 if (test.count(new int[]{6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6})==438) {
            System.out.println("Correct");
            rec = "1 case26\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case26\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case27");
        System.out.println("testing with input:");
        System.out.println("{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343}");
        System.out.println("expecting output:");
        System.out.println("564");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343})));
         System.out.println(test.count(new int[]{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343}));
// if (Math.abs(test.count(new int[]{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343})-564)<0.001) {
// if (Arrays.equals(test.count(new int[]{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343}),564)) {
 if (test.count(new int[]{1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343})==564) {
            System.out.println("Correct");
            rec = "1 case27\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case27\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case28");
        System.out.println("testing with input:");
        System.out.println("{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3}");
        System.out.println("expecting output:");
        System.out.println("79");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3})));
         System.out.println(test.count(new int[]{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3}));
// if (Math.abs(test.count(new int[]{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3})-79)<0.001) {
// if (Arrays.equals(test.count(new int[]{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3}),79)) {
 if (test.count(new int[]{7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3})==79) {
            System.out.println("Correct");
            rec = "1 case28\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case28\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case29");
        System.out.println("testing with input:");
        System.out.println("{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}");
        System.out.println("expecting output:");
        System.out.println("1225");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000})));
         System.out.println(test.count(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}));
// if (Math.abs(test.count(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000})-1225)<0.001) {
// if (Arrays.equals(test.count(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}),1225)) {
 if (test.count(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000})==1225) {
            System.out.println("Correct");
            rec = "1 case29\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case29\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case30");
        System.out.println("testing with input:");
        System.out.println("{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}");
        System.out.println("expecting output:");
        System.out.println("1225");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})));
         System.out.println(test.count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
// if (Math.abs(test.count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})-1225)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),1225)) {
 if (test.count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})==1225) {
            System.out.println("Correct");
            rec = "1 case30\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case30\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case31");
        System.out.println("testing with input:");
        System.out.println("{11112222, 111222, 1122, 12, 1111122222}");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{11112222, 111222, 1122, 12, 1111122222})));
         System.out.println(test.count(new int[]{11112222, 111222, 1122, 12, 1111122222}));
// if (Math.abs(test.count(new int[]{11112222, 111222, 1122, 12, 1111122222})-10)<0.001) {
// if (Arrays.equals(test.count(new int[]{11112222, 111222, 1122, 12, 1111122222}),10)) {
 if (test.count(new int[]{11112222, 111222, 1122, 12, 1111122222})==10) {
            System.out.println("Correct");
            rec = "1 case31\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case31\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case32");
        System.out.println("testing with input:");
        System.out.println("{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111}");
        System.out.println("expecting output:");
        System.out.println("18");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111})));
         System.out.println(test.count(new int[]{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111}));
// if (Math.abs(test.count(new int[]{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111})-18)<0.001) {
// if (Arrays.equals(test.count(new int[]{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111}),18)) {
 if (test.count(new int[]{10, 1100, 10101, 111, 1111, 11111, 11, 1, 111})==18) {
            System.out.println("Correct");
            rec = "1 case32\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case32\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case33");
        System.out.println("testing with input:");
        System.out.println("{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333}");
        System.out.println("expecting output:");
        System.out.println("1225");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333})));
         System.out.println(test.count(new int[]{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333}));
// if (Math.abs(test.count(new int[]{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333})-1225)<0.001) {
// if (Arrays.equals(test.count(new int[]{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333}),1225)) {
 if (test.count(new int[]{123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333})==1225) {
            System.out.println("Correct");
            rec = "1 case33\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case33\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case34");
        System.out.println("testing with input:");
        System.out.println("{0, 10}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 10})));
         System.out.println(test.count(new int[]{0, 10}));
// if (Math.abs(test.count(new int[]{0, 10})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 10}),0)) {
 if (test.count(new int[]{0, 10})==0) {
            System.out.println("Correct");
            rec = "1 case34\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case34\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case35");
        System.out.println("testing with input:");
        System.out.println("{13, 123}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{13, 123})));
         System.out.println(test.count(new int[]{13, 123}));
// if (Math.abs(test.count(new int[]{13, 123})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{13, 123}),0)) {
 if (test.count(new int[]{13, 123})==0) {
            System.out.println("Correct");
            rec = "1 case35\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case35\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case36");
        System.out.println("testing with input:");
        System.out.println("{1, 12}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{1, 12})));
         System.out.println(test.count(new int[]{1, 12}));
// if (Math.abs(test.count(new int[]{1, 12})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{1, 12}),0)) {
 if (test.count(new int[]{1, 12})==0) {
            System.out.println("Correct");
            rec = "1 case36\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case36\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case37");
        System.out.println("testing with input:");
        System.out.println("{0, 0, 0, 0, 0, 0}");
        System.out.println("expecting output:");
        System.out.println("15");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 0, 0, 0, 0, 0})));
         System.out.println(test.count(new int[]{0, 0, 0, 0, 0, 0}));
// if (Math.abs(test.count(new int[]{0, 0, 0, 0, 0, 0})-15)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 0, 0, 0, 0, 0}),15)) {
 if (test.count(new int[]{0, 0, 0, 0, 0, 0})==15) {
            System.out.println("Correct");
            rec = "1 case37\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case37\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case38");
        System.out.println("testing with input:");
        System.out.println("{0, 0, 0, 0}");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{0, 0, 0, 0})));
         System.out.println(test.count(new int[]{0, 0, 0, 0}));
// if (Math.abs(test.count(new int[]{0, 0, 0, 0})-6)<0.001) {
// if (Arrays.equals(test.count(new int[]{0, 0, 0, 0}),6)) {
 if (test.count(new int[]{0, 0, 0, 0})==6) {
            System.out.println("Correct");
            rec = "1 case38\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case38\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        totalCount++;
        System.out.println("case39");
        System.out.println("testing with input:");
        System.out.println("{19, 11}");
        System.out.println("expecting output:");
        System.out.println("0");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.count(new int[]{19, 11})));
         System.out.println(test.count(new int[]{19, 11}));
// if (Math.abs(test.count(new int[]{19, 11})-0)<0.001) {
// if (Arrays.equals(test.count(new int[]{19, 11}),0)) {
 if (test.count(new int[]{19, 11})==0) {
            System.out.println("Correct");
            rec = "1 case39\n";
            correctCount++;
        } else {
            System.out.println("Incorrect");
            rec = "0 case39\n";
        }
        try {
            Files.write(Paths.get("marker-record"), rec.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {}
        System.out.println("");


        System.out.println("Total count " + totalCount);
        System.out.println("Correct count " + correctCount);
}}