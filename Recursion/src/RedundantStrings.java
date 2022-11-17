import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RedundantStrings {
    public static int howMany(int length) {
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        return helper(length, dictionary, 1);
    }

    public static int helper(int length, HashMap<Integer, Integer> dictionary, int index) {
        int totalRedundants = 0;
        if(index > length/2) {
            return 0;
        }

        if (length % index == 0) {
            int redundant = (int) Math.pow(2, index);
            if (!dictionary.isEmpty()) {
                for (Map.Entry<Integer, Integer> data : dictionary.entrySet()) {
                    //System.out.println("index: " + index);
                    //System.out.println("key: " + data.getKey());
                    //System.out.println("value: " + data.getValue());
                    if (index % data.getKey() == 0) {
                        redundant -= data.getValue();
                    }
                    //System.out.println("redundant: " + redundant);
                }
            }
            dictionary.put(index, redundant);
            totalRedundants += redundant;
            //System.out.println("total: " + totalRedundants);
            //System.out.println();
        }
        return totalRedundants + helper(length, dictionary, index+1);
    }

    public static void main(String[] args) {
        	/*
        	Scanner input = new Scanner(System.in);
        	int length = input.nextInt();
        	System.out.println(howMany(length));
        	*/
        System.out.println("Input: 1");
        System.out.println("Output: " + howMany(1));
        System.out.println();
        System.out.println("Input: 2");
        System.out.println("Output: " + howMany(2));
        System.out.println();
        System.out.println("Input: 4");
        System.out.println("Output: " + howMany(4));
        System.out.println();
        System.out.println("Input: 10");
        System.out.println("Output: " + howMany(10));
        System.out.println();
        System.out.println("Input: 30");
        System.out.println("Output: " + howMany(30));
    }
}