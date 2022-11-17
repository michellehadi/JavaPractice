import java.util.Arrays;
public class CostOfDancing {
    public static int minimum (int K, int[] danceCost) {
        int sum = 0;
        Arrays.sort(danceCost);
        System.out.print("{");
        CostOfDancing.print(danceCost);
        System.out.println("}");
        for (int i=0; i<danceCost.length;i++) {
            while (K != 0) {
                sum += danceCost[i];
                K--;
                break;
            }
        }
        return sum;
    }
    public static void print (int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        int[] arr = {1,5,3,4};
        System.out.println("Returns: " + minimum(2,arr));

        int[] arr1 = {1,5,4};
        System.out.println("Returns: " + minimum(3,arr1));

        int[] arr2 = {2,2,4,5,3};
        System.out.println("Returns: " + minimum(1,arr2));

        int[] arr3 = {973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794, 913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
                703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801};
        System.out.println("Returns: " + minimum(39,arr3));
    }
}