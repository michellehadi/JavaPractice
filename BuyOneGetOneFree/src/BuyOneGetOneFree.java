import java.util.Scanner;

public class BuyOneGetOneFree {
    public static int buy(int[] prices) { // 5, 7, 13, 2, 9, 10, 4 -> 13, 10, 9, 7, 5, 4, 2 -> 13 + 9 + 5 + 2
        prices = sort(prices);

        int total = 0;
        for(int i=0; i< prices.length; i+=2) {
                total += prices[i];
        }
        return total;
    }
    public static int[] sort(int[] prices) {
        int length = prices.length;
        for (int i=0; i<length-1; i++) {
            for (int j=0; j<length-i-1; j++) {
                if (prices[j] < prices[j+1]) {
                    int swap = prices[j];
                    prices[j] = prices[j+1];
                    prices[j+1] = swap;
                }
            }
        }
        return prices;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int[] arr = new int[angka];
        for (int i=0; i< arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(buy(arr));
    }
}
