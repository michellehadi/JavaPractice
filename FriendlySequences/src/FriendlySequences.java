import java.util.*;

public class FriendlySequences {
    public int count (int[] array) {
        int count = 0;
        for (int i=0; i< array.length - 1; i++) { //{12, 112, 21, 12221, 11122211, 345}
            int countFac = 0;
            for (int j=i+1; j< array.length; j++) {
                String str1 = Integer.toString(array[i]); //12
                String str2 = Integer.toString(array[j]); //1223

                String[] arr1 = str1.split(""); //1, 2
                String[] arr2 = str2.split(""); //1, 1, 2

                Set<String> var1 = new HashSet<>(Arrays.asList(arr1)); //1, 2
                Set<String> var2 = new HashSet<>(Arrays.asList(arr2)); //1, 2 // duplikat dihilangin + ascending diurutin

                if (var1.equals(var2)) {
                    countFac += 1;
                    count += countFac;
                    i++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
