import java.util.Scanner;

public class BusSeating {
    public static double getArrangement(String leftRow, String rightRow) {
        double y1 = 0.0;
        double y2 = 2.0;
        double x1;
        double x2;
        double sum = 0.0;
        for (int i=0; i<leftRow.length(); i++) {
             x1 = getCoordinate(leftRow.length(), leftRow.charAt(i));
             x2 = getCoordinate(leftRow.length(), rightRow.charAt(i));
             sum = checkDistance(x1,y1,x2,y2);
        }
        return sum;
    }
    public static double getCoordinate(int length, char row) {
        double x = 0.0;
        for (int i=0; i<length; i++) {
            if (row == '-') {
                x= (double) i;
            }
            if (row == 'X') {
                x = 0.0;
            }
        }
        if (x != 0.0) {
            return x;
        }
        else
            return 0.0;
    }

    public static double checkDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String left = input.nextLine();
        String right = input.nextLine();

        System.out.println("Output: " + getArrangement(left,right));
    }
}
