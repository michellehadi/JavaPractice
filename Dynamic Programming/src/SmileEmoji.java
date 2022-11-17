import java.util.Scanner;
public class SmileEmoji {
    public static int printSmiles(int smiles) {
        int total = 1; // total of emoji in chat box
        int copy = 1; // total of emoji in clipboard
        int seconds = 0;
        // Loop until current emoji match the desired total smiles
        while (total != smiles) {
            total += copy;
            seconds += 1;

            // Only copy when its the current total is divisible with the smiles
            if (smiles % total == 0) {
                copy = total;
                seconds = seconds + 1;
            }
        }
        return seconds;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int smiles = input.nextInt();
        input.nextLine();

        int seconds = printSmiles(smiles);
        System.out.println("Output: " + seconds);

        System.out.print("Input: ");
        int smiles1 = input.nextInt();
        input.nextLine();

        int seconds1 = printSmiles(smiles1);
        System.out.println("Output: " + seconds1);

        System.out.print("Input: ");
        int smiles2 = input.nextInt();
        input.nextLine();

        int seconds2 = printSmiles(smiles2);
        System.out.println("Output: " + seconds2);

        System.out.print("Input: ");
        int smiles3 = input.nextInt();
        input.nextLine();

        int seconds3 = printSmiles(smiles3);
        System.out.println("Output: " + seconds3);

        System.out.print("Input: ");
        int smiles4 = input.nextInt();
        input.nextLine();

        int seconds4 = printSmiles(smiles4);
        System.out.println("Output: " + seconds4);


        input.close();
    }
}