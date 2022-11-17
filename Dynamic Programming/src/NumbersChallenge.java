/*public class NumbersChallenge {
    public static int MinNumber(int[] S) { // 1, 2, 4
        sort(S);
        int sum = 0;
        int i,j;
        for (i=1; ;i++) { //    ^
            for (j=0; j<S.length;j++) {
                sum += S[j];
                //System.out.println(sum + " + " + i);
                if (sum == i) {
                    break;
                }
                else if (sum > i) { // 1 2 3 4 5 6 -> 1 2 4     6
                    int k = 0;
                    for (k=j-1;k>=0 ;k--) {
                        if (sum - S[k] > i) {
                            sum -= S[k];
                        } else if (sum - S[k] == i) {
                            break;
                        }
                    }
                    if (k < 0) {
                        return i;
                    }
                    break;
                }
            }
            if (j == S.length) {
                return i;
            }
            sum = 0;
        }
    }
    public static void sort (int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-i-1;j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        int[] arr1 = {5,1,2};
        System.out.println("{5, 1, 2}");
        System.out.println("Returns: " + MinNumber(arr1));
        System.out.println();
        int[] arr2 = {2,1,4};
        System.out.println("{2, 1, 4}");
        System.out.println("Returns: " + MinNumber(arr2));
        System.out.println();
        int[] arr3 = {2,1,2,7};
        System.out.println("{2, 1, 2, 7}");
        System.out.println("Returns: " + MinNumber(arr3));
        System.out.println();
        int[] arr4 = {94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1};
        System.out.println("{94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}");
        System.out.println("Returns: " + MinNumber(arr4));
        System.out.println();
        int[] arr = {883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13};
        System.out.println("{883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}");
        System.out.println("Returns: " + MinNumber(arr));
    }
}
*/