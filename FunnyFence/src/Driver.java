
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
        FunnyFence test =  new FunnyFence();
        try {
            Files.write(Paths.get("marker-record"), "".getBytes());
        } catch (IOException e) {}

        totalCount++;
        System.out.println("case1");
        System.out.println("testing with input:");
        System.out.println("\"|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("5");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|")));
         System.out.println(test.getLength("|-|-|"));
// if (Math.abs(test.getLength("|-|-|")-5)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|"),5)) {
 if (test.getLength("|-|-|")==5) {
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
        System.out.println("\"||||||\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("||||||")));
         System.out.println(test.getLength("||||||"));
// if (Math.abs(test.getLength("||||||")-1)<0.001) {
// if (Arrays.equals(test.getLength("||||||"),1)) {
 if (test.getLength("||||||")==1) {
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
        System.out.println("\"|-|---|-|---|-|\"");
        System.out.println("expecting output:");
        System.out.println("5");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|---|-|---|-|")));
         System.out.println(test.getLength("|-|---|-|---|-|"));
// if (Math.abs(test.getLength("|-|---|-|---|-|")-5)<0.001) {
// if (Arrays.equals(test.getLength("|-|---|-|---|-|"),5)) {
 if (test.getLength("|-|---|-|---|-|")==5) {
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
        System.out.println("\"-\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-")));
         System.out.println(test.getLength("-"));
// if (Math.abs(test.getLength("-")-1)<0.001) {
// if (Arrays.equals(test.getLength("-"),1)) {
 if (test.getLength("-")==1) {
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
        System.out.println("\"--\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("--")));
         System.out.println(test.getLength("--"));
// if (Math.abs(test.getLength("--")-1)<0.001) {
// if (Arrays.equals(test.getLength("--"),1)) {
 if (test.getLength("--")==1) {
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
        System.out.println("\"-|\"");
        System.out.println("expecting output:");
        System.out.println("2");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|")));
         System.out.println(test.getLength("-|"));
// if (Math.abs(test.getLength("-|")-2)<0.001) {
// if (Arrays.equals(test.getLength("-|"),2)) {
 if (test.getLength("-|")==2) {
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
        System.out.println("\"|--\"");
        System.out.println("expecting output:");
        System.out.println("2");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|--")));
         System.out.println(test.getLength("|--"));
// if (Math.abs(test.getLength("|--")-2)<0.001) {
// if (Arrays.equals(test.getLength("|--"),2)) {
 if (test.getLength("|--")==2) {
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
        System.out.println("\"|-|\"");
        System.out.println("expecting output:");
        System.out.println("3");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|")));
         System.out.println(test.getLength("|-|"));
// if (Math.abs(test.getLength("|-|")-3)<0.001) {
// if (Arrays.equals(test.getLength("|-|"),3)) {
 if (test.getLength("|-|")==3) {
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
        System.out.println("\"---\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("---")));
         System.out.println(test.getLength("---"));
// if (Math.abs(test.getLength("---")-1)<0.001) {
// if (Arrays.equals(test.getLength("---"),1)) {
 if (test.getLength("---")==1) {
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
        System.out.println("\"--|\"");
        System.out.println("expecting output:");
        System.out.println("2");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("--|")));
         System.out.println(test.getLength("--|"));
// if (Math.abs(test.getLength("--|")-2)<0.001) {
// if (Arrays.equals(test.getLength("--|"),2)) {
 if (test.getLength("--|")==2) {
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
        System.out.println("\"-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("50");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|")));
         System.out.println(test.getLength("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|")-50)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|"),50)) {
 if (test.getLength("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|")==50) {
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
        System.out.println("\"||-|-\"");
        System.out.println("expecting output:");
        System.out.println("4");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("||-|-")));
         System.out.println(test.getLength("||-|-"));
// if (Math.abs(test.getLength("||-|-")-4)<0.001) {
// if (Arrays.equals(test.getLength("||-|-"),4)) {
 if (test.getLength("||-|-")==4) {
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
        System.out.println("\"|-|-|||\"");
        System.out.println("expecting output:");
        System.out.println("5");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|||")));
         System.out.println(test.getLength("|-|-|||"));
// if (Math.abs(test.getLength("|-|-|||")-5)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|||"),5)) {
 if (test.getLength("|-|-|||")==5) {
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
        System.out.println("\"|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("9");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|")-9)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|"),9)) {
 if (test.getLength("|-|-|-|-|")==9) {
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
        System.out.println("\"-|-|-|-|-|-\"");
        System.out.println("expecting output:");
        System.out.println("11");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-|-|-|-")));
         System.out.println(test.getLength("-|-|-|-|-|-"));
// if (Math.abs(test.getLength("-|-|-|-|-|-")-11)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-|-|-|-"),11)) {
 if (test.getLength("-|-|-|-|-|-")==11) {
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
        System.out.println("\"|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("13");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|-|-|")-13)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|-|"),13)) {
 if (test.getLength("|-|-|-|-|-|-|")==13) {
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
        System.out.println("\"|-|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("15");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|-|-|-|")-15)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|-|-|"),15)) {
 if (test.getLength("|-|-|-|-|-|-|-|")==15) {
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
        System.out.println("\"|-|-|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("17");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|-|-|-|-|")-17)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|-|-|-|"),17)) {
 if (test.getLength("|-|-|-|-|-|-|-|-|")==17) {
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
        System.out.println("\"|-|-|-||---|-|-||-|\"");
        System.out.println("expecting output:");
        System.out.println("7");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-||---|-|-||-|")));
         System.out.println(test.getLength("|-|-|-||---|-|-||-|"));
// if (Math.abs(test.getLength("|-|-|-||---|-|-||-|")-7)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-||---|-|-||-|"),7)) {
 if (test.getLength("|-|-|-||---|-|-||-|")==7) {
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
        System.out.println("\"-|-|-|-|-|-|-|-|-|-|-\"");
        System.out.println("expecting output:");
        System.out.println("21");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-|-|-|-|-|-|-|-|-")));
         System.out.println(test.getLength("-|-|-|-|-|-|-|-|-|-|-"));
// if (Math.abs(test.getLength("-|-|-|-|-|-|-|-|-|-|-")-21)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-|-|-|-|-|-|-|-|-"),21)) {
 if (test.getLength("-|-|-|-|-|-|-|-|-|-|-")==21) {
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
        System.out.println("\"|-|-|-|--|-||-|-|-|---|\"");
        System.out.println("expecting output:");
        System.out.println("8");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|--|-||-|-|-|---|")));
         System.out.println(test.getLength("|-|-|-|--|-||-|-|-|---|"));
// if (Math.abs(test.getLength("|-|-|-|--|-||-|-|-|---|")-8)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|--|-||-|-|-|---|"),8)) {
 if (test.getLength("|-|-|-|--|-||-|-|-|---|")==8) {
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
        System.out.println("\"|-|-|-|-|-|--||-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("12");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|--||-|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|-|--||-|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|-|--||-|-|-|-|-|")-12)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|--||-|-|-|-|-|"),12)) {
 if (test.getLength("|-|-|-|-|-|--||-|-|-|-|-|")==12) {
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
        System.out.println("\"|--|-|-||-|-|-|-|-|-|||-||-\"");
        System.out.println("expecting output:");
        System.out.println("13");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|--|-|-||-|-|-|-|-|-|||-||-")));
         System.out.println(test.getLength("|--|-|-||-|-|-|-|-|-|||-||-"));
// if (Math.abs(test.getLength("|--|-|-||-|-|-|-|-|-|||-||-")-13)<0.001) {
// if (Arrays.equals(test.getLength("|--|-|-||-|-|-|-|-|-|||-||-"),13)) {
 if (test.getLength("|--|-|-||-|-|-|-|-|-|||-||-")==13) {
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
        System.out.println("\"|-||-|||-|-||-|-|-|-|-|-|-||-\"");
        System.out.println("expecting output:");
        System.out.println("15");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-||-|||-|-||-|-|-|-|-|-|-||-")));
         System.out.println(test.getLength("|-||-|||-|-||-|-|-|-|-|-|-||-"));
// if (Math.abs(test.getLength("|-||-|||-|-||-|-|-|-|-|-|-||-")-15)<0.001) {
// if (Arrays.equals(test.getLength("|-||-|||-|-||-|-|-|-|-|-|-||-"),15)) {
 if (test.getLength("|-||-|||-|-||-|-|-|-|-|-|-||-")==15) {
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
        System.out.println("\"-|-|-||-||--|-|-||-|-|-|-|--|-|\"");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-||-||--|-|-||-|-|-|-|--|-|")));
         System.out.println(test.getLength("-|-|-||-||--|-|-||-|-|-|-|--|-|"));
// if (Math.abs(test.getLength("-|-|-||-||--|-|-||-|-|-|-|--|-|")-10)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-||-||--|-|-||-|-|-|-|--|-|"),10)) {
 if (test.getLength("-|-|-||-||--|-|-||-|-|-|-|--|-|")==10) {
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
        System.out.println("\"|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--\"");
        System.out.println("expecting output:");
        System.out.println("32");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--")));
         System.out.println(test.getLength("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--"));
// if (Math.abs(test.getLength("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--")-32)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--"),32)) {
 if (test.getLength("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--")==32) {
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
        System.out.println("\"|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-\"");
        System.out.println("expecting output:");
        System.out.println("10");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-")));
         System.out.println(test.getLength("|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-"));
// if (Math.abs(test.getLength("|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-")-10)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-"),10)) {
 if (test.getLength("|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-")==10) {
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
        System.out.println("\"--||-|---|-|-||-||||--||-||-||-||-|--\"");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("--||-|---|-|-||-||||--||-||-||-||-|--")));
         System.out.println(test.getLength("--||-|---|-|-||-||||--||-||-||-||-|--"));
// if (Math.abs(test.getLength("--||-|---|-|-||-||||--||-||-||-||-|--")-6)<0.001) {
// if (Arrays.equals(test.getLength("--||-|---|-|-||-||||--||-||-||-||-|--"),6)) {
 if (test.getLength("--||-|---|-|-||-||||--||-||-||-||-|--")==6) {
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
        System.out.println("\"-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||\"");
        System.out.println("expecting output:");
        System.out.println("12");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||")));
         System.out.println(test.getLength("-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||"));
// if (Math.abs(test.getLength("-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||")-12)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||"),12)) {
 if (test.getLength("-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||")==12) {
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
        System.out.println("\"|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("17");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|")));
         System.out.println(test.getLength("|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|")-17)<0.001) {
// if (Arrays.equals(test.getLength("|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|"),17)) {
 if (test.getLength("|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|")==17) {
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
        System.out.println("\"-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|\"");
        System.out.println("expecting output:");
        System.out.println("25");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|")));
         System.out.println(test.getLength("-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|"));
// if (Math.abs(test.getLength("-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|")-25)<0.001) {
// if (Arrays.equals(test.getLength("-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|"),25)) {
 if (test.getLength("-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|")==25) {
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
        System.out.println("\"-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||\"");
        System.out.println("expecting output:");
        System.out.println("5");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||")));
         System.out.println(test.getLength("-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||"));
// if (Math.abs(test.getLength("-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||")-5)<0.001) {
// if (Arrays.equals(test.getLength("-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||"),5)) {
 if (test.getLength("-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||")==5) {
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
        System.out.println("\"|||||-||--|----||||-||||-----|--||--|||-||-|-|-\"");
        System.out.println("expecting output:");
        System.out.println("6");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|||||-||--|----||||-||||-----|--||--|||-||-|-|-")));
         System.out.println(test.getLength("|||||-||--|----||||-||||-----|--||--|||-||-|-|-"));
// if (Math.abs(test.getLength("|||||-||--|----||||-||||-----|--||--|||-||-|-|-")-6)<0.001) {
// if (Arrays.equals(test.getLength("|||||-||--|----||||-||||-----|--||--|||-||-|-|-"),6)) {
 if (test.getLength("|||||-||--|----||||-||||-----|--||--|||-||-|-|-")==6) {
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
        System.out.println("\"|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||\"");
        System.out.println("expecting output:");
        System.out.println("5");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||")));
         System.out.println(test.getLength("|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||"));
// if (Math.abs(test.getLength("|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||")-5)<0.001) {
// if (Arrays.equals(test.getLength("|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||"),5)) {
 if (test.getLength("|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||")==5) {
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
        System.out.println("\"-\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("-")));
         System.out.println(test.getLength("-"));
// if (Math.abs(test.getLength("-")-1)<0.001) {
// if (Arrays.equals(test.getLength("-"),1)) {
 if (test.getLength("-")==1) {
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
        System.out.println("\"--\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("--")));
         System.out.println(test.getLength("--"));
// if (Math.abs(test.getLength("--")-1)<0.001) {
// if (Arrays.equals(test.getLength("--"),1)) {
 if (test.getLength("--")==1) {
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
        System.out.println("\"|-----|||-------||||||||-----------\"");
        System.out.println("expecting output:");
        System.out.println("2");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|-----|||-------||||||||-----------")));
         System.out.println(test.getLength("|-----|||-------||||||||-----------"));
// if (Math.abs(test.getLength("|-----|||-------||||||||-----------")-2)<0.001) {
// if (Arrays.equals(test.getLength("|-----|||-------||||||||-----------"),2)) {
 if (test.getLength("|-----|||-------||||||||-----------")==2) {
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
        System.out.println("\"|||||||\"");
        System.out.println("expecting output:");
        System.out.println("1");
        System.out.println("received output:");
        // System.out.println(Arrays.toString(test.getLength("|||||||")));
         System.out.println(test.getLength("|||||||"));
// if (Math.abs(test.getLength("|||||||")-1)<0.001) {
// if (Arrays.equals(test.getLength("|||||||"),1)) {
 if (test.getLength("|||||||")==1) {
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


        System.out.println("Total count " + totalCount);
        System.out.println("Correct count " + correctCount);
}}