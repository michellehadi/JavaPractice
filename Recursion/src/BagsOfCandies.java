public class BagsOfCandies {
    public static int getGain(int [] bags) {
        int userCandy = sum(bags, 0);
        int bobCandy = sum(bags, 1);
        return userCandy - bobCandy;
    }
    //method to count the sum of candies
    public static int sum(int [] bags, int index) {
        if(index >= bags.length) {
            return 0;
        }

        return bags[index] + sum(bags, index+2);
    }

    public static void main(String[] args) {
        int[] arr = {7,2};
        System.out.print("Input: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr));
        System.out.println();
        int[] arr1 = {2,7,3};
        System.out.print("Input: ");
        for (int j=0; j<arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr1));
        System.out.println();
        int[] arr2 = {1000,1000,1000,1000,1000};
        System.out.print("Input: ");
        for (int k=0; k<arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr2));
        System.out.println();
        int[] arr3 = {823,912,345,100000,867,222,991,3,40000};
        System.out.print("Input: ");
        for (int l=0; l<arr3.length; l++) {
            System.out.print(arr3[l] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr3));
        System.out.println();
        int[] arr4 = {23,35,12,100000,99234,86123,3245};
        System.out.print("Input: ");
        for (int m=0; m<arr4.length; m++) {
            System.out.print(arr4[m] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr4));
        System.out.println();
        int[] arr5 = {23,35,12,100000,99234,86123,3245,1};
        System.out.print("Input: ");
        for (int n=0; n<arr5.length; n++) {
            System.out.print(arr5[n] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr5));
        System.out.println();
        int[] arr6 = {7, 7, 7, 7, 7, 7, 80, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.print("Input: ");
        for (int o=0; o<arr6.length; o++) {
            System.out.print(arr6[o] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr6));
        System.out.println();
        int[] arr7 = {7, 7, 7, 7, 7, 7, 7, 80, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.print("Input: ");
        for (int p=0; p<arr7.length; p++) {
            System.out.print(arr7[p] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr7));
        System.out.println();
        int[] arr8 = {91, 56, 23, 45, 87, 65, 45, 45, 78, 23, 20, 41, 17, 54, 51, 51, 94, 62, 74, 42, 76, 76};
        System.out.print("Input: ");
        for (int q=0; q<arr8.length; q++) {
            System.out.print(arr8[q] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr8));
        System.out.println();
        int[] arr9 = {92834, 95461, 15911, 56189, 6369, 80545, 31811, 51263, 30076, 68867, 36905, 32499, 59799, 334, 82991, 46636, 98741, 66601};
        System.out.print("Input: ");
        for (int r=0; r<arr9.length; r++) {
            System.out.print(arr9[r] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr9));
        System.out.println();
        int[] arr10 = {129};
        System.out.print("Input: ");
        for (int s=0; s<arr10.length; s++) {
            System.out.print(arr10[s] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr10));
        System.out.println();
        int[] arr11 = {35463, 88121, 4362, 94457, 86235, 83680, 72686, 6003, 93069, 2015, 10436, 2139, 93162, 30380, 19067, 76335, 78941, 48620, 55887, 15679};
        System.out.print("Input: ");
        for (int t=0; t<arr11.length; t++) {
            System.out.print(arr11[t] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr11));
        System.out.println();
        int[] arr12 = {19335, 97643, 11468, 86267, 79718, 59584, 12129, 52642, 86575, 62307, 11545, 52658, 72377, 39986, 74850, 1992, 86928};
        System.out.print("Input: ");
        for (int u=0; u<arr12.length; u++) {
            System.out.print(arr12[u] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr12));
        System.out.println();
        int[] arr13 = {91883, 97793, 54567, 64714, 98624};
        System.out.print("Input: ");
        for (int v=0; v<arr13.length; v++) {
            System.out.print(arr13[v] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr13));
        System.out.println();
        int[] arr14 = {98473, 41866, 71129, 65936, 42626, 9194, 46718, 96921, 45613, 47677, 8763, 54634, 47259, 71448, 9918, 22666, 32711, 21692, 40207, 2017, 23040, 86083, 77809, 15472, 30718, 39085, 87911, 54827, 41686, 28354, 37203, 6548, 74184, 3043, 43961, 95189, 1238, 22002, 93507, 63546, 32527, 42778, 31614};
        System.out.print("Input: ");
        for (int w=0; w<arr14.length; w++) {
            System.out.print(arr14[w] + " ");
        }
        System.out.println();
        System.out.println("Output: " + getGain(arr14));
        System.out.println();
    }
}
