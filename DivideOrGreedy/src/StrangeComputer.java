public class StrangeComputer {
    public static int setMemory (String mem) {
        String c = "";
        int count = 0;
        int i;
        String mom = mem.substring(0).replace("1", "0");
        //System.out.println("mem : " + mem);
        //System.out.println("mom : " + mom);
        while (true) {
            for (i = 0; i < mem.length(); i++) {
                //System.out.println(i);
                if (mem.charAt(i) != mom.charAt(i)) {
                    c = mom.substring(0, i);
                    //System.out.println(c);
                    if (mem.charAt(i) == '1') {
                        c += mom.substring(i, mem.length()).replace("0", "1");
                        //System.out.println(c);
                        mom = c;
                        count++;
                        break;
                    } else {
                        c += mom.substring(i, mem.length()).replace("1", "0");
                        mom = c;
                        count++;
                        break;
                    }
                }
            }
            if (i == mem.length()) {
                return count;
            }
        }
    }

    public static void main (String[] args) {
        String mem = "0011";
        String mem1 = "000";
        String mem2 = "0100";
        String mem3 = "111000111";
        System.out.println(mem);
        System.out.println("Returns: " + setMemory(mem));
        System.out.println(mem1);
        System.out.println("Returns: " + setMemory(mem1));
        System.out.println(mem2);
        System.out.println("Returns: " + setMemory(mem2));
        System.out.println(mem3);
        System.out.println("Returns: " + setMemory(mem3));
    }
}
