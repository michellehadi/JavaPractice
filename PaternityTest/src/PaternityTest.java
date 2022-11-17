import java.util.Scanner;

public class PaternityTest {
    public static int[] possibleFathers (String child, String mother, String[] men) {//ABCD, ABCX, [ABCY, ASTD, QBCD]
        int[] arr = new int[5];//AB | AC
        for (int i=0; i< arr.length; i++) {
            arr[i] = -1;
        }
        for (int j=0; j< men.length;j++) {
            if (checkDNA(child,mother,men[j])) {
                arr[j] = j;
            }
        }
        return arr;
    }
    public static boolean checkDNA (String child, String mother, String men) {
        int childMother = 0;
        int childFather = 0;
        for (int i = 0; i < child.length(); i++) { // { ABCD, AXCY }
            if (child.charAt(i) == men.charAt(i)) {
                childFather++;
            }
            else if (child.charAt(i) == mother.charAt(i)) {
                childMother++;
            }
        }
        int combined = childMother + childFather;
        if (combined == child.length() && childFather >= childMother) {
            return true;
        }
        else
            return false;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String child = input.nextLine();
        String mother = input.nextLine();

        int num = input.nextInt(); input.nextLine();

        String[] men = new String[num];
        for (int i=0; i< men.length; i++) {
            men[i] = input.nextLine();
        }
        int[] answer1;
        answer1 = possibleFathers(child,mother,men);
        System.out.println("Returns: ");
        for (int j=0; j< answer1.length; j++) {
            if (answer1[j] != -1) {
                System.out.print(answer1[j] + " ");
            }
        }
    }
}