public class MatrixSwap {
    public static int swapNum(int M, int N) {
        if (M == N) {
            return matrix(M,M) / 2;
        }
        else if (M > N) {
            return matrix(M,M) / 2;
        }
        else if (N > M) {
            return matrix(N,N) / 2;
        }
        return -1;
    }

    public static int matrix(int M, int N) {
        int swap = 0;
        int[][] matrix = new int[M][N];
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (i != j) {
                    matrix[i][j] = 0;
                    swap++;
                }
            }
        }
        return swap;
    }
    public static void main (String[] args) {
        System.out.println("Input: 3, 3");
        System.out.println("Output: " + swapNum(3,3));

        System.out.println("Input: 2, 3");
        System.out.println("Output: " + swapNum(2,3));

        System.out.println("Input: 3, 5");
        System.out.println("Output: " + swapNum(3,5));

        System.out.println("Input: 50, 50");
        System.out.println("Output: " + swapNum(50,50));

        System.out.println("Input: 49, 51");
        System.out.println("Output: " + swapNum(49,51));

        System.out.println("Input: 100, 100");
        System.out.println("Output: " + swapNum(100,100));

        System.out.println("Input: 1, 100");
        System.out.println("Output: " + swapNum(1,100));

        System.out.println("Input: 99, 100");
        System.out.println("Output: " + swapNum(99,100));

        System.out.println("Input: 81, 9");
        System.out.println("Output: " + swapNum(81,9));

        System.out.println("Input: 10, 10");
        System.out.println("Output: " + swapNum(10,10));

        System.out.println("Input: 10, 11");
        System.out.println("Output: " + swapNum(10,11));

        System.out.println("Input: 49, 99");
        System.out.println("Output: " + swapNum(49,99));

        System.out.println("Input: 99, 51");
        System.out.println("Output: " + swapNum(99,51));

        System.out.println("Input: 35, 45");
        System.out.println("Output: " + swapNum(35,45));

        System.out.println("Input: 46, 36");
        System.out.println("Output: " + swapNum(46,36));
    }
}