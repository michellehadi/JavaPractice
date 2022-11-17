import java.util.Arrays;
public class SortingSubsets {
    public static int getMinimalSize(int[] a) {
        int count = 0;
        int[] sorted = a.clone();
        Arrays.sort(sorted);

        for (int i=0; i<a.length; i++) {
            if (a[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        int[] array = {3,2,1};
        System.out.println("{3,2,1}");
        System.out.println("Returns: " + getMinimalSize(array));

        int[] array1 = {1,2,3,4};
        System.out.println("{1,2,3,4}");
        System.out.println("Returns: " + getMinimalSize(array1));

        int[] array2 = {4,4,4,3,3,3};
        System.out.println("{4,4,4,3,3,3}");
        System.out.println("Returns: " + getMinimalSize(array2));

        int[] array3 = {11,11,49,7,11,11,7,7,11,49,11};
        System.out.println("{11,11,49,7,11,11,7,7,11,49,11}");
        System.out.println("Returns: " + getMinimalSize(array3));
    }
}
