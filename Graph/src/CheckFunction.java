import java.util.HashMap;
public class CheckFunction {
    public static int newFunction(String code) {
        int totalDashes = 0;
        HashMap<Character,Integer> dashes = new HashMap<>();
        dashes.put('0',6);
        dashes.put('1',2);
        dashes.put('2',5);
        dashes.put('3',5);
        dashes.put('4',4);
        dashes.put('5',5);
        dashes.put('6',6);
        dashes.put('7',3);
        dashes.put('8',7);
        dashes.put('9',6);

        for (int i=0; i<code.length(); i++) {
            totalDashes += dashes.get(code.charAt(i));
        }
        return totalDashes;
    }
    public static void main (String[] args) {
        System.out.println("13579");
        System.out.println("Returns : " + newFunction("13579"));

        System.out.println("02468");
        System.out.println("Returns : " + newFunction("02468"));

        System.out.println("73254370932875002027963295052175");
        System.out.println("Returns : " + newFunction("73254370932875002027963295052175"));
    }
}
