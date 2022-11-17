import java.util.Scanner;

public class BritishCoins {
    public static int[] coins(int pence) {
        int pound = pence / 240;
        int shi = pence % 240;
        int shillings = shi / 12;
        int pennies = shi % 12;

        int[] coin = new int[] {pound,shillings,pennies};
        return coin;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i < 5; i++) {
            System.out.println("Input: ");
            int[] b = coins(input.nextInt());
            System.out.print("Output: {");
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[j] + ", ");
            }
            System.out.println("}");
        }
    }
}