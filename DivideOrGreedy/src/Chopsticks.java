import java.util.HashMap;
public class Chopsticks {
    public static int getmax(int[] length) {
        int count =0;
        HashMap<Integer,Integer> chopsticks = new HashMap<>();
        for (int i=0; i< length.length; i++) {
            if (chopsticks.containsKey(length[i])) {
                chopsticks.put(length[i],chopsticks.get(length[i])+1);
            }
            else {
                chopsticks.put(length[i],1);
            }
        }
        for (int j: chopsticks.values()) { // 1, 1 --- 1, 2 --- 1, 3.  3, 1 --- 3, 2
            count += j / 2;
        }

        return count;
    }
    public static void main (String[] args) {
        int[] array = {5,5};
        System.out.println("{5,5}");
        System.out.println("Returns: " + getmax(array));

        int[] array1 = {1,2,3,2,1,2,3,2,1};
        System.out.println("{1,2,3,2,1,2,3,2,1}");
        System.out.println("Returns: " + getmax(array1));

        int[] array2 = {1};
        System.out.println("{1}");
        System.out.println("Returns: " + getmax(array2));

        int[] array3 = {1,2,3,4,5,6,7,8,9};
        System.out.println("{1,2,3,4,5,6,7,8,9}");
        System.out.println("Returns: " + getmax(array3));

        int[] array4 = {35,35,35,50,16,30,10,10,35,50,16,16,16,30,50,30,16,35,50,30,10,50,50,16,16,10,35,50,50,50,16,35,35,30,35,10,50,10,50,50,16,30,35,10,10,30,10,10,16,35};
        System.out.println("{35,35,35,50,16,30,10,10,35,50,16,16,16,30,50,30,16,35,50,30,10,50,50,16,16,10,35,50,50,50,16,35,35,30,35,10,50,10,50,50,16,30,35,10,10,30,10,10,16,35}");
        System.out.println("Returns: " + getmax(array4));
    }
}
