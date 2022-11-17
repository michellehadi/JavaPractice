
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.File;
public class HealthFoodDriver {
    public static void main(String [] args){
        int correctCount = 0;
        int totalCount = 0;
        String rec;
        HealthFood test =  new HealthFood();
        try {
            Files.write(Paths.get("marker-record"), "".getBytes());
        } catch (IOException e) {}

        totalCount++;
        System.out.println("case1");
        System.out.println("testing with input:");
        System.out.println("{3, 4},{2, 8},{5, 2},{\"P\", \"p\", \"C\", \"c\", \"F\", \"f\", \"T\", \"t\"}");
        System.out.println("expecting output:");
        System.out.println("{1, 0, 1, 0, 0, 1, 1, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{3, 4},new int[]{2, 8},new int[]{5, 2},new String[]{"P", "p", "C", "c", "F", "f", "T", "t"})));
        // System.out.println(test.selectMeals(new int[]{3, 4},new int[]{2, 8},new int[]{5, 2},new String[]{"P", "p", "C", "c", "F", "f", "T", "t"}));
// if (Math.abs(test.selectMeals(new int[]{3, 4},new int[]{2, 8},new int[]{5, 2},new String[]{"P", "p", "C", "c", "F", "f", "T", "t"})-new int[]{1, 0, 1, 0, 0, 1, 1, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{3, 4},new int[]{2, 8},new int[]{5, 2},new String[]{"P", "p", "C", "c", "F", "f", "T", "t"}),new int[]{1, 0, 1, 0, 0, 1, 1, 0})) {
// if (test.selectMeals(new int[]{3, 4},new int[]{2, 8},new int[]{5, 2},new String[]{"P", "p", "C", "c", "F", "f", "T", "t"})==new int[]{1, 0, 1, 0, 0, 1, 1, 0}) {
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
        System.out.println("{3, 4, 1, 5},{2, 8, 5, 1},{5, 2, 4, 4},{\"tf\", \"cF\", \"PC\", \"FTCP\"}");
        System.out.println("expecting output:");
        System.out.println("{2, 3, 3, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{3, 4, 1, 5},new int[]{2, 8, 5, 1},new int[]{5, 2, 4, 4},new String[]{"tf", "cF", "PC", "FTCP"})));
        // System.out.println(test.selectMeals(new int[]{3, 4, 1, 5},new int[]{2, 8, 5, 1},new int[]{5, 2, 4, 4},new String[]{"tf", "cF", "PC", "FTCP"}));
// if (Math.abs(test.selectMeals(new int[]{3, 4, 1, 5},new int[]{2, 8, 5, 1},new int[]{5, 2, 4, 4},new String[]{"tf", "cF", "PC", "FTCP"})-new int[]{2, 3, 3, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{3, 4, 1, 5},new int[]{2, 8, 5, 1},new int[]{5, 2, 4, 4},new String[]{"tf", "cF", "PC", "FTCP"}),new int[]{2, 3, 3, 0})) {
// if (test.selectMeals(new int[]{3, 4, 1, 5},new int[]{2, 8, 5, 1},new int[]{5, 2, 4, 4},new String[]{"tf", "cF", "PC", "FTCP"})==new int[]{2, 3, 3, 0}) {
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
        System.out.println("{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},{\"cF\", \"Ccp\", \"T\", \"TPFP\", \"CCTf\", \"Fpp\", \"Tf\", \"tP\", \"Pc\", \"T\", \"\", \"pPf\", \"PT\"}");
        System.out.println("expecting output:");
        System.out.println("{15, 29, 13, 13, 29, 13, 13, 23, 2, 13, 0, 26, 2}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},new int[]{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},new int[]{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},new String[]{"cF", "Ccp", "T", "TPFP", "CCTf", "Fpp", "Tf", "tP", "Pc", "T", "", "pPf", "PT"})));
        // System.out.println(test.selectMeals(new int[]{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},new int[]{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},new int[]{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},new String[]{"cF", "Ccp", "T", "TPFP", "CCTf", "Fpp", "Tf", "tP", "Pc", "T", "", "pPf", "PT"}));
// if (Math.abs(test.selectMeals(new int[]{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},new int[]{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},new int[]{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},new String[]{"cF", "Ccp", "T", "TPFP", "CCTf", "Fpp", "Tf", "tP", "Pc", "T", "", "pPf", "PT"})-new int[]{15, 29, 13, 13, 29, 13, 13, 23, 2, 13, 0, 26, 2})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},new int[]{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},new int[]{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},new String[]{"cF", "Ccp", "T", "TPFP", "CCTf", "Fpp", "Tf", "tP", "Pc", "T", "", "pPf", "PT"}),new int[]{15, 29, 13, 13, 29, 13, 13, 23, 2, 13, 0, 26, 2})) {
// if (test.selectMeals(new int[]{21, 76, 96, 7, 6, 76, 59, 52, 90, 93, 27, 12, 38, 88, 53, 38, 81, 27, 61, 59, 10, 85, 65, 38, 16, 57, 6, 62, 26, 10, 17, 39, 92, 52, 9, 39, 83, 22},new int[]{90, 51, 20, 19, 97, 61, 23, 41, 68, 64, 87, 56, 27, 96, 86, 0, 99, 92, 96, 98, 44, 67, 53, 1, 33, 27, 22, 70, 23, 99, 5, 56, 83, 88, 63, 35, 22, 65},new int[]{67, 42, 66, 69, 81, 47, 32, 43, 57, 50, 58, 91, 64, 99, 28, 61, 40, 35, 44, 53, 68, 70, 14, 49, 77, 68, 66, 78, 70, 81, 83, 90, 73, 82, 73, 68, 15, 41},new String[]{"cF", "Ccp", "T", "TPFP", "CCTf", "Fpp", "Tf", "tP", "Pc", "T", "", "pPf", "PT"})==new int[]{15, 29, 13, 13, 29, 13, 13, 23, 2, 13, 0, 26, 2}) {
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
        System.out.println("{5, 0, 23, 28, 8, 20},{98, 22, 98, 71, 29, 8},{20, 81, 84, 23, 77, 40},{\"Fc\", \"PP\", \"tF\", \"\", \"t\", \"CtPT\", \"p\", \"C\", \"FPFc\", \"fpCc\", \"c\", \"TF\", \"Fftp\"}");
        System.out.println("expecting output:");
        System.out.println("{2, 3, 5, 0, 5, 0, 1, 0, 2, 0, 5, 2, 2}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{5, 0, 23, 28, 8, 20},new int[]{98, 22, 98, 71, 29, 8},new int[]{20, 81, 84, 23, 77, 40},new String[]{"Fc", "PP", "tF", "", "t", "CtPT", "p", "C", "FPFc", "fpCc", "c", "TF", "Fftp"})));
        // System.out.println(test.selectMeals(new int[]{5, 0, 23, 28, 8, 20},new int[]{98, 22, 98, 71, 29, 8},new int[]{20, 81, 84, 23, 77, 40},new String[]{"Fc", "PP", "tF", "", "t", "CtPT", "p", "C", "FPFc", "fpCc", "c", "TF", "Fftp"}));
// if (Math.abs(test.selectMeals(new int[]{5, 0, 23, 28, 8, 20},new int[]{98, 22, 98, 71, 29, 8},new int[]{20, 81, 84, 23, 77, 40},new String[]{"Fc", "PP", "tF", "", "t", "CtPT", "p", "C", "FPFc", "fpCc", "c", "TF", "Fftp"})-new int[]{2, 3, 5, 0, 5, 0, 1, 0, 2, 0, 5, 2, 2})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{5, 0, 23, 28, 8, 20},new int[]{98, 22, 98, 71, 29, 8},new int[]{20, 81, 84, 23, 77, 40},new String[]{"Fc", "PP", "tF", "", "t", "CtPT", "p", "C", "FPFc", "fpCc", "c", "TF", "Fftp"}),new int[]{2, 3, 5, 0, 5, 0, 1, 0, 2, 0, 5, 2, 2})) {
// if (test.selectMeals(new int[]{5, 0, 23, 28, 8, 20},new int[]{98, 22, 98, 71, 29, 8},new int[]{20, 81, 84, 23, 77, 40},new String[]{"Fc", "PP", "tF", "", "t", "CtPT", "p", "C", "FPFc", "fpCc", "c", "TF", "Fftp"})==new int[]{2, 3, 5, 0, 5, 0, 1, 0, 2, 0, 5, 2, 2}) {
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
        System.out.println("{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},{\"\", \"pCct\", \"p\", \"\", \"FPFF\", \"FpF\", \"f\", \"tcC\", \"\", \"Pctp\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 2, 2, 0, 11, 11, 12, 0, 0, 13}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},new int[]{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},new int[]{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},new String[]{"", "pCct", "p", "", "FPFF", "FpF", "f", "tcC", "", "Pctp"})));
        // System.out.println(test.selectMeals(new int[]{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},new int[]{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},new int[]{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},new String[]{"", "pCct", "p", "", "FPFF", "FpF", "f", "tcC", "", "Pctp"}));
// if (Math.abs(test.selectMeals(new int[]{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},new int[]{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},new int[]{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},new String[]{"", "pCct", "p", "", "FPFF", "FpF", "f", "tcC", "", "Pctp"})-new int[]{0, 2, 2, 0, 11, 11, 12, 0, 0, 13})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},new int[]{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},new int[]{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},new String[]{"", "pCct", "p", "", "FPFF", "FpF", "f", "tcC", "", "Pctp"}),new int[]{0, 2, 2, 0, 11, 11, 12, 0, 0, 13})) {
// if (test.selectMeals(new int[]{36, 26, 7, 50, 35, 37, 74, 81, 76, 36, 35, 42, 77, 100, 75, 69, 93, 94, 91, 42},new int[]{32, 23, 84, 44, 6, 87, 62, 32, 98, 69, 73, 44, 53, 59, 65, 18, 7, 80, 64, 53},new int[]{30, 63, 90, 76, 89, 30, 81, 50, 52, 10, 56, 99, 4, 79, 98, 59, 96, 20, 58, 54},new String[]{"", "pCct", "p", "", "FPFF", "FpF", "f", "tcC", "", "Pctp"})==new int[]{0, 2, 2, 0, 11, 11, 12, 0, 0, 13}) {
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
        System.out.println("{27, 62, 69, 57, 35},{69, 88, 15, 46, 2},{9, 1, 50, 26, 56},{\"FF\", \"cCpP\", \"T\", \"TpCP\", \"\", \"Cc\", \"FP\", \"ppT\", \"tt\", \"Pf\", \"fF\", \"\", \"CTfp\", \"ccpp\", \"Cp\", \"Fpt\", \"ctf\", \"TC\", \"FP\", \"F\", \"cF\", \"ppf\", \"tp\", \"PTT\", \"P\", \"\", \"ffp\", \"PcC\", \"Pcf\", \"p\", \"cPfF\", \"ppP\", \"p\", \"Ppcf\", \"CpF\"}");
        System.out.println("expecting output:");
        System.out.println("{4, 4, 2, 2, 0, 1, 4, 0, 0, 2, 1, 0, 1, 4, 1, 4, 4, 2, 4, 4, 4, 0, 0, 2, 2, 0, 1, 2, 2, 0, 4, 0, 0, 2, 1}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{27, 62, 69, 57, 35},new int[]{69, 88, 15, 46, 2},new int[]{9, 1, 50, 26, 56},new String[]{"FF", "cCpP", "T", "TpCP", "", "Cc", "FP", "ppT", "tt", "Pf", "fF", "", "CTfp", "ccpp", "Cp", "Fpt", "ctf", "TC", "FP", "F", "cF", "ppf", "tp", "PTT", "P", "", "ffp", "PcC", "Pcf", "p", "cPfF", "ppP", "p", "Ppcf", "CpF"})));
        // System.out.println(test.selectMeals(new int[]{27, 62, 69, 57, 35},new int[]{69, 88, 15, 46, 2},new int[]{9, 1, 50, 26, 56},new String[]{"FF", "cCpP", "T", "TpCP", "", "Cc", "FP", "ppT", "tt", "Pf", "fF", "", "CTfp", "ccpp", "Cp", "Fpt", "ctf", "TC", "FP", "F", "cF", "ppf", "tp", "PTT", "P", "", "ffp", "PcC", "Pcf", "p", "cPfF", "ppP", "p", "Ppcf", "CpF"}));
// if (Math.abs(test.selectMeals(new int[]{27, 62, 69, 57, 35},new int[]{69, 88, 15, 46, 2},new int[]{9, 1, 50, 26, 56},new String[]{"FF", "cCpP", "T", "TpCP", "", "Cc", "FP", "ppT", "tt", "Pf", "fF", "", "CTfp", "ccpp", "Cp", "Fpt", "ctf", "TC", "FP", "F", "cF", "ppf", "tp", "PTT", "P", "", "ffp", "PcC", "Pcf", "p", "cPfF", "ppP", "p", "Ppcf", "CpF"})-new int[]{4, 4, 2, 2, 0, 1, 4, 0, 0, 2, 1, 0, 1, 4, 1, 4, 4, 2, 4, 4, 4, 0, 0, 2, 2, 0, 1, 2, 2, 0, 4, 0, 0, 2, 1})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{27, 62, 69, 57, 35},new int[]{69, 88, 15, 46, 2},new int[]{9, 1, 50, 26, 56},new String[]{"FF", "cCpP", "T", "TpCP", "", "Cc", "FP", "ppT", "tt", "Pf", "fF", "", "CTfp", "ccpp", "Cp", "Fpt", "ctf", "TC", "FP", "F", "cF", "ppf", "tp", "PTT", "P", "", "ffp", "PcC", "Pcf", "p", "cPfF", "ppP", "p", "Ppcf", "CpF"}),new int[]{4, 4, 2, 2, 0, 1, 4, 0, 0, 2, 1, 0, 1, 4, 1, 4, 4, 2, 4, 4, 4, 0, 0, 2, 2, 0, 1, 2, 2, 0, 4, 0, 0, 2, 1})) {
// if (test.selectMeals(new int[]{27, 62, 69, 57, 35},new int[]{69, 88, 15, 46, 2},new int[]{9, 1, 50, 26, 56},new String[]{"FF", "cCpP", "T", "TpCP", "", "Cc", "FP", "ppT", "tt", "Pf", "fF", "", "CTfp", "ccpp", "Cp", "Fpt", "ctf", "TC", "FP", "F", "cF", "ppf", "tp", "PTT", "P", "", "ffp", "PcC", "Pcf", "p", "cPfF", "ppP", "p", "Ppcf", "CpF"})==new int[]{4, 4, 2, 2, 0, 1, 4, 0, 0, 2, 1, 0, 1, 4, 1, 4, 4, 2, 4, 4, 4, 0, 0, 2, 2, 0, 1, 2, 2, 0, 4, 0, 0, 2, 1}) {
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
        System.out.println("{41},{67},{11},{\"tFpT\", \"Fp\", \"TC\", \"ttCF\", \"\", \"\", \"fc\", \"pPCF\", \"C\", \"Ptc\", \"\", \"fPPp\", \"CtF\", \"Cp\", \"\", \"\", \"fFfP\", \"\", \"Ppcp\", \"tFf\", \"Cf\", \"fFp\", \"C\", \"ctp\", \"\", \"\", \"Fc\", \"\", \"\", \"Ft\", \"\", \"Tfp\", \"t\", \"CCc\", \"Ct\", \"ftPp\", \"ppT\", \"fp\", \"C\", \"\", \"\", \"Pt\", \"\", \"\", \"tP\", \"fFC\", \"pccC\", \"\", \"PtC\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{41},new int[]{67},new int[]{11},new String[]{"tFpT", "Fp", "TC", "ttCF", "", "", "fc", "pPCF", "C", "Ptc", "", "fPPp", "CtF", "Cp", "", "", "fFfP", "", "Ppcp", "tFf", "Cf", "fFp", "C", "ctp", "", "", "Fc", "", "", "Ft", "", "Tfp", "t", "CCc", "Ct", "ftPp", "ppT", "fp", "C", "", "", "Pt", "", "", "tP", "fFC", "pccC", "", "PtC"})));
        // System.out.println(test.selectMeals(new int[]{41},new int[]{67},new int[]{11},new String[]{"tFpT", "Fp", "TC", "ttCF", "", "", "fc", "pPCF", "C", "Ptc", "", "fPPp", "CtF", "Cp", "", "", "fFfP", "", "Ppcp", "tFf", "Cf", "fFp", "C", "ctp", "", "", "Fc", "", "", "Ft", "", "Tfp", "t", "CCc", "Ct", "ftPp", "ppT", "fp", "C", "", "", "Pt", "", "", "tP", "fFC", "pccC", "", "PtC"}));
// if (Math.abs(test.selectMeals(new int[]{41},new int[]{67},new int[]{11},new String[]{"tFpT", "Fp", "TC", "ttCF", "", "", "fc", "pPCF", "C", "Ptc", "", "fPPp", "CtF", "Cp", "", "", "fFfP", "", "Ppcp", "tFf", "Cf", "fFp", "C", "ctp", "", "", "Fc", "", "", "Ft", "", "Tfp", "t", "CCc", "Ct", "ftPp", "ppT", "fp", "C", "", "", "Pt", "", "", "tP", "fFC", "pccC", "", "PtC"})-new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{41},new int[]{67},new int[]{11},new String[]{"tFpT", "Fp", "TC", "ttCF", "", "", "fc", "pPCF", "C", "Ptc", "", "fPPp", "CtF", "Cp", "", "", "fFfP", "", "Ppcp", "tFf", "Cf", "fFp", "C", "ctp", "", "", "Fc", "", "", "Ft", "", "Tfp", "t", "CCc", "Ct", "ftPp", "ppT", "fp", "C", "", "", "Pt", "", "", "tP", "fFC", "pccC", "", "PtC"}),new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})) {
// if (test.selectMeals(new int[]{41},new int[]{67},new int[]{11},new String[]{"tFpT", "Fp", "TC", "ttCF", "", "", "fc", "pPCF", "C", "Ptc", "", "fPPp", "CtF", "Cp", "", "", "fFfP", "", "Ppcp", "tFf", "Cf", "fFp", "C", "ctp", "", "", "Fc", "", "", "Ft", "", "Tfp", "t", "CCc", "Ct", "ftPp", "ppT", "fp", "C", "", "", "Pt", "", "", "tP", "fFC", "pccC", "", "PtC"})==new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}) {
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
        System.out.println("{57, 99, 43},{62, 68, 67},{26, 88, 90},{\"ctpt\", \"TPP\", \"Cfff\", \"\", \"P\", \"pF\", \"TCFP\", \"C\", \"Ft\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 1, 1, 0, 1, 2, 1, 1, 2}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{57, 99, 43},new int[]{62, 68, 67},new int[]{26, 88, 90},new String[]{"ctpt", "TPP", "Cfff", "", "P", "pF", "TCFP", "C", "Ft"})));
        // System.out.println(test.selectMeals(new int[]{57, 99, 43},new int[]{62, 68, 67},new int[]{26, 88, 90},new String[]{"ctpt", "TPP", "Cfff", "", "P", "pF", "TCFP", "C", "Ft"}));
// if (Math.abs(test.selectMeals(new int[]{57, 99, 43},new int[]{62, 68, 67},new int[]{26, 88, 90},new String[]{"ctpt", "TPP", "Cfff", "", "P", "pF", "TCFP", "C", "Ft"})-new int[]{0, 1, 1, 0, 1, 2, 1, 1, 2})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{57, 99, 43},new int[]{62, 68, 67},new int[]{26, 88, 90},new String[]{"ctpt", "TPP", "Cfff", "", "P", "pF", "TCFP", "C", "Ft"}),new int[]{0, 1, 1, 0, 1, 2, 1, 1, 2})) {
// if (test.selectMeals(new int[]{57, 99, 43},new int[]{62, 68, 67},new int[]{26, 88, 90},new String[]{"ctpt", "TPP", "Cfff", "", "P", "pF", "TCFP", "C", "Ft"})==new int[]{0, 1, 1, 0, 1, 2, 1, 1, 2}) {
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
        System.out.println("{27, 100, 51, 29, 39},{84, 22, 97, 72, 5},{27, 44, 45, 27, 30},{\"\", \"f\", \"\", \"Cc\", \"fCCC\", \"CtF\", \"Cf\", \"\", \"\", \"tp\", \"Fpp\", \"\", \"\", \"\", \"PP\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 0, 0, 2, 0, 2, 2, 0, 0, 4, 2, 0, 0, 0, 1}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{27, 100, 51, 29, 39},new int[]{84, 22, 97, 72, 5},new int[]{27, 44, 45, 27, 30},new String[]{"", "f", "", "Cc", "fCCC", "CtF", "Cf", "", "", "tp", "Fpp", "", "", "", "PP"})));
        // System.out.println(test.selectMeals(new int[]{27, 100, 51, 29, 39},new int[]{84, 22, 97, 72, 5},new int[]{27, 44, 45, 27, 30},new String[]{"", "f", "", "Cc", "fCCC", "CtF", "Cf", "", "", "tp", "Fpp", "", "", "", "PP"}));
// if (Math.abs(test.selectMeals(new int[]{27, 100, 51, 29, 39},new int[]{84, 22, 97, 72, 5},new int[]{27, 44, 45, 27, 30},new String[]{"", "f", "", "Cc", "fCCC", "CtF", "Cf", "", "", "tp", "Fpp", "", "", "", "PP"})-new int[]{0, 0, 0, 2, 0, 2, 2, 0, 0, 4, 2, 0, 0, 0, 1})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{27, 100, 51, 29, 39},new int[]{84, 22, 97, 72, 5},new int[]{27, 44, 45, 27, 30},new String[]{"", "f", "", "Cc", "fCCC", "CtF", "Cf", "", "", "tp", "Fpp", "", "", "", "PP"}),new int[]{0, 0, 0, 2, 0, 2, 2, 0, 0, 4, 2, 0, 0, 0, 1})) {
// if (test.selectMeals(new int[]{27, 100, 51, 29, 39},new int[]{84, 22, 97, 72, 5},new int[]{27, 44, 45, 27, 30},new String[]{"", "f", "", "Cc", "fCCC", "CtF", "Cf", "", "", "tp", "Fpp", "", "", "", "PP"})==new int[]{0, 0, 0, 2, 0, 2, 2, 0, 0, 4, 2, 0, 0, 0, 1}) {
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
        System.out.println("{35, 47, 79, 50, 28, 34, 44},{44, 90, 24, 16, 63, 35, 53},{31, 24, 22, 5, 31, 0, 44},{\"FctF\", \"CcfF\", \"f\", \"\", \"cFFC\", \"ftp\", \"CF\", \"ppF\", \"Fpfc\", \"CFpf\", \"F\", \"Ft\", \"fP\", \"p\", \"Pft\", \"\", \"Fp\", \"ftf\", \"\", \"PpTp\", \"\", \"T\", \"\"}");
        System.out.println("expecting output:");
        System.out.println("{6, 1, 5, 0, 3, 5, 1, 4, 6, 1, 6, 6, 5, 4, 2, 0, 6, 5, 0, 2, 0, 1, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{35, 47, 79, 50, 28, 34, 44},new int[]{44, 90, 24, 16, 63, 35, 53},new int[]{31, 24, 22, 5, 31, 0, 44},new String[]{"FctF", "CcfF", "f", "", "cFFC", "ftp", "CF", "ppF", "Fpfc", "CFpf", "F", "Ft", "fP", "p", "Pft", "", "Fp", "ftf", "", "PpTp", "", "T", ""})));
        // System.out.println(test.selectMeals(new int[]{35, 47, 79, 50, 28, 34, 44},new int[]{44, 90, 24, 16, 63, 35, 53},new int[]{31, 24, 22, 5, 31, 0, 44},new String[]{"FctF", "CcfF", "f", "", "cFFC", "ftp", "CF", "ppF", "Fpfc", "CFpf", "F", "Ft", "fP", "p", "Pft", "", "Fp", "ftf", "", "PpTp", "", "T", ""}));
// if (Math.abs(test.selectMeals(new int[]{35, 47, 79, 50, 28, 34, 44},new int[]{44, 90, 24, 16, 63, 35, 53},new int[]{31, 24, 22, 5, 31, 0, 44},new String[]{"FctF", "CcfF", "f", "", "cFFC", "ftp", "CF", "ppF", "Fpfc", "CFpf", "F", "Ft", "fP", "p", "Pft", "", "Fp", "ftf", "", "PpTp", "", "T", ""})-new int[]{6, 1, 5, 0, 3, 5, 1, 4, 6, 1, 6, 6, 5, 4, 2, 0, 6, 5, 0, 2, 0, 1, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{35, 47, 79, 50, 28, 34, 44},new int[]{44, 90, 24, 16, 63, 35, 53},new int[]{31, 24, 22, 5, 31, 0, 44},new String[]{"FctF", "CcfF", "f", "", "cFFC", "ftp", "CF", "ppF", "Fpfc", "CFpf", "F", "Ft", "fP", "p", "Pft", "", "Fp", "ftf", "", "PpTp", "", "T", ""}),new int[]{6, 1, 5, 0, 3, 5, 1, 4, 6, 1, 6, 6, 5, 4, 2, 0, 6, 5, 0, 2, 0, 1, 0})) {
// if (test.selectMeals(new int[]{35, 47, 79, 50, 28, 34, 44},new int[]{44, 90, 24, 16, 63, 35, 53},new int[]{31, 24, 22, 5, 31, 0, 44},new String[]{"FctF", "CcfF", "f", "", "cFFC", "ftp", "CF", "ppF", "Fpfc", "CFpf", "F", "Ft", "fP", "p", "Pft", "", "Fp", "ftf", "", "PpTp", "", "T", ""})==new int[]{6, 1, 5, 0, 3, 5, 1, 4, 6, 1, 6, 6, 5, 4, 2, 0, 6, 5, 0, 2, 0, 1, 0}) {
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
        System.out.println("{10, 27, 34, 33, 10, 6, 78, 29, 64},{3, 91, 95, 48, 71, 2, 54, 73, 1},{26, 88, 30, 99, 48, 7, 51, 100, 62},{\"\", \"tttf\", \"\", \"Pp\", \"pC\", \"\", \"\", \"fcFT\", \"f\", \"cp\", \"CTct\", \"pFft\", \"c\", \"fc\", \"T\", \"tFtP\", \"T\", \"Ffcc\", \"ccpt\", \"\", \"\", \"Cc\", \"c\", \"\", \"\", \"\", \"Ct\", \"p\", \"CP\", \"fFPP\", \"\", \"\", \"PFP\", \"Pc\", \"\", \"PTP\", \"\", \"c\", \"TPcp\", \"pfFP\", \"pTcf\", \"pp\", \"tpfF\", \"F\", \"pTTt\", \"pP\", \"CF\", \"Cp\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 5, 0, 6, 5, 0, 0, 5, 5, 8, 2, 5, 8, 5, 7, 5, 7, 7, 8, 0, 0, 2, 8, 0, 0, 0, 2, 5, 2, 5, 0, 0, 6, 6, 0, 6, 0, 8, 7, 5, 5, 5, 5, 7, 5, 5, 2, 2}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{10, 27, 34, 33, 10, 6, 78, 29, 64},new int[]{3, 91, 95, 48, 71, 2, 54, 73, 1},new int[]{26, 88, 30, 99, 48, 7, 51, 100, 62},new String[]{"", "tttf", "", "Pp", "pC", "", "", "fcFT", "f", "cp", "CTct", "pFft", "c", "fc", "T", "tFtP", "T", "Ffcc", "ccpt", "", "", "Cc", "c", "", "", "", "Ct", "p", "CP", "fFPP", "", "", "PFP", "Pc", "", "PTP", "", "c", "TPcp", "pfFP", "pTcf", "pp", "tpfF", "F", "pTTt", "pP", "CF", "Cp"})));
        // System.out.println(test.selectMeals(new int[]{10, 27, 34, 33, 10, 6, 78, 29, 64},new int[]{3, 91, 95, 48, 71, 2, 54, 73, 1},new int[]{26, 88, 30, 99, 48, 7, 51, 100, 62},new String[]{"", "tttf", "", "Pp", "pC", "", "", "fcFT", "f", "cp", "CTct", "pFft", "c", "fc", "T", "tFtP", "T", "Ffcc", "ccpt", "", "", "Cc", "c", "", "", "", "Ct", "p", "CP", "fFPP", "", "", "PFP", "Pc", "", "PTP", "", "c", "TPcp", "pfFP", "pTcf", "pp", "tpfF", "F", "pTTt", "pP", "CF", "Cp"}));
// if (Math.abs(test.selectMeals(new int[]{10, 27, 34, 33, 10, 6, 78, 29, 64},new int[]{3, 91, 95, 48, 71, 2, 54, 73, 1},new int[]{26, 88, 30, 99, 48, 7, 51, 100, 62},new String[]{"", "tttf", "", "Pp", "pC", "", "", "fcFT", "f", "cp", "CTct", "pFft", "c", "fc", "T", "tFtP", "T", "Ffcc", "ccpt", "", "", "Cc", "c", "", "", "", "Ct", "p", "CP", "fFPP", "", "", "PFP", "Pc", "", "PTP", "", "c", "TPcp", "pfFP", "pTcf", "pp", "tpfF", "F", "pTTt", "pP", "CF", "Cp"})-new int[]{0, 5, 0, 6, 5, 0, 0, 5, 5, 8, 2, 5, 8, 5, 7, 5, 7, 7, 8, 0, 0, 2, 8, 0, 0, 0, 2, 5, 2, 5, 0, 0, 6, 6, 0, 6, 0, 8, 7, 5, 5, 5, 5, 7, 5, 5, 2, 2})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{10, 27, 34, 33, 10, 6, 78, 29, 64},new int[]{3, 91, 95, 48, 71, 2, 54, 73, 1},new int[]{26, 88, 30, 99, 48, 7, 51, 100, 62},new String[]{"", "tttf", "", "Pp", "pC", "", "", "fcFT", "f", "cp", "CTct", "pFft", "c", "fc", "T", "tFtP", "T", "Ffcc", "ccpt", "", "", "Cc", "c", "", "", "", "Ct", "p", "CP", "fFPP", "", "", "PFP", "Pc", "", "PTP", "", "c", "TPcp", "pfFP", "pTcf", "pp", "tpfF", "F", "pTTt", "pP", "CF", "Cp"}),new int[]{0, 5, 0, 6, 5, 0, 0, 5, 5, 8, 2, 5, 8, 5, 7, 5, 7, 7, 8, 0, 0, 2, 8, 0, 0, 0, 2, 5, 2, 5, 0, 0, 6, 6, 0, 6, 0, 8, 7, 5, 5, 5, 5, 7, 5, 5, 2, 2})) {
// if (test.selectMeals(new int[]{10, 27, 34, 33, 10, 6, 78, 29, 64},new int[]{3, 91, 95, 48, 71, 2, 54, 73, 1},new int[]{26, 88, 30, 99, 48, 7, 51, 100, 62},new String[]{"", "tttf", "", "Pp", "pC", "", "", "fcFT", "f", "cp", "CTct", "pFft", "c", "fc", "T", "tFtP", "T", "Ffcc", "ccpt", "", "", "Cc", "c", "", "", "", "Ct", "p", "CP", "fFPP", "", "", "PFP", "Pc", "", "PTP", "", "c", "TPcp", "pfFP", "pTcf", "pp", "tpfF", "F", "pTTt", "pP", "CF", "Cp"})==new int[]{0, 5, 0, 6, 5, 0, 0, 5, 5, 8, 2, 5, 8, 5, 7, 5, 7, 7, 8, 0, 0, 2, 8, 0, 0, 0, 2, 5, 2, 5, 0, 0, 6, 6, 0, 6, 0, 8, 7, 5, 5, 5, 5, 7, 5, 5, 2, 2}) {
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
        System.out.println("{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},{\"FP\", \"Tc\", \"ctf\", \"cC\", \"FTpf\", \"cPCt\", \"P\", \"pF\", \"CFtP\", \"\", \"CtCF\", \"f\", \"\", \"\", \"tFC\", \"fCtc\", \"CtFf\", \"tfF\", \"fPPp\", \"fptc\", \"TT\", \"FTfP\", \"CTft\", \"P\", \"\", \"\", \"PT\"}");
        System.out.println("expecting output:");
        System.out.println("{1, 10, 7, 7, 1, 7, 8, 0, 10, 0, 8, 2, 0, 0, 0, 2, 8, 0, 2, 2, 10, 1, 10, 8, 0, 0, 8}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},new int[]{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},new int[]{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},new String[]{"FP", "Tc", "ctf", "cC", "FTpf", "cPCt", "P", "pF", "CFtP", "", "CtCF", "f", "", "", "tFC", "fCtc", "CtFf", "tfF", "fPPp", "fptc", "TT", "FTfP", "CTft", "P", "", "", "PT"})));
        // System.out.println(test.selectMeals(new int[]{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},new int[]{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},new int[]{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},new String[]{"FP", "Tc", "ctf", "cC", "FTpf", "cPCt", "P", "pF", "CFtP", "", "CtCF", "f", "", "", "tFC", "fCtc", "CtFf", "tfF", "fPPp", "fptc", "TT", "FTfP", "CTft", "P", "", "", "PT"}));
// if (Math.abs(test.selectMeals(new int[]{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},new int[]{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},new int[]{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},new String[]{"FP", "Tc", "ctf", "cC", "FTpf", "cPCt", "P", "pF", "CFtP", "", "CtCF", "f", "", "", "tFC", "fCtc", "CtFf", "tfF", "fPPp", "fptc", "TT", "FTfP", "CTft", "P", "", "", "PT"})-new int[]{1, 10, 7, 7, 1, 7, 8, 0, 10, 0, 8, 2, 0, 0, 0, 2, 8, 0, 2, 2, 10, 1, 10, 8, 0, 0, 8})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},new int[]{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},new int[]{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},new String[]{"FP", "Tc", "ctf", "cC", "FTpf", "cPCt", "P", "pF", "CFtP", "", "CtCF", "f", "", "", "tFC", "fCtc", "CtFf", "tfF", "fPPp", "fptc", "TT", "FTfP", "CTft", "P", "", "", "PT"}),new int[]{1, 10, 7, 7, 1, 7, 8, 0, 10, 0, 8, 2, 0, 0, 0, 2, 8, 0, 2, 2, 10, 1, 10, 8, 0, 0, 8})) {
// if (test.selectMeals(new int[]{18, 34, 72, 69, 72, 78, 52, 27, 87, 64, 72},new int[]{8, 36, 58, 18, 53, 41, 51, 6, 78, 15, 78},new int[]{19, 88, 4, 55, 38, 51, 44, 71, 18, 52, 69},new String[]{"FP", "Tc", "ctf", "cC", "FTpf", "cPCt", "P", "pF", "CFtP", "", "CtCF", "f", "", "", "tFC", "fCtc", "CtFf", "tfF", "fPPp", "fptc", "TT", "FTfP", "CTft", "P", "", "", "PT"})==new int[]{1, 10, 7, 7, 1, 7, 8, 0, 10, 0, 8, 2, 0, 0, 0, 2, 8, 0, 2, 2, 10, 1, 10, 8, 0, 0, 8}) {
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
        System.out.println("{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},{\"\", \"\", \"FPFP\", \"ptpC\", \"\", \"fC\", \"pF\", \"\", \"t\", \"C\", \"P\", \"cTPT\", \"ppFp\", \"ppF\", \"Tp\", \"FF\", \"tP\", \"FfF\", \"T\", \"PTFt\", \"C\", \"ct\", \"FttT\", \"ctTp\", \"TTCP\", \"cTcc\", \"t\", \"\", \"cC\", \"TFF\", \"tFcF\", \"t\", \"FcFc\", \"FT\", \"tTFf\", \"F\", \"tC\", \"cCpt\", \"CCcc\", \"P\", \"tfC\", \"C\", \"Tf\", \"C\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 0, 8, 4, 0, 12, 4, 0, 3, 6, 2, 0, 4, 4, 6, 8, 3, 8, 6, 2, 6, 0, 8, 0, 6, 0, 3, 0, 0, 6, 3, 3, 8, 8, 3, 8, 3, 0, 6, 2, 3, 6, 6, 6}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},new int[]{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},new int[]{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},new String[]{"", "", "FPFP", "ptpC", "", "fC", "pF", "", "t", "C", "P", "cTPT", "ppFp", "ppF", "Tp", "FF", "tP", "FfF", "T", "PTFt", "C", "ct", "FttT", "ctTp", "TTCP", "cTcc", "t", "", "cC", "TFF", "tFcF", "t", "FcFc", "FT", "tTFf", "F", "tC", "cCpt", "CCcc", "P", "tfC", "C", "Tf", "C"})));
        // System.out.println(test.selectMeals(new int[]{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},new int[]{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},new int[]{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},new String[]{"", "", "FPFP", "ptpC", "", "fC", "pF", "", "t", "C", "P", "cTPT", "ppFp", "ppF", "Tp", "FF", "tP", "FfF", "T", "PTFt", "C", "ct", "FttT", "ctTp", "TTCP", "cTcc", "t", "", "cC", "TFF", "tFcF", "t", "FcFc", "FT", "tTFf", "F", "tC", "cCpt", "CCcc", "P", "tfC", "C", "Tf", "C"}));
// if (Math.abs(test.selectMeals(new int[]{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},new int[]{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},new int[]{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},new String[]{"", "", "FPFP", "ptpC", "", "fC", "pF", "", "t", "C", "P", "cTPT", "ppFp", "ppF", "Tp", "FF", "tP", "FfF", "T", "PTFt", "C", "ct", "FttT", "ctTp", "TTCP", "cTcc", "t", "", "cC", "TFF", "tFcF", "t", "FcFc", "FT", "tTFf", "F", "tC", "cCpt", "CCcc", "P", "tfC", "C", "Tf", "C"})-new int[]{0, 0, 8, 4, 0, 12, 4, 0, 3, 6, 2, 0, 4, 4, 6, 8, 3, 8, 6, 2, 6, 0, 8, 0, 6, 0, 3, 0, 0, 6, 3, 3, 8, 8, 3, 8, 3, 0, 6, 2, 3, 6, 6, 6})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},new int[]{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},new int[]{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},new String[]{"", "", "FPFP", "ptpC", "", "fC", "pF", "", "t", "C", "P", "cTPT", "ppFp", "ppF", "Tp", "FF", "tP", "FfF", "T", "PTFt", "C", "ct", "FttT", "ctTp", "TTCP", "cTcc", "t", "", "cC", "TFF", "tFcF", "t", "FcFc", "FT", "tTFf", "F", "tC", "cCpt", "CCcc", "P", "tfC", "C", "Tf", "C"}),new int[]{0, 0, 8, 4, 0, 12, 4, 0, 3, 6, 2, 0, 4, 4, 6, 8, 3, 8, 6, 2, 6, 0, 8, 0, 6, 0, 3, 0, 0, 6, 3, 3, 8, 8, 3, 8, 3, 0, 6, 2, 3, 6, 6, 6})) {
// if (test.selectMeals(new int[]{33, 63, 98, 32, 6, 85, 77, 16, 15, 7, 67, 94, 56},new int[]{0, 36, 90, 7, 72, 62, 94, 73, 84, 25, 49, 32, 43},new int[]{61, 49, 30, 16, 86, 35, 52, 6, 89, 60, 18, 47, 1},new String[]{"", "", "FPFP", "ptpC", "", "fC", "pF", "", "t", "C", "P", "cTPT", "ppFp", "ppF", "Tp", "FF", "tP", "FfF", "T", "PTFt", "C", "ct", "FttT", "ctTp", "TTCP", "cTcc", "t", "", "cC", "TFF", "tFcF", "t", "FcFc", "FT", "tTFf", "F", "tC", "cCpt", "CCcc", "P", "tfC", "C", "Tf", "C"})==new int[]{0, 0, 8, 4, 0, 12, 4, 0, 3, 6, 2, 0, 4, 4, 6, 8, 3, 8, 6, 2, 6, 0, 8, 0, 6, 0, 3, 0, 0, 6, 3, 3, 8, 8, 3, 8, 3, 0, 6, 2, 3, 6, 6, 6}) {
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
        System.out.println("{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},{\"\", \"PT\", \"T\", \"f\", \"pccT\", \"C\", \"ccfF\", \"tP\", \"T\", \"TT\", \"pcF\", \"f\", \"\", \"FfFf\", \"fCF\", \"cPTt\", \"PtPc\", \"t\", \"pTfP\", \"tTff\", \"t\", \"pfTp\", \"Pp\", \"Ttf\", \"\", \"\", \"P\", \"\", \"cPTf\", \"Ppp\", \"Pt\", \"\", \"\", \"P\", \"pCfC\", \"tCcT\", \"CpP\", \"TFCt\", \"Ppct\", \"T\", \"F\", \"\", \"P\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 9, 9, 1, 3, 8, 5, 11, 9, 9, 3, 1, 0, 3, 1, 5, 9, 11, 3, 11, 11, 3, 9, 9, 0, 0, 9, 0, 5, 9, 9, 0, 0, 9, 3, 11, 8, 9, 9, 9, 3, 0, 9}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},new int[]{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},new int[]{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},new String[]{"", "PT", "T", "f", "pccT", "C", "ccfF", "tP", "T", "TT", "pcF", "f", "", "FfFf", "fCF", "cPTt", "PtPc", "t", "pTfP", "tTff", "t", "pfTp", "Pp", "Ttf", "", "", "P", "", "cPTf", "Ppp", "Pt", "", "", "P", "pCfC", "tCcT", "CpP", "TFCt", "Ppct", "T", "F", "", "P"})));
        // System.out.println(test.selectMeals(new int[]{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},new int[]{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},new int[]{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},new String[]{"", "PT", "T", "f", "pccT", "C", "ccfF", "tP", "T", "TT", "pcF", "f", "", "FfFf", "fCF", "cPTt", "PtPc", "t", "pTfP", "tTff", "t", "pfTp", "Pp", "Ttf", "", "", "P", "", "cPTf", "Ppp", "Pt", "", "", "P", "pCfC", "tCcT", "CpP", "TFCt", "Ppct", "T", "F", "", "P"}));
// if (Math.abs(test.selectMeals(new int[]{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},new int[]{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},new int[]{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},new String[]{"", "PT", "T", "f", "pccT", "C", "ccfF", "tP", "T", "TT", "pcF", "f", "", "FfFf", "fCF", "cPTt", "PtPc", "t", "pTfP", "tTff", "t", "pfTp", "Pp", "Ttf", "", "", "P", "", "cPTf", "Ppp", "Pt", "", "", "P", "pCfC", "tCcT", "CpP", "TFCt", "Ppct", "T", "F", "", "P"})-new int[]{0, 9, 9, 1, 3, 8, 5, 11, 9, 9, 3, 1, 0, 3, 1, 5, 9, 11, 3, 11, 11, 3, 9, 9, 0, 0, 9, 0, 5, 9, 9, 0, 0, 9, 3, 11, 8, 9, 9, 9, 3, 0, 9})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},new int[]{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},new int[]{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},new String[]{"", "PT", "T", "f", "pccT", "C", "ccfF", "tP", "T", "TT", "pcF", "f", "", "FfFf", "fCF", "cPTt", "PtPc", "t", "pTfP", "tTff", "t", "pfTp", "Pp", "Ttf", "", "", "P", "", "cPTf", "Ppp", "Pt", "", "", "P", "pCfC", "tCcT", "CpP", "TFCt", "Ppct", "T", "F", "", "P"}),new int[]{0, 9, 9, 1, 3, 8, 5, 11, 9, 9, 3, 1, 0, 3, 1, 5, 9, 11, 3, 11, 11, 3, 9, 9, 0, 0, 9, 0, 5, 9, 9, 0, 0, 9, 3, 11, 8, 9, 9, 9, 3, 0, 9})) {
// if (test.selectMeals(new int[]{14, 60, 12, 7, 77, 37, 47, 61, 12, 86, 76, 30, 17, 52, 32},new int[]{11, 37, 62, 6, 61, 2, 61, 41, 90, 38, 35, 19, 23, 14, 59},new int[]{30, 3, 63, 99, 54, 26, 38, 54, 34, 97, 6, 13, 50, 4, 69},new String[]{"", "PT", "T", "f", "pccT", "C", "ccfF", "tP", "T", "TT", "pcF", "f", "", "FfFf", "fCF", "cPTt", "PtPc", "t", "pTfP", "tTff", "t", "pfTp", "Pp", "Ttf", "", "", "P", "", "cPTf", "Ppp", "Pt", "", "", "P", "pCfC", "tCcT", "CpP", "TFCt", "Ppct", "T", "F", "", "P"})==new int[]{0, 9, 9, 1, 3, 8, 5, 11, 9, 9, 3, 1, 0, 3, 1, 5, 9, 11, 3, 11, 11, 3, 9, 9, 0, 0, 9, 0, 5, 9, 9, 0, 0, 9, 3, 11, 8, 9, 9, 9, 3, 0, 9}) {
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
        System.out.println("{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},{\"tPff\", \"tFCp\", \"pC\", \"\", \"tcCp\", \"ct\", \"\", \"ctcc\", \"pfCC\", \"p\", \"\", \"cP\", \"p\", \"FPpp\"}");
        System.out.println("expecting output:");
        System.out.println("{11, 11, 3, 0, 11, 4, 0, 4, 3, 3, 0, 4, 3, 14}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},new int[]{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},new int[]{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},new String[]{"tPff", "tFCp", "pC", "", "tcCp", "ct", "", "ctcc", "pfCC", "p", "", "cP", "p", "FPpp"})));
        // System.out.println(test.selectMeals(new int[]{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},new int[]{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},new int[]{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},new String[]{"tPff", "tFCp", "pC", "", "tcCp", "ct", "", "ctcc", "pfCC", "p", "", "cP", "p", "FPpp"}));
// if (Math.abs(test.selectMeals(new int[]{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},new int[]{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},new int[]{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},new String[]{"tPff", "tFCp", "pC", "", "tcCp", "ct", "", "ctcc", "pfCC", "p", "", "cP", "p", "FPpp"})-new int[]{11, 11, 3, 0, 11, 4, 0, 4, 3, 3, 0, 4, 3, 14})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},new int[]{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},new int[]{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},new String[]{"tPff", "tFCp", "pC", "", "tcCp", "ct", "", "ctcc", "pfCC", "p", "", "cP", "p", "FPpp"}),new int[]{11, 11, 3, 0, 11, 4, 0, 4, 3, 3, 0, 4, 3, 14})) {
// if (test.selectMeals(new int[]{50, 20, 10, 1, 30, 74, 51, 74, 36, 63, 60, 10, 24, 98, 44, 66, 40},new int[]{73, 96, 3, 55, 0, 50, 32, 81, 35, 86, 65, 30, 76, 48, 81, 51, 81},new int[]{58, 13, 69, 37, 47, 35, 67, 62, 36, 88, 57, 17, 61, 37, 97, 73, 27},new String[]{"tPff", "tFCp", "pC", "", "tcCp", "ct", "", "ctcc", "pfCC", "p", "", "cP", "p", "FPpp"})==new int[]{11, 11, 3, 0, 11, 4, 0, 4, 3, 3, 0, 4, 3, 14}) {
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
        System.out.println("{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},{\"\", \"fCP\", \"FFct\", \"tp\", \"PtFT\", \"Ctf\", \"Fft\", \"\", \"P\", \"pTT\", \"f\", \"C\", \"FtCt\", \"\", \"c\", \"C\", \"F\", \"ttpP\", \"F\", \"\", \"tcT\", \"t\", \"P\", \"CcTT\", \"F\", \"CF\", \"FttF\", \"tCT\", \"\", \"Tc\", \"tF\", \"FtFt\", \"fT\", \"cFTT\", \"f\", \"\", \"\", \"p\", \"T\", \"\", \"\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 1, 18, 7, 17, 16, 18, 0, 17, 14, 1, 16, 18, 0, 14, 16, 18, 7, 18, 0, 7, 7, 17, 16, 18, 16, 18, 7, 0, 18, 7, 18, 1, 14, 1, 0, 0, 14, 18, 0, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},new int[]{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},new int[]{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},new String[]{"", "fCP", "FFct", "tp", "PtFT", "Ctf", "Fft", "", "P", "pTT", "f", "C", "FtCt", "", "c", "C", "F", "ttpP", "F", "", "tcT", "t", "P", "CcTT", "F", "CF", "FttF", "tCT", "", "Tc", "tF", "FtFt", "fT", "cFTT", "f", "", "", "p", "T", "", ""})));
        // System.out.println(test.selectMeals(new int[]{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},new int[]{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},new int[]{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},new String[]{"", "fCP", "FFct", "tp", "PtFT", "Ctf", "Fft", "", "P", "pTT", "f", "C", "FtCt", "", "c", "C", "F", "ttpP", "F", "", "tcT", "t", "P", "CcTT", "F", "CF", "FttF", "tCT", "", "Tc", "tF", "FtFt", "fT", "cFTT", "f", "", "", "p", "T", "", ""}));
// if (Math.abs(test.selectMeals(new int[]{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},new int[]{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},new int[]{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},new String[]{"", "fCP", "FFct", "tp", "PtFT", "Ctf", "Fft", "", "P", "pTT", "f", "C", "FtCt", "", "c", "C", "F", "ttpP", "F", "", "tcT", "t", "P", "CcTT", "F", "CF", "FttF", "tCT", "", "Tc", "tF", "FtFt", "fT", "cFTT", "f", "", "", "p", "T", "", ""})-new int[]{0, 1, 18, 7, 17, 16, 18, 0, 17, 14, 1, 16, 18, 0, 14, 16, 18, 7, 18, 0, 7, 7, 17, 16, 18, 16, 18, 7, 0, 18, 7, 18, 1, 14, 1, 0, 0, 14, 18, 0, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},new int[]{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},new int[]{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},new String[]{"", "fCP", "FFct", "tp", "PtFT", "Ctf", "Fft", "", "P", "pTT", "f", "C", "FtCt", "", "c", "C", "F", "ttpP", "F", "", "tcT", "t", "P", "CcTT", "F", "CF", "FttF", "tCT", "", "Tc", "tF", "FtFt", "fT", "cFTT", "f", "", "", "p", "T", "", ""}),new int[]{0, 1, 18, 7, 17, 16, 18, 0, 17, 14, 1, 16, 18, 0, 14, 16, 18, 7, 18, 0, 7, 7, 17, 16, 18, 16, 18, 7, 0, 18, 7, 18, 1, 14, 1, 0, 0, 14, 18, 0, 0})) {
// if (test.selectMeals(new int[]{88, 41, 39, 44, 43, 19, 48, 4, 46, 3, 50, 52, 23, 35, 0, 89, 17, 93, 92},new int[]{97, 53, 10, 90, 80, 36, 37, 35, 43, 60, 47, 45, 68, 95, 7, 8, 98, 12, 75},new int[]{30, 2, 15, 47, 97, 51, 18, 12, 61, 36, 81, 45, 72, 64, 90, 41, 14, 76, 98},new String[]{"", "fCP", "FFct", "tp", "PtFT", "Ctf", "Fft", "", "P", "pTT", "f", "C", "FtCt", "", "c", "C", "F", "ttpP", "F", "", "tcT", "t", "P", "CcTT", "F", "CF", "FttF", "tCT", "", "Tc", "tF", "FtFt", "fT", "cFTT", "f", "", "", "p", "T", "", ""})==new int[]{0, 1, 18, 7, 17, 16, 18, 0, 17, 14, 1, 16, 18, 0, 14, 16, 18, 7, 18, 0, 7, 7, 17, 16, 18, 16, 18, 7, 0, 18, 7, 18, 1, 14, 1, 0, 0, 14, 18, 0, 0}) {
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
        System.out.println("{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},{\"tt\"}");
        System.out.println("expecting output:");
        System.out.println("{17}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},new int[]{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},new int[]{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},new String[]{"tt"})));
        // System.out.println(test.selectMeals(new int[]{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},new int[]{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},new int[]{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},new String[]{"tt"}));
// if (Math.abs(test.selectMeals(new int[]{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},new int[]{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},new int[]{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},new String[]{"tt"})-new int[]{17})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},new int[]{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},new int[]{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},new String[]{"tt"}),new int[]{17})) {
// if (test.selectMeals(new int[]{1, 9, 5, 58, 45, 12, 41, 13, 5, 71, 51, 66, 80, 29, 21, 97, 32, 15, 46, 0, 81},new int[]{97, 1, 100, 46, 86, 76, 42, 22, 68, 74, 8, 44, 7, 27, 59, 75, 14, 1, 2, 5, 20},new int[]{44, 71, 37, 13, 47, 27, 59, 63, 79, 90, 63, 51, 60, 87, 22, 94, 23, 10, 11, 66, 5},new String[]{"tt"})==new int[]{17}) {
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
        System.out.println("{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},{\"\", \"\", \"Ppp\", \"C\", \"tPC\", \"Ttct\", \"\", \"ttP\", \"c\", \"C\", \"\", \"\", \"TF\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 0, 20, 14, 19, 4, 0, 19, 10, 14, 0, 0, 4}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},new int[]{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},new int[]{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},new String[]{"", "", "Ppp", "C", "tPC", "Ttct", "", "ttP", "c", "C", "", "", "TF"})));
        // System.out.println(test.selectMeals(new int[]{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},new int[]{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},new int[]{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},new String[]{"", "", "Ppp", "C", "tPC", "Ttct", "", "ttP", "c", "C", "", "", "TF"}));
// if (Math.abs(test.selectMeals(new int[]{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},new int[]{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},new int[]{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},new String[]{"", "", "Ppp", "C", "tPC", "Ttct", "", "ttP", "c", "C", "", "", "TF"})-new int[]{0, 0, 20, 14, 19, 4, 0, 19, 10, 14, 0, 0, 4})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},new int[]{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},new int[]{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},new String[]{"", "", "Ppp", "C", "tPC", "Ttct", "", "ttP", "c", "C", "", "", "TF"}),new int[]{0, 0, 20, 14, 19, 4, 0, 19, 10, 14, 0, 0, 4})) {
// if (test.selectMeals(new int[]{21, 0, 53, 64, 83, 49, 89, 16, 41, 6, 66, 45, 32, 1, 77, 25, 16, 25, 9, 2, 95, 80, 84},new int[]{91, 78, 15, 57, 46, 67, 31, 65, 66, 49, 0, 80, 23, 29, 92, 80, 16, 28, 57, 37, 40, 38, 92},new int[]{54, 70, 73, 81, 93, 67, 37, 0, 26, 31, 31, 68, 14, 88, 49, 27, 37, 54, 25, 6, 87, 12, 51},new String[]{"", "", "Ppp", "C", "tPC", "Ttct", "", "ttP", "c", "C", "", "", "TF"})==new int[]{0, 0, 20, 14, 19, 4, 0, 19, 10, 14, 0, 0, 4}) {
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
        System.out.println("{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},{\"f\", \"Pp\", \"fF\", \"\", \"\", \"CPt\", \"tc\", \"FF\", \"Tfc\", \"T\", \"F\", \"pT\", \"\", \"cf\", \"Tp\", \"ctTP\", \"cF\", \"fpFf\", \"FtF\", \"\", \"pC\", \"cFpP\", \"tPtp\", \"cTT\", \"fTtc\", \"\", \"FtFf\", \"c\", \"CfcF\"}");
        System.out.println("expecting output:");
        System.out.println("{4, 3, 4, 0, 0, 14, 4, 21, 11, 11, 21, 13, 0, 2, 11, 2, 2, 4, 21, 0, 13, 2, 4, 2, 4, 0, 21, 2, 14}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},new int[]{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},new int[]{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},new String[]{"f", "Pp", "fF", "", "", "CPt", "tc", "FF", "Tfc", "T", "F", "pT", "", "cf", "Tp", "ctTP", "cF", "fpFf", "FtF", "", "pC", "cFpP", "tPtp", "cTT", "fTtc", "", "FtFf", "c", "CfcF"})));
        // System.out.println(test.selectMeals(new int[]{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},new int[]{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},new int[]{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},new String[]{"f", "Pp", "fF", "", "", "CPt", "tc", "FF", "Tfc", "T", "F", "pT", "", "cf", "Tp", "ctTP", "cF", "fpFf", "FtF", "", "pC", "cFpP", "tPtp", "cTT", "fTtc", "", "FtFf", "c", "CfcF"}));
// if (Math.abs(test.selectMeals(new int[]{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},new int[]{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},new int[]{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},new String[]{"f", "Pp", "fF", "", "", "CPt", "tc", "FF", "Tfc", "T", "F", "pT", "", "cf", "Tp", "ctTP", "cF", "fpFf", "FtF", "", "pC", "cFpP", "tPtp", "cTT", "fTtc", "", "FtFf", "c", "CfcF"})-new int[]{4, 3, 4, 0, 0, 14, 4, 21, 11, 11, 21, 13, 0, 2, 11, 2, 2, 4, 21, 0, 13, 2, 4, 2, 4, 0, 21, 2, 14})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},new int[]{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},new int[]{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},new String[]{"f", "Pp", "fF", "", "", "CPt", "tc", "FF", "Tfc", "T", "F", "pT", "", "cf", "Tp", "ctTP", "cF", "fpFf", "FtF", "", "pC", "cFpP", "tPtp", "cTT", "fTtc", "", "FtFf", "c", "CfcF"}),new int[]{4, 3, 4, 0, 0, 14, 4, 21, 11, 11, 21, 13, 0, 2, 11, 2, 2, 4, 21, 0, 13, 2, 4, 2, 4, 0, 21, 2, 14})) {
// if (test.selectMeals(new int[]{5, 36, 60, 100, 8, 10, 54, 89, 96, 49, 9, 78, 75, 1, 75, 88, 65, 27, 28, 16, 21, 79, 23, 20, 34},new int[]{42, 13, 8, 58, 48, 55, 74, 70, 84, 57, 99, 63, 18, 60, 100, 63, 54, 9, 34, 98, 23, 47, 47, 85, 13},new int[]{64, 89, 26, 39, 4, 26, 39, 28, 26, 72, 36, 87, 32, 91, 53, 10, 45, 71, 65, 23, 87, 92, 73, 54, 16},new String[]{"f", "Pp", "fF", "", "", "CPt", "tc", "FF", "Tfc", "T", "F", "pT", "", "cf", "Tp", "ctTP", "cF", "fpFf", "FtF", "", "pC", "cFpP", "tPtp", "cTT", "fTtc", "", "FtFf", "c", "CfcF"})==new int[]{4, 3, 4, 0, 0, 14, 4, 21, 11, 11, 21, 13, 0, 2, 11, 2, 2, 4, 21, 0, 13, 2, 4, 2, 4, 0, 21, 2, 14}) {
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
        System.out.println("{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},{\"FCPc\", \"\", \"T\", \"\", \"T\", \"ct\", \"C\", \"p\", \"c\", \"c\", \"PT\", \"CC\", \"tPCp\", \"TCPT\", \"tp\", \"tt\", \"FtPp\", \"Ctp\", \"pp\", \"tfPc\", \"Tfpt\", \"tcpC\", \"cTF\", \"ppFT\", \"pF\", \"tc\", \"\", \"fTP\", \"C\", \"t\", \"fpC\", \"\", \"Ct\", \"\", \"pCpf\", \"cFTF\", \"P\", \"pCct\", \"Ctpp\", \"fPFf\", \"FP\", \"T\", \"Tp\", \"p\", \"tp\", \"c\", \"pc\", \"ftP\", \"C\"}");
        System.out.println("expecting output:");
        System.out.println("{12, 0, 2, 0, 2, 16, 23, 6, 16, 16, 18, 23, 25, 2, 25, 25, 12, 23, 6, 25, 2, 25, 16, 6, 6, 25, 0, 5, 23, 25, 5, 0, 23, 0, 6, 16, 3, 6, 23, 5, 12, 2, 2, 6, 25, 16, 6, 5, 23}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},new int[]{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},new int[]{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},new String[]{"FCPc", "", "T", "", "T", "ct", "C", "p", "c", "c", "PT", "CC", "tPCp", "TCPT", "tp", "tt", "FtPp", "Ctp", "pp", "tfPc", "Tfpt", "tcpC", "cTF", "ppFT", "pF", "tc", "", "fTP", "C", "t", "fpC", "", "Ct", "", "pCpf", "cFTF", "P", "pCct", "Ctpp", "fPFf", "FP", "T", "Tp", "p", "tp", "c", "pc", "ftP", "C"})));
        // System.out.println(test.selectMeals(new int[]{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},new int[]{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},new int[]{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},new String[]{"FCPc", "", "T", "", "T", "ct", "C", "p", "c", "c", "PT", "CC", "tPCp", "TCPT", "tp", "tt", "FtPp", "Ctp", "pp", "tfPc", "Tfpt", "tcpC", "cTF", "ppFT", "pF", "tc", "", "fTP", "C", "t", "fpC", "", "Ct", "", "pCpf", "cFTF", "P", "pCct", "Ctpp", "fPFf", "FP", "T", "Tp", "p", "tp", "c", "pc", "ftP", "C"}));
// if (Math.abs(test.selectMeals(new int[]{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},new int[]{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},new int[]{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},new String[]{"FCPc", "", "T", "", "T", "ct", "C", "p", "c", "c", "PT", "CC", "tPCp", "TCPT", "tp", "tt", "FtPp", "Ctp", "pp", "tfPc", "Tfpt", "tcpC", "cTF", "ppFT", "pF", "tc", "", "fTP", "C", "t", "fpC", "", "Ct", "", "pCpf", "cFTF", "P", "pCct", "Ctpp", "fPFf", "FP", "T", "Tp", "p", "tp", "c", "pc", "ftP", "C"})-new int[]{12, 0, 2, 0, 2, 16, 23, 6, 16, 16, 18, 23, 25, 2, 25, 25, 12, 23, 6, 25, 2, 25, 16, 6, 6, 25, 0, 5, 23, 25, 5, 0, 23, 0, 6, 16, 3, 6, 23, 5, 12, 2, 2, 6, 25, 16, 6, 5, 23})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},new int[]{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},new int[]{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},new String[]{"FCPc", "", "T", "", "T", "ct", "C", "p", "c", "c", "PT", "CC", "tPCp", "TCPT", "tp", "tt", "FtPp", "Ctp", "pp", "tfPc", "Tfpt", "tcpC", "cTF", "ppFT", "pF", "tc", "", "fTP", "C", "t", "fpC", "", "Ct", "", "pCpf", "cFTF", "P", "pCct", "Ctpp", "fPFf", "FP", "T", "Tp", "p", "tp", "c", "pc", "ftP", "C"}),new int[]{12, 0, 2, 0, 2, 16, 23, 6, 16, 16, 18, 23, 25, 2, 25, 25, 12, 23, 6, 25, 2, 25, 16, 6, 6, 25, 0, 5, 23, 25, 5, 0, 23, 0, 6, 16, 3, 6, 23, 5, 12, 2, 2, 6, 25, 16, 6, 5, 23})) {
// if (test.selectMeals(new int[]{49, 58, 89, 96, 18, 86, 7, 56, 34, 40, 71, 82, 33, 93, 72, 30, 33, 30, 96, 80, 88, 76, 47, 49, 96, 59, 81},new int[]{70, 66, 87, 5, 43, 77, 15, 54, 21, 95, 98, 55, 88, 22, 22, 64, 0, 13, 52, 7, 23, 67, 13, 99, 33, 13, 97},new int[]{82, 52, 90, 56, 80, 4, 52, 75, 81, 66, 27, 77, 94, 59, 43, 45, 56, 72, 76, 89, 54, 34, 56, 39, 79, 16, 54},new String[]{"FCPc", "", "T", "", "T", "ct", "C", "p", "c", "c", "PT", "CC", "tPCp", "TCPT", "tp", "tt", "FtPp", "Ctp", "pp", "tfPc", "Tfpt", "tcpC", "cTF", "ppFT", "pF", "tc", "", "fTP", "C", "t", "fpC", "", "Ct", "", "pCpf", "cFTF", "P", "pCct", "Ctpp", "fPFf", "FP", "T", "Tp", "p", "tp", "c", "pc", "ftP", "C"})==new int[]{12, 0, 2, 0, 2, 16, 23, 6, 16, 16, 18, 23, 25, 2, 25, 25, 12, 23, 6, 25, 2, 25, 16, 6, 6, 25, 0, 5, 23, 25, 5, 0, 23, 0, 6, 16, 3, 6, 23, 5, 12, 2, 2, 6, 25, 16, 6, 5, 23}) {
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
        System.out.println("{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},{\"CtT\", \"\", \"cPCp\", \"C\", \"tFPt\", \"TCT\", \"F\", \"CfF\", \"CCp\", \"TF\", \"Cf\", \"cc\", \"tf\", \"CT\", \"tPP\", \"CT\", \"pft\", \"PT\", \"\", \"PpF\", \"Ccfc\", \"tt\", \"CfT\", \"\", \"Ct\", \"Cc\", \"TpFt\", \"C\", \"\", \"\", \"fp\", \"cc\", \"\", \"\", \"fF\", \"cct\"}");
        System.out.println("expecting output:");
        System.out.println("{27, 0, 23, 27, 6, 20, 26, 27, 27, 20, 27, 23, 6, 27, 6, 27, 7, 27, 0, 27, 27, 6, 27, 0, 27, 27, 20, 27, 0, 0, 24, 23, 0, 0, 24, 23}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},new int[]{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},new int[]{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},new String[]{"CtT", "", "cPCp", "C", "tFPt", "TCT", "F", "CfF", "CCp", "TF", "Cf", "cc", "tf", "CT", "tPP", "CT", "pft", "PT", "", "PpF", "Ccfc", "tt", "CfT", "", "Ct", "Cc", "TpFt", "C", "", "", "fp", "cc", "", "", "fF", "cct"})));
        // System.out.println(test.selectMeals(new int[]{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},new int[]{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},new int[]{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},new String[]{"CtT", "", "cPCp", "C", "tFPt", "TCT", "F", "CfF", "CCp", "TF", "Cf", "cc", "tf", "CT", "tPP", "CT", "pft", "PT", "", "PpF", "Ccfc", "tt", "CfT", "", "Ct", "Cc", "TpFt", "C", "", "", "fp", "cc", "", "", "fF", "cct"}));
// if (Math.abs(test.selectMeals(new int[]{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},new int[]{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},new int[]{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},new String[]{"CtT", "", "cPCp", "C", "tFPt", "TCT", "F", "CfF", "CCp", "TF", "Cf", "cc", "tf", "CT", "tPP", "CT", "pft", "PT", "", "PpF", "Ccfc", "tt", "CfT", "", "Ct", "Cc", "TpFt", "C", "", "", "fp", "cc", "", "", "fF", "cct"})-new int[]{27, 0, 23, 27, 6, 20, 26, 27, 27, 20, 27, 23, 6, 27, 6, 27, 7, 27, 0, 27, 27, 6, 27, 0, 27, 27, 20, 27, 0, 0, 24, 23, 0, 0, 24, 23})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},new int[]{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},new int[]{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},new String[]{"CtT", "", "cPCp", "C", "tFPt", "TCT", "F", "CfF", "CCp", "TF", "Cf", "cc", "tf", "CT", "tPP", "CT", "pft", "PT", "", "PpF", "Ccfc", "tt", "CfT", "", "Ct", "Cc", "TpFt", "C", "", "", "fp", "cc", "", "", "fF", "cct"}),new int[]{27, 0, 23, 27, 6, 20, 26, 27, 27, 20, 27, 23, 6, 27, 6, 27, 7, 27, 0, 27, 27, 6, 27, 0, 27, 27, 20, 27, 0, 0, 24, 23, 0, 0, 24, 23})) {
// if (test.selectMeals(new int[]{79, 90, 96, 82, 82, 56, 24, 1, 36, 13, 19, 67, 35, 98, 95, 88, 82, 70, 24, 51, 98, 16, 57, 24, 60, 40, 84, 99, 53},new int[]{30, 84, 2, 95, 54, 21, 18, 35, 32, 22, 41, 34, 86, 25, 32, 26, 41, 54, 27, 10, 59, 30, 42, 0, 59, 38, 44, 98, 6},new int[]{66, 32, 32, 12, 22, 68, 3, 78, 56, 73, 97, 31, 46, 69, 42, 92, 46, 78, 21, 6, 97, 82, 90, 58, 0, 56, 98, 23, 7},new String[]{"CtT", "", "cPCp", "C", "tFPt", "TCT", "F", "CfF", "CCp", "TF", "Cf", "cc", "tf", "CT", "tPP", "CT", "pft", "PT", "", "PpF", "Ccfc", "tt", "CfT", "", "Ct", "Cc", "TpFt", "C", "", "", "fp", "cc", "", "", "fF", "cct"})==new int[]{27, 0, 23, 27, 6, 20, 26, 27, 27, 20, 27, 23, 6, 27, 6, 27, 7, 27, 0, 27, 27, 6, 27, 0, 27, 27, 20, 27, 0, 0, 24, 23, 0, 0, 24, 23}) {
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
        System.out.println("{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},{\"tffp\", \"\", \"TCfC\", \"c\", \"pT\", \"Cc\", \"Pf\", \"\", \"\", \"tCTf\", \"\", \"tTFf\", \"cTt\", \"fPcT\", \"tCPF\", \"pF\", \"\", \"f\", \"\", \"TF\", \"cc\"}");
        System.out.println("expecting output:");
        System.out.println("{18, 0, 13, 2, 23, 15, 20, 0, 0, 18, 0, 18, 5, 19, 18, 23, 0, 18, 0, 13, 2}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},new int[]{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},new int[]{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},new String[]{"tffp", "", "TCfC", "c", "pT", "Cc", "Pf", "", "", "tCTf", "", "tTFf", "cTt", "fPcT", "tCPF", "pF", "", "f", "", "TF", "cc"})));
        // System.out.println(test.selectMeals(new int[]{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},new int[]{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},new int[]{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},new String[]{"tffp", "", "TCfC", "c", "pT", "Cc", "Pf", "", "", "tCTf", "", "tTFf", "cTt", "fPcT", "tCPF", "pF", "", "f", "", "TF", "cc"}));
// if (Math.abs(test.selectMeals(new int[]{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},new int[]{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},new int[]{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},new String[]{"tffp", "", "TCfC", "c", "pT", "Cc", "Pf", "", "", "tCTf", "", "tTFf", "cTt", "fPcT", "tCPF", "pF", "", "f", "", "TF", "cc"})-new int[]{18, 0, 13, 2, 23, 15, 20, 0, 0, 18, 0, 18, 5, 19, 18, 23, 0, 18, 0, 13, 2})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},new int[]{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},new int[]{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},new String[]{"tffp", "", "TCfC", "c", "pT", "Cc", "Pf", "", "", "tCTf", "", "tTFf", "cTt", "fPcT", "tCPF", "pF", "", "f", "", "TF", "cc"}),new int[]{18, 0, 13, 2, 23, 15, 20, 0, 0, 18, 0, 18, 5, 19, 18, 23, 0, 18, 0, 13, 2})) {
// if (test.selectMeals(new int[]{7, 22, 19, 92, 37, 36, 38, 60, 35, 40, 61, 61, 40, 78, 90, 40, 26, 10, 11, 60, 98, 12, 95, 2, 16, 70, 14, 40, 91, 61, 24},new int[]{25, 85, 0, 58, 1, 0, 48, 45, 27, 52, 89, 78, 66, 60, 18, 99, 11, 21, 56, 99, 4, 24, 68, 87, 87, 39, 73, 37, 40, 80, 12},new int[]{52, 91, 46, 10, 71, 41, 29, 56, 91, 48, 68, 37, 56, 84, 43, 25, 61, 84, 0, 0, 100, 21, 13, 92, 100, 1, 84, 16, 59, 30, 72},new String[]{"tffp", "", "TCfC", "c", "pT", "Cc", "Pf", "", "", "tCTf", "", "tTFf", "cTt", "fPcT", "tCPF", "pF", "", "f", "", "TF", "cc"})==new int[]{18, 0, 13, 2, 23, 15, 20, 0, 0, 18, 0, 18, 5, 19, 18, 23, 0, 18, 0, 13, 2}) {
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
        System.out.println("{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},{\"pP\", \"CFpt\", \"cTc\", \"TFCf\"}");
        System.out.println("expecting output:");
        System.out.println("{25, 21, 31, 5}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},new int[]{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},new int[]{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},new String[]{"pP", "CFpt", "cTc", "TFCf"})));
        // System.out.println(test.selectMeals(new int[]{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},new int[]{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},new int[]{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},new String[]{"pP", "CFpt", "cTc", "TFCf"}));
// if (Math.abs(test.selectMeals(new int[]{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},new int[]{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},new int[]{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},new String[]{"pP", "CFpt", "cTc", "TFCf"})-new int[]{25, 21, 31, 5})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},new int[]{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},new int[]{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},new String[]{"pP", "CFpt", "cTc", "TFCf"}),new int[]{25, 21, 31, 5})) {
// if (test.selectMeals(new int[]{78, 83, 63, 97, 11, 82, 39, 45, 62, 44, 27, 9, 28, 36, 4, 92, 28, 52, 73, 47, 63, 96, 60, 18, 97, 1, 24, 19, 1, 36, 20, 29, 55},new int[]{75, 94, 60, 51, 4, 89, 81, 66, 52, 60, 11, 37, 66, 30, 3, 4, 98, 44, 90, 56, 42, 99, 27, 30, 1, 96, 76, 34, 78, 27, 20, 0, 72},new int[]{35, 62, 42, 30, 39, 95, 81, 19, 31, 45, 36, 31, 6, 88, 1, 78, 86, 45, 26, 67, 34, 74, 99, 77, 50, 40, 59, 80, 81, 28, 88, 28, 90},new String[]{"pP", "CFpt", "cTc", "TFCf"})==new int[]{25, 21, 31, 5}) {
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
        System.out.println("{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},{\"\", \"cPP\", \"fpP\", \"CT\", \"pC\", \"\", \"\", \"\", \"F\", \"Cfc\", \"\", \"Ffpp\", \"T\", \"p\", \"\", \"\", \"tcTC\", \"F\", \"\", \"fF\", \"f\", \"t\", \"TCTC\", \"\", \"PFct\", \"ccFf\", \"fcP\", \"TPTP\", \"tF\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 34, 13, 1, 19, 0, 0, 0, 9, 1, 0, 9, 24, 19, 0, 0, 13, 9, 0, 13, 13, 13, 24, 0, 0, 34, 32, 24, 13}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},new int[]{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},new int[]{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},new String[]{"", "cPP", "fpP", "CT", "pC", "", "", "", "F", "Cfc", "", "Ffpp", "T", "p", "", "", "tcTC", "F", "", "fF", "f", "t", "TCTC", "", "PFct", "ccFf", "fcP", "TPTP", "tF"})));
        // System.out.println(test.selectMeals(new int[]{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},new int[]{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},new int[]{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},new String[]{"", "cPP", "fpP", "CT", "pC", "", "", "", "F", "Cfc", "", "Ffpp", "T", "p", "", "", "tcTC", "F", "", "fF", "f", "t", "TCTC", "", "PFct", "ccFf", "fcP", "TPTP", "tF"}));
// if (Math.abs(test.selectMeals(new int[]{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},new int[]{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},new int[]{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},new String[]{"", "cPP", "fpP", "CT", "pC", "", "", "", "F", "Cfc", "", "Ffpp", "T", "p", "", "", "tcTC", "F", "", "fF", "f", "t", "TCTC", "", "PFct", "ccFf", "fcP", "TPTP", "tF"})-new int[]{0, 34, 13, 1, 19, 0, 0, 0, 9, 1, 0, 9, 24, 19, 0, 0, 13, 9, 0, 13, 13, 13, 24, 0, 0, 34, 32, 24, 13})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},new int[]{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},new int[]{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},new String[]{"", "cPP", "fpP", "CT", "pC", "", "", "", "F", "Cfc", "", "Ffpp", "T", "p", "", "", "tcTC", "F", "", "fF", "f", "t", "TCTC", "", "PFct", "ccFf", "fcP", "TPTP", "tF"}),new int[]{0, 34, 13, 1, 19, 0, 0, 0, 9, 1, 0, 9, 24, 19, 0, 0, 13, 9, 0, 13, 13, 13, 24, 0, 0, 34, 32, 24, 13})) {
// if (test.selectMeals(new int[]{98, 92, 75, 51, 36, 27, 78, 56, 96, 2, 13, 55, 45, 2, 2, 80, 55, 27, 25, 1, 1, 52, 70, 30, 90, 66, 92, 30, 22, 85, 2, 32, 15, 46, 75},new int[]{90, 100, 56, 65, 46, 8, 94, 61, 30, 69, 62, 84, 11, 52, 43, 69, 54, 65, 97, 93, 71, 56, 46, 76, 94, 97, 31, 44, 36, 28, 70, 82, 49, 48, 2},new int[]{39, 26, 43, 90, 75, 57, 38, 29, 52, 92, 30, 78, 85, 8, 74, 91, 39, 78, 87, 43, 77, 28, 18, 72, 76, 28, 46, 48, 45, 68, 38, 28, 8, 46, 79},new String[]{"", "cPP", "fpP", "CT", "pC", "", "", "", "F", "Cfc", "", "Ffpp", "T", "p", "", "", "tcTC", "F", "", "fF", "f", "t", "TCTC", "", "PFct", "ccFf", "fcP", "TPTP", "tF"})==new int[]{0, 34, 13, 1, 19, 0, 0, 0, 9, 1, 0, 9, 24, 19, 0, 0, 13, 9, 0, 13, 13, 13, 24, 0, 0, 34, 32, 24, 13}) {
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
        System.out.println("{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},{\"\", \"FPpc\", \"\", \"fCtp\", \"\", \"pc\", \"f\", \"FpC\", \"\", \"F\", \"Tc\", \"p\", \"\", \"c\", \"Tt\", \"tFC\", \"\", \"CFc\", \"fTT\", \"\", \"pTt\", \"cCcp\", \"T\", \"TF\", \"tFC\", \"cpFf\", \"Ccct\", \"t\", \"c\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 11, 0, 25, 0, 21, 25, 8, 0, 8, 2, 21, 0, 3, 2, 4, 0, 32, 25, 0, 21, 3, 2, 2, 4, 3, 32, 4, 3}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},new int[]{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},new int[]{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},new String[]{"", "FPpc", "", "fCtp", "", "pc", "f", "FpC", "", "F", "Tc", "p", "", "c", "Tt", "tFC", "", "CFc", "fTT", "", "pTt", "cCcp", "T", "TF", "tFC", "cpFf", "Ccct", "t", "c"})));
        // System.out.println(test.selectMeals(new int[]{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},new int[]{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},new int[]{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},new String[]{"", "FPpc", "", "fCtp", "", "pc", "f", "FpC", "", "F", "Tc", "p", "", "c", "Tt", "tFC", "", "CFc", "fTT", "", "pTt", "cCcp", "T", "TF", "tFC", "cpFf", "Ccct", "t", "c"}));
// if (Math.abs(test.selectMeals(new int[]{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},new int[]{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},new int[]{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},new String[]{"", "FPpc", "", "fCtp", "", "pc", "f", "FpC", "", "F", "Tc", "p", "", "c", "Tt", "tFC", "", "CFc", "fTT", "", "pTt", "cCcp", "T", "TF", "tFC", "cpFf", "Ccct", "t", "c"})-new int[]{0, 11, 0, 25, 0, 21, 25, 8, 0, 8, 2, 21, 0, 3, 2, 4, 0, 32, 25, 0, 21, 3, 2, 2, 4, 3, 32, 4, 3})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},new int[]{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},new int[]{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},new String[]{"", "FPpc", "", "fCtp", "", "pc", "f", "FpC", "", "F", "Tc", "p", "", "c", "Tt", "tFC", "", "CFc", "fTT", "", "pTt", "cCcp", "T", "TF", "tFC", "cpFf", "Ccct", "t", "c"}),new int[]{0, 11, 0, 25, 0, 21, 25, 8, 0, 8, 2, 21, 0, 3, 2, 4, 0, 32, 25, 0, 21, 3, 2, 2, 4, 3, 32, 4, 3})) {
// if (test.selectMeals(new int[]{48, 7, 55, 53, 4, 34, 6, 79, 45, 16, 17, 67, 92, 32, 26, 98, 90, 73, 42, 26, 92, 0, 63, 29, 5, 76, 21, 66, 84, 13, 64, 85, 55, 79, 31, 27, 94},new int[]{90, 91, 76, 4, 18, 6, 49, 9, 58, 23, 67, 10, 34, 47, 36, 6, 11, 84, 88, 35, 60, 58, 66, 44, 51, 53, 60, 17, 22, 77, 11, 69, 97, 78, 9, 10, 87},new int[]{66, 80, 95, 87, 11, 56, 15, 87, 99, 79, 54, 99, 17, 26, 83, 27, 91, 59, 56, 76, 69, 43, 90, 79, 86, 4, 37, 12, 4, 96, 53, 47, 60, 76, 53, 93, 7},new String[]{"", "FPpc", "", "fCtp", "", "pc", "f", "FpC", "", "F", "Tc", "p", "", "c", "Tt", "tFC", "", "CFc", "fTT", "", "pTt", "cCcp", "T", "TF", "tFC", "cpFf", "Ccct", "t", "c"})==new int[]{0, 11, 0, 25, 0, 21, 25, 8, 0, 8, 2, 21, 0, 3, 2, 4, 0, 32, 25, 0, 21, 3, 2, 2, 4, 3, 32, 4, 3}) {
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
        System.out.println("{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},{\"\", \"FtT\", \"pTfT\", \"Tp\", \"CcP\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 28, 38, 28, 28}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},new int[]{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},new int[]{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},new String[]{"", "FtT", "pTfT", "Tp", "CcP"})));
        // System.out.println(test.selectMeals(new int[]{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},new int[]{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},new int[]{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},new String[]{"", "FtT", "pTfT", "Tp", "CcP"}));
// if (Math.abs(test.selectMeals(new int[]{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},new int[]{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},new int[]{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},new String[]{"", "FtT", "pTfT", "Tp", "CcP"})-new int[]{0, 28, 38, 28, 28})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},new int[]{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},new int[]{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},new String[]{"", "FtT", "pTfT", "Tp", "CcP"}),new int[]{0, 28, 38, 28, 28})) {
// if (test.selectMeals(new int[]{29, 20, 82, 37, 22, 53, 87, 49, 100, 45, 39, 16, 39, 71, 29, 73, 32, 19, 35, 70, 74, 45, 68, 20, 37, 63, 91, 92, 59, 71, 82, 32, 42, 79, 76, 83, 30, 12, 4},new int[]{88, 58, 32, 62, 55, 43, 18, 37, 29, 20, 2, 46, 20, 87, 76, 87, 39, 35, 31, 46, 10, 63, 53, 28, 67, 21, 4, 23, 97, 8, 93, 56, 72, 91, 64, 40, 55, 73, 77},new int[]{45, 90, 53, 75, 8, 33, 30, 76, 38, 45, 87, 31, 88, 88, 8, 44, 46, 78, 82, 60, 65, 43, 0, 31, 55, 74, 2, 52, 96, 83, 16, 43, 95, 84, 57, 74, 22, 32, 9},new String[]{"", "FtT", "pTfT", "Tp", "CcP"})==new int[]{0, 28, 38, 28, 28}) {
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
        System.out.println("{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},{\"p\", \"ftC\", \"cpf\", \"Fft\", \"FF\", \"fptp\", \"t\", \"cTp\"}");
        System.out.println("expecting output:");
        System.out.println("{31, 25, 31, 13, 13, 25, 31, 19}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},new int[]{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},new int[]{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},new String[]{"p", "ftC", "cpf", "Fft", "FF", "fptp", "t", "cTp"})));
        // System.out.println(test.selectMeals(new int[]{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},new int[]{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},new int[]{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},new String[]{"p", "ftC", "cpf", "Fft", "FF", "fptp", "t", "cTp"}));
// if (Math.abs(test.selectMeals(new int[]{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},new int[]{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},new int[]{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},new String[]{"p", "ftC", "cpf", "Fft", "FF", "fptp", "t", "cTp"})-new int[]{31, 25, 31, 13, 13, 25, 31, 19})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},new int[]{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},new int[]{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},new String[]{"p", "ftC", "cpf", "Fft", "FF", "fptp", "t", "cTp"}),new int[]{31, 25, 31, 13, 13, 25, 31, 19})) {
// if (test.selectMeals(new int[]{46, 19, 95, 66, 99, 49, 40, 70, 9, 33, 32, 49, 51, 68, 76, 35, 66, 29, 88, 38, 93, 47, 55, 36, 6, 40, 57, 94, 54, 64, 87, 0, 13, 46, 38, 51, 31, 16, 50, 4, 85},new int[]{40, 51, 80, 54, 6, 42, 25, 80, 37, 38, 43, 31, 12, 16, 72, 23, 22, 41, 98, 1, 96, 8, 17, 69, 84, 73, 65, 33, 70, 48, 52, 1, 26, 13, 5, 42, 99, 14, 19, 36, 76},new int[]{74, 84, 34, 33, 66, 25, 72, 92, 44, 91, 42, 82, 88, 98, 72, 80, 11, 18, 59, 64, 45, 88, 86, 51, 72, 9, 86, 23, 89, 77, 46, 12, 42, 69, 17, 35, 12, 84, 54, 27, 11},new String[]{"p", "ftC", "cpf", "Fft", "FF", "fptp", "t", "cTp"})==new int[]{31, 25, 31, 13, 13, 25, 31, 19}) {
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
        System.out.println("{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},{\"t\", \"TccP\", \"P\", \"TT\", \"fFPt\", \"C\", \"FfC\", \"TF\", \"C\", \"Fcfc\", \"F\", \"Cfff\", \"pp\", \"c\", \"Cfpt\", \"tTC\", \"\", \"\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 13, 13, 13, 38, 11, 4, 13, 11, 4, 4, 21, 37, 8, 21, 0, 0, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},new int[]{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},new int[]{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},new String[]{"t", "TccP", "P", "TT", "fFPt", "C", "FfC", "TF", "C", "Fcfc", "F", "Cfff", "pp", "c", "Cfpt", "tTC", "", ""})));
        // System.out.println(test.selectMeals(new int[]{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},new int[]{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},new int[]{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},new String[]{"t", "TccP", "P", "TT", "fFPt", "C", "FfC", "TF", "C", "Fcfc", "F", "Cfff", "pp", "c", "Cfpt", "tTC", "", ""}));
// if (Math.abs(test.selectMeals(new int[]{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},new int[]{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},new int[]{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},new String[]{"t", "TccP", "P", "TT", "fFPt", "C", "FfC", "TF", "C", "Fcfc", "F", "Cfff", "pp", "c", "Cfpt", "tTC", "", ""})-new int[]{0, 13, 13, 13, 38, 11, 4, 13, 11, 4, 4, 21, 37, 8, 21, 0, 0, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},new int[]{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},new int[]{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},new String[]{"t", "TccP", "P", "TT", "fFPt", "C", "FfC", "TF", "C", "Fcfc", "F", "Cfff", "pp", "c", "Cfpt", "tTC", "", ""}),new int[]{0, 13, 13, 13, 38, 11, 4, 13, 11, 4, 4, 21, 37, 8, 21, 0, 0, 0})) {
// if (test.selectMeals(new int[]{12, 97, 38, 13, 21, 5, 35, 46, 44, 61, 92, 62, 46, 100, 24, 21, 27, 89, 41, 41, 8, 89, 17, 12, 33, 50, 16, 65, 72, 4, 45, 43, 48, 47, 76, 99, 15, 1, 87, 37, 80, 42, 51},new int[]{33, 81, 73, 48, 27, 57, 34, 48, 0, 75, 94, 99, 74, 72, 59, 91, 58, 10, 52, 49, 22, 99, 73, 84, 10, 82, 69, 51, 71, 70, 19, 49, 52, 55, 44, 83, 5, 32, 51, 31, 37, 29, 92},new int[]{14, 14, 4, 38, 93, 54, 41, 78, 84, 85, 5, 89, 50, 88, 38, 27, 39, 86, 86, 48, 81, 7, 60, 7, 45, 14, 59, 31, 11, 89, 80, 7, 85, 26, 32, 33, 69, 44, 2, 76, 76, 86, 16},new String[]{"t", "TccP", "P", "TT", "fFPt", "C", "FfC", "TF", "C", "Fcfc", "F", "Cfff", "pp", "c", "Cfpt", "tTC", "", ""})==new int[]{0, 13, 13, 13, 38, 11, 4, 13, 11, 4, 4, 21, 37, 8, 21, 0, 0, 0}) {
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
        System.out.println("{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},{\"tTpT\"}");
        System.out.println("expecting output:");
        System.out.println("{37}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},new int[]{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},new int[]{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},new String[]{"tTpT"})));
        // System.out.println(test.selectMeals(new int[]{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},new int[]{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},new int[]{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},new String[]{"tTpT"}));
// if (Math.abs(test.selectMeals(new int[]{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},new int[]{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},new int[]{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},new String[]{"tTpT"})-new int[]{37})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},new int[]{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},new int[]{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},new String[]{"tTpT"}),new int[]{37})) {
// if (test.selectMeals(new int[]{32, 18, 51, 72, 92, 49, 81, 50, 58, 35, 95, 24, 16, 24, 71, 35, 43, 96, 29, 67, 20, 19, 99, 50, 82, 30, 4, 47, 64, 21, 30, 100, 36, 0, 89, 18, 32, 0, 88, 68, 41, 22, 71, 27, 67},new int[]{82, 64, 9, 38, 7, 60, 71, 48, 12, 24, 27, 11, 7, 76, 28, 28, 21, 34, 97, 26, 14, 78, 62, 32, 39, 67, 56, 81, 6, 91, 81, 77, 78, 32, 9, 47, 39, 10, 46, 24, 95, 89, 20, 27, 29},new int[]{10, 69, 17, 13, 50, 98, 100, 66, 51, 79, 75, 48, 57, 13, 95, 88, 66, 27, 54, 78, 68, 97, 89, 36, 31, 79, 53, 80, 12, 83, 81, 52, 3, 78, 59, 1, 12, 9, 56, 56, 53, 89, 73, 12, 42},new String[]{"tTpT"})==new int[]{37}) {
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
        System.out.println("{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},{\"TTfc\", \"p\", \"\", \"ttFT\", \"\", \"PCPf\", \"\", \"t\", \"FP\", \"CCF\", \"\", \"FCC\", \"\", \"TpCc\", \"ftF\", \"cpt\", \"t\", \"\", \"f\", \"TC\", \"p\", \"\", \"cFC\", \"TcFc\", \"ct\", \"Pf\", \"P\", \"pTF\", \"PtT\", \"TCP\", \"cCCt\", \"\", \"CfC\", \"\", \"fp\", \"TpC\", \"fftT\", \"p\", \"\", \"Tp\", \"Tf\", \"Pct\", \"T\", \"TPCF\", \"c\", \"PCTC\", \"Tf\", \"\", \"T\"}");
        System.out.println("expecting output:");
        System.out.println("{29, 18, 0, 3, 0, 46, 0, 3, 41, 18, 0, 41, 0, 29, 7, 17, 3, 0, 7, 29, 18, 0, 17, 29, 17, 46, 46, 18, 46, 29, 17, 0, 18, 0, 7, 29, 7, 18, 0, 29, 29, 46, 29, 29, 17, 46, 29, 0, 29}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},new int[]{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},new int[]{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},new String[]{"TTfc", "p", "", "ttFT", "", "PCPf", "", "t", "FP", "CCF", "", "FCC", "", "TpCc", "ftF", "cpt", "t", "", "f", "TC", "p", "", "cFC", "TcFc", "ct", "Pf", "P", "pTF", "PtT", "TCP", "cCCt", "", "CfC", "", "fp", "TpC", "fftT", "p", "", "Tp", "Tf", "Pct", "T", "TPCF", "c", "PCTC", "Tf", "", "T"})));
        // System.out.println(test.selectMeals(new int[]{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},new int[]{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},new int[]{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},new String[]{"TTfc", "p", "", "ttFT", "", "PCPf", "", "t", "FP", "CCF", "", "FCC", "", "TpCc", "ftF", "cpt", "t", "", "f", "TC", "p", "", "cFC", "TcFc", "ct", "Pf", "P", "pTF", "PtT", "TCP", "cCCt", "", "CfC", "", "fp", "TpC", "fftT", "p", "", "Tp", "Tf", "Pct", "T", "TPCF", "c", "PCTC", "Tf", "", "T"}));
// if (Math.abs(test.selectMeals(new int[]{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},new int[]{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},new int[]{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},new String[]{"TTfc", "p", "", "ttFT", "", "PCPf", "", "t", "FP", "CCF", "", "FCC", "", "TpCc", "ftF", "cpt", "t", "", "f", "TC", "p", "", "cFC", "TcFc", "ct", "Pf", "P", "pTF", "PtT", "TCP", "cCCt", "", "CfC", "", "fp", "TpC", "fftT", "p", "", "Tp", "Tf", "Pct", "T", "TPCF", "c", "PCTC", "Tf", "", "T"})-new int[]{29, 18, 0, 3, 0, 46, 0, 3, 41, 18, 0, 41, 0, 29, 7, 17, 3, 0, 7, 29, 18, 0, 17, 29, 17, 46, 46, 18, 46, 29, 17, 0, 18, 0, 7, 29, 7, 18, 0, 29, 29, 46, 29, 29, 17, 46, 29, 0, 29})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},new int[]{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},new int[]{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},new String[]{"TTfc", "p", "", "ttFT", "", "PCPf", "", "t", "FP", "CCF", "", "FCC", "", "TpCc", "ftF", "cpt", "t", "", "f", "TC", "p", "", "cFC", "TcFc", "ct", "Pf", "P", "pTF", "PtT", "TCP", "cCCt", "", "CfC", "", "fp", "TpC", "fftT", "p", "", "Tp", "Tf", "Pct", "T", "TPCF", "c", "PCTC", "Tf", "", "T"}),new int[]{29, 18, 0, 3, 0, 46, 0, 3, 41, 18, 0, 41, 0, 29, 7, 17, 3, 0, 7, 29, 18, 0, 17, 29, 17, 46, 46, 18, 46, 29, 17, 0, 18, 0, 7, 29, 7, 18, 0, 29, 29, 46, 29, 29, 17, 46, 29, 0, 29})) {
// if (test.selectMeals(new int[]{58, 4, 8, 44, 79, 65, 5, 53, 78, 11, 30, 30, 87, 25, 57, 22, 32, 80, 2, 81, 30, 42, 11, 26, 4, 69, 46, 27, 75, 90, 39, 56, 78, 65, 12, 49, 38, 27, 80, 92, 5, 90, 9, 13, 72, 15, 98},new int[]{88, 13, 91, 15, 92, 69, 74, 60, 4, 33, 63, 29, 35, 76, 33, 69, 32, 3, 100, 72, 79, 61, 39, 88, 42, 87, 71, 47, 26, 83, 19, 33, 89, 98, 5, 79, 55, 98, 71, 69, 14, 20, 49, 42, 46, 77, 3},new int[]{64, 56, 44, 7, 54, 86, 18, 1, 69, 60, 3, 12, 27, 21, 47, 93, 33, 20, 45, 46, 20, 79, 45, 18, 78, 79, 46, 13, 36, 86, 56, 73, 67, 58, 80, 39, 76, 87, 4, 68, 65, 96, 82, 90, 37, 34, 17},new String[]{"TTfc", "p", "", "ttFT", "", "PCPf", "", "t", "FP", "CCF", "", "FCC", "", "TpCc", "ftF", "cpt", "t", "", "f", "TC", "p", "", "cFC", "TcFc", "ct", "Pf", "P", "pTF", "PtT", "TCP", "cCCt", "", "CfC", "", "fp", "TpC", "fftT", "p", "", "Tp", "Tf", "Pct", "T", "TPCF", "c", "PCTC", "Tf", "", "T"})==new int[]{29, 18, 0, 3, 0, 46, 0, 3, 41, 18, 0, 41, 0, 29, 7, 17, 3, 0, 7, 29, 18, 0, 17, 29, 17, 46, 46, 18, 46, 29, 17, 0, 18, 0, 7, 29, 7, 18, 0, 29, 29, 46, 29, 29, 17, 46, 29, 0, 29}) {
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
        System.out.println("{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},{\"\", \"pPcf\", \"CT\", \"\", \"pFtF\", \"\", \"FC\", \"pC\", \"PtF\", \"Fc\", \"F\", \"fcPT\", \"t\", \"p\", \"C\", \"tc\", \"ptpt\", \"\", \"\"}");
        System.out.println("expecting output:");
        System.out.println("{0, 25, 12, 0, 23, 0, 9, 23, 2, 22, 9, 8, 8, 23, 12, 8, 25, 0, 0}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},new int[]{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},new int[]{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},new String[]{"", "pPcf", "CT", "", "pFtF", "", "FC", "pC", "PtF", "Fc", "F", "fcPT", "t", "p", "C", "tc", "ptpt", "", ""})));
        // System.out.println(test.selectMeals(new int[]{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},new int[]{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},new int[]{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},new String[]{"", "pPcf", "CT", "", "pFtF", "", "FC", "pC", "PtF", "Fc", "F", "fcPT", "t", "p", "C", "tc", "ptpt", "", ""}));
// if (Math.abs(test.selectMeals(new int[]{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},new int[]{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},new int[]{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},new String[]{"", "pPcf", "CT", "", "pFtF", "", "FC", "pC", "PtF", "Fc", "F", "fcPT", "t", "p", "C", "tc", "ptpt", "", ""})-new int[]{0, 25, 12, 0, 23, 0, 9, 23, 2, 22, 9, 8, 8, 23, 12, 8, 25, 0, 0})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},new int[]{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},new int[]{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},new String[]{"", "pPcf", "CT", "", "pFtF", "", "FC", "pC", "PtF", "Fc", "F", "fcPT", "t", "p", "C", "tc", "ptpt", "", ""}),new int[]{0, 25, 12, 0, 23, 0, 9, 23, 2, 22, 9, 8, 8, 23, 12, 8, 25, 0, 0})) {
// if (test.selectMeals(new int[]{54, 24, 97, 51, 91, 42, 91, 44, 8, 47, 31, 30, 40, 53, 73, 54, 96, 76, 65, 49, 93, 92, 74, 1, 51, 1, 87, 57, 25, 66, 60, 39, 49, 74, 47, 96, 11, 82, 15, 23, 28, 77, 93, 90, 24, 72, 67, 89, 51},new int[]{83, 41, 40, 50, 61, 67, 16, 63, 66, 76, 28, 2, 95, 13, 65, 0, 72, 40, 94, 20, 57, 59, 30, 89, 59, 88, 9, 22, 95, 70, 10, 88, 25, 29, 31, 74, 77, 47, 22, 1, 81, 1, 91, 44, 3, 29, 70, 39, 83},new int[]{57, 59, 10, 71, 42, 88, 49, 18, 5, 98, 92, 64, 90, 27, 41, 78, 40, 15, 18, 50, 86, 59, 98, 78, 71, 77, 73, 90, 89, 44, 22, 19, 61, 90, 11, 70, 83, 77, 81, 59, 78, 21, 77, 84, 83, 17, 21, 70, 39},new String[]{"", "pPcf", "CT", "", "pFtF", "", "FC", "pC", "PtF", "Fc", "F", "fcPT", "t", "p", "C", "tc", "ptpt", "", ""})==new int[]{0, 25, 12, 0, 23, 0, 9, 23, 2, 22, 9, 8, 8, 23, 12, 8, 25, 0, 0}) {
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
        System.out.println("{18, 86, 76, 0, 34, 30, 95, 12, 21},{26, 56, 3, 45, 88, 0, 10, 27, 53},{93, 96, 13, 95, 98, 18, 59, 49, 86},{\"f\", \"Pt\", \"PT\", \"fT\", \"Cp\", \"C\", \"t\", \"\", \"cCp\", \"ttp\", \"PCFt\", \"P\", \"pCt\", \"cP\", \"Pc\"}");
        System.out.println("expecting output:");
        System.out.println("{2, 6, 6, 2, 4, 4, 5, 0, 5, 5, 6, 6, 3, 5, 6}");
        System.out.println("received output:");
         System.out.println(Arrays.toString(test.selectMeals(new int[]{18, 86, 76, 0, 34, 30, 95, 12, 21},new int[]{26, 56, 3, 45, 88, 0, 10, 27, 53},new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "", "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"})));
        // System.out.println(test.selectMeals(new int[]{18, 86, 76, 0, 34, 30, 95, 12, 21},new int[]{26, 56, 3, 45, 88, 0, 10, 27, 53},new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "", "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"}));
// if (Math.abs(test.selectMeals(new int[]{18, 86, 76, 0, 34, 30, 95, 12, 21},new int[]{26, 56, 3, 45, 88, 0, 10, 27, 53},new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "", "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"})-new int[]{2, 6, 6, 2, 4, 4, 5, 0, 5, 5, 6, 6, 3, 5, 6})<0.001) {
 if (Arrays.equals(test.selectMeals(new int[]{18, 86, 76, 0, 34, 30, 95, 12, 21},new int[]{26, 56, 3, 45, 88, 0, 10, 27, 53},new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "", "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"}),new int[]{2, 6, 6, 2, 4, 4, 5, 0, 5, 5, 6, 6, 3, 5, 6})) {
// if (test.selectMeals(new int[]{18, 86, 76, 0, 34, 30, 95, 12, 21},new int[]{26, 56, 3, 45, 88, 0, 10, 27, 53},new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "", "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"})==new int[]{2, 6, 6, 2, 4, 4, 5, 0, 5, 5, 6, 6, 3, 5, 6}) {
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


        System.out.println("Total count " + totalCount);
        System.out.println("Correct count " + correctCount);
}}