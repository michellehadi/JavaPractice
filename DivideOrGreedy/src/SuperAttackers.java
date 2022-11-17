import java.util.ArrayList;
import java.util.Arrays;

public class SuperAttackers {
    static int N = 50;

    public static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
        for (i = 0; i < 50; i++)
            if (board[row][i] == 1 && i != col)
                return false;

        for (i = 0; i < 50; i++)
            if (board[i][col] == 1 && i != row)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j++)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j < N && i < N; i++, j++)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    public static int[] addAttackers(int[] row, int[] col, int add) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int counter = 0;
        int result [] = new int[0];
        if(add == 0)
            return result;

        int [][] maps = new int[50][50];

        for (int[] data: maps)
            Arrays.fill(data, 0);

        for(int i=0; i< row.length; i++) {
            maps[row[i]][col[i]] = 1;
        }

        int len = 50;

        for(int i=0; i< len; i++) {
            for(int j=0; j< len; j++) {
                if(isSafe(maps, i,j)) {

                    answer.add(i);
                    answer.add(j);
                    maps[i][j] = 1;
                    counter += 2;
                    break;
                }
            }
            if(counter /2 == add) {
                result = new int[answer.size()];

                for(int a=0; a<answer.size(); a++)
                    result[a] = answer.get(a);
                //printSolution(maps);

                return result;
            }
        }


        return result;
    }

    static void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static void printing(int [] data) {
        System.out.print("{");
        for(int i=0 ;i<data.length; i++) {
            if (i == data.length -1)
                System.out.print(data[i]);
            else
                System.out.print(data[i] + ", ");
        }
        System.out.println("}");

    }

    public static void main(String[] args) {
        int row1 []= {3};
        int col1 []= {5};
        int add1 = 1;
        System.out.println("Input0: ");
        printing(row1);
        printing(col1);
        System.out.println(add1);
        System.out.println("Output0: ");
        printing(addAttackers(row1, col1, add1));

        System.out.println();

        int row2 []= {0};
        int col2 []= {1};
        int add2 = 1;
        System.out.println("Input1: ");
        printing(row2);
        printing(col2);
        System.out.println(add2);
        System.out.println("Output1: ");
        printing(addAttackers(row2, col2, add2));

        System.out.println();

        int row3 []= {0};
        int col3 []= {1};
        int add3 = 3;
        System.out.println("Input2: ");
        printing(row3);
        printing(col3);
        System.out.println(add3);
        System.out.println("Output2: ");
        printing(addAttackers(row3, col3, add3));

        System.out.println();

        int row4 []= {4,19};
        int col4 []= {3,47};
        int add4 = 0;
        System.out.println("Input3: ");
        printing(row4);
        printing(col4);
        System.out.println(add4);
        System.out.println("Output3: ");
        printing(addAttackers(row4, col4, add4));

        System.out.println();

        int row5 []= {};
        int col5 []= {};
        int add5 = 2;
        System.out.println("Input4: ");
        printing(row5);
        printing(col5);
        System.out.println(add5);
        System.out.println("Output4: ");
        printing(addAttackers(row5, col5, add5));

        System.out.println();

        int row6 []= {1,2,3};
        int col6 []= {7,2,19};
        int add6 = 3;
        System.out.println("Input5: ");
        printing(row6);
        printing(col6);
        System.out.println(add6);
        System.out.println("Output5: ");
        printing(addAttackers(row6, col6, add6));
    }

}

//
//    public static int length (int[] attackers) {
//        return attackers.length;
//    }
//    public static void main (String[] args) {
//        int i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x;
//        int[] row = {3};
//        int[] col = {5};
//        int len = length(addAttackers(row,col,1));
//        int[] arr = addAttackers(row,col,1);
//        System.out.println("{3}");
//        System.out.println("{5}");
//        System.out.println("Output: {");
//        for (i=0; i<len; i++) {
//            System.out.println(arr[i] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row1 = {0};
//        int[] col1 = {1};
//        int len1 = length(addAttackers(row1,col1,1));
//        int[] arr1 = addAttackers(row1,col1,1);
//        System.out.println("{0}");
//        System.out.println("{1}");
//        System.out.println("Output: {");
//        for (j=0; j<len1; j++) {
//            System.out.println(arr1[j] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row2 = {0};
//        int[] col2 = {1};
//        int len2 = length(addAttackers(row2,col2,3));
//        int[] arr2 = addAttackers(row2,col2,3);
//        System.out.println("{0}");
//        System.out.println("{1}");
//        System.out.println("Output: {");
//        for (k=0; k<len2; k++) {
//            System.out.println(arr2[k] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row3 = {14,19};
//        int[] col3 = {3,47};
//        int len3 = length(addAttackers(row3,col3,0));
//        int[] arr3 = addAttackers(row3,col3,0);
//        System.out.println("{14,19}");
//        System.out.println("{3,47}");
//        System.out.println("Output: {");
//        for (l=0; l<len3; l++) {
//            System.out.println(arr3[l] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row4 = {};
//        int[] col4 = {};
//        int len4 = length(addAttackers(row4,col4,2));
//        int[] arr4 = addAttackers(row4,col4,2);
//        System.out.println("{ }");
//        System.out.println("{ }");
//        System.out.println("Output: {");
//        for (m=0; m<len4; m++) {
//            System.out.println(arr4[m] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row5 = {1,2,3};
//        int[] col5 = {7,2,19};
//        int len5 = length(addAttackers(row5,col5,1));
//        int[] arr5 = addAttackers(row5,col5,1);
//        System.out.println("{1,2,3}");
//        System.out.println("{7,2,19}");
//        System.out.println("Output: {");
//        for (n=0; n<len5; n++) {
//            System.out.println(arr5[n] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row6 = {};
//        int[] col6 = {};
//        int len6 = length(addAttackers(row6,col6,16));
//        int[] arr6 = addAttackers(row6,col6,16);
//        System.out.println("{ }");
//        System.out.println("{ }");
//        System.out.println("Output: {");
//        for (o=0; o<len6; o++) {
//            System.out.println(arr6[o] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row7 = {};
//        int[] col7 = {};
//        int len7 = length(addAttackers(row7,col7,0));
//        int[] arr7 = addAttackers(row7,col7,0);
//        System.out.println("{ }");
//        System.out.println("{ }");
//        System.out.println("Output: {");
//        for (p=0; p<len7; p++) {
//            System.out.println(arr7[p] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row8 = {4, 35, 36, 16, 24, 39, 1, 34, 32, 28, 2, 23};
//        int[] col8 = {27, 29, 21, 32, 25, 2, 6, 0, 22, 15, 35, 45};
//        int len8 = length(addAttackers(row8,col8,4));
//        int[] arr8 = addAttackers(row8,col8,4);
//        System.out.println("{4, 35, 36, 16, 24, 39, 1, 34, 32, 28, 2, 23}");
//        System.out.println("{27, 29, 21, 32, 25, 2, 6, 0, 22, 15, 35, 45}");
//        System.out.println("Output: {");
//        for (q=0; q<len8; q++) {
//            System.out.println(arr8[q] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row9 = {38, 35, 48, 15, 2, 21, 24, 34, 6, 14, 30, 26};
//        int[] col9 = {21, 36, 12, 46, 8, 6, 32, 16, 41, 44, 47, 38};
//        int len9 = length(addAttackers(row9,col9,4));
//        int[] arr9 = addAttackers(row9,col9,4);
//        System.out.println("{38, 35, 48, 15, 2, 21, 24, 34, 6, 14, 30, 26}");
//        System.out.println("{21, 36, 12, 46, 8, 6, 32, 16, 41, 44, 47, 38}");
//        System.out.println("Output: {");
//        for (r=0; r<len9; r++) {
//            System.out.println(arr9[r] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row10 = {43, 49, 35, 22, 30, 36, 46, 14, 7, 13, 38, 0};
//        int[] col10 = {18, 15, 16, 34, 19, 49, 33, 38, 40, 24, 35, 10};
//        int len10 = length(addAttackers(row10,col10,4));
//        int[] arr10 = addAttackers(row10,col10,4);
//        System.out.println("{43, 49, 35, 22, 30, 36, 46, 14, 7, 13, 38, 0}");
//        System.out.println("{18, 15, 16, 34, 19, 49, 33, 38, 40, 24, 35, 10}");
//        System.out.println("Output: {");
//        for (s=0; s<len10; s++) {
//            System.out.println(arr10[s] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row11 = {4, 32, 34};
//        int[] col11 = {17, 39, 30};
//        int len11 = length(addAttackers(row11,col11,13));
//        int[] arr11 = addAttackers(row11,col11,13);
//        System.out.println("{4, 32, 34}");
//        System.out.println("{17, 39, 30}");
//        System.out.println("Output: {");
//        for (t=0; t<len11; t++) {
//            System.out.println(arr11[t] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row12 = {23, 2, 43, 45, 20, 36, 13, 11, 30, 8, 33, 6, 28, 41};
//        int[] col12 = {48, 38, 30, 40, 1, 15, 22, 11, 12, 6, 25, 17, 0, 7};
//        int len12 = length(addAttackers(row12,col12,2));
//        int[] arr12 = addAttackers(row12,col12,2);
//        System.out.println("{23, 2, 43, 45, 20, 36, 13, 11, 30, 8, 33, 6, 28, 41}");
//        System.out.println("{48, 38, 30, 40, 1, 15, 22, 11, 12, 6, 25, 17, 0, 7}");
//        System.out.println("Output: {");
//        for (u=0; u<len12; u++) {
//            System.out.println(arr12[u] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row13 = {4, 1, 2, 11, 32, 12, 31, 29, 36, 44, 34, 40, 39, 24};
//        int[] col13 = {23, 16, 8, 47, 31, 49, 33, 36, 0, 4, 21, 2, 15, 7};
//        int len13 = length(addAttackers(row13,col13,2));
//        int[] arr13 = addAttackers(row13,col13,2);
//        System.out.println("{38, 35, 48, 15, 2, 21, 24, 34, 6, 14, 30, 26}");
//        System.out.println("{23, 16, 8, 47, 31, 49, 33, 36, 0, 4, 21, 2, 15, 7}");
//        System.out.println("Output: {");
//        for (v=0; v<len13; v++) {
//            System.out.println(arr13[v] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row14 = {4, 1, 2, 11, 32, 12, 31, 29, 36, 44, 34, 40, 39, 24};
//        int[] col14 = {23, 16, 8, 47, 31, 49, 33, 36, 0, 4, 21, 2, 15, 7};
//        int len14 = length(addAttackers(row14,col14,2));
//        int[] arr14 = addAttackers(row14,col14,2);
//        System.out.println("{38, 35, 48, 15, 2, 21, 24, 34, 6, 14, 30, 26}");
//        System.out.println("{21, 36, 12, 46, 8, 6, 32, 16, 41, 44, 47, 38}");
//        System.out.println("Output: {");
//        for (w=0; w<len14; w++) {
//            System.out.println(arr14[w] + ", ");
//        }
//        System.out.println("Output: }");
//
//        int[] row15 = {5};
//        int[] col15 = {19};
//        int len15 = length(addAttackers(row15,col15,15));
//        int[] arr15 = addAttackers(row15,col15,15);
//        System.out.println("{5}");
//        System.out.println("{19}");
//        System.out.println("Output: {");
//        for (x=0; x<len15; x++) {
//            System.out.println(arr15[x] + ", ");
//        }
//        System.out.println("Output: }");
//    }
//}
