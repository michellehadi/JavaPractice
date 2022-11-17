//public class UnsealTheSafe {
//    public static long countPasswords (int N) {
//        long[][] array = new long [31][11];
//        // looping for the first digits
//        for (int i=0; i<10; i++) {
//            array[1][i] = 1;
//        }
//        // looping for the next digits
//        for (int j=2; j<=N; j++) {
//            array[j][1] = array[j-1][2] + array[j-1][4];
//            array[j][2] = array[j-1][1] + array[j-1][3] + array[j-1][5];
//            array[j][3] = array[j-1][2] + array[j-1][6];
//            array[j][4] = array[j-1][1] + array[j-1][5] + array[j-1][7];
//            array[j][5] = array[j-1][2] + array[j-1][6] + array[j-1][8] + array[j-1][4];
//            array[j][6] = array[j-1][3] + array[j-1][5] + array[j-1][9];
//            array[j][7] = array[j-1][0] + array[j-1][4] + array[j-1][8];
//            array[j][8] = array[j-1][7] + array[j-1][5] + array[j-1][9];
//            array[j][9] = array[j-1][6] + array[j-1][8];
//            array[j][0] = array[j-1][7];
//        }
//        long answer = 0; // to store the answer
//        // looping for summing answer
//        for (int k=0; k<10; k++) {
//            answer += array[N][k];
//        }
//        return answer;
//    }
//    public static void main (String[] args) {
//        System.out.println("2");
//        System.out.println("Returns : " + countPasswords(2));
//        System.out.println("3");
//        System.out.println("Returns : " + countPasswords(3));
//        System.out.println("25");
//        System.out.println("Returns : " + countPasswords(25));
//    }
//}
