public class B1 {
    public static int getMin(int[] item) {
        int count = 0;
        int i,j,k,sum;
        for (i = 0; i < item.length;) {
            if (item[i] == 0) {
                i++;
            }
            else if (item[i] != 0) {
                for (j = 1; j < item.length;) {
                    if (item[j] == 0) {
                        j++;
                    }
                    else if (item[j] != 0) {
                        sum = item[i] + item[j];
                        if (sum > 300) {
                            j++;
                        }
                        else if (sum < 301) {
                            //System.out.println(item[i] + item[j]);
                            item[i] = 0;
                            //System.out.println(item[i]);
                            item[j] = 0;
                            j++;
                            count++;
                        }
                    }
                }
                i++;
            }
        }
        for (k=0; k<item.length; k++) {
            if (item[k] > 100 && item[k] < 301) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        int[] array = {150, 150, 150, 150, 150};
        System.out.println("Input: {150, 150, 150, 150, 150}");
        System.out.println("Output: " + getMin(array));

        int[] array1 = {130,140,150,160};
        System.out.println("Input: {130, 140, 150, 160}");
        System.out.println("Output: " + getMin(array1));

        int[] array2 = {101, 101, 101, 101, 101, 101, 101, 101, 101};
        System.out.println("Input: {101, 101, 101, 101, 101, 101, 101, 101, 101}");
        System.out.println("Output: " + getMin(array2));

        int[] array3 = {101, 200, 101, 101, 101, 101, 200, 101, 200};
        System.out.println("Input: {101, 200, 101, 101, 101, 101, 200, 101, 200}");
        System.out.println("Output: " + getMin(array3));

        int[] array4 = {123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198};
        System.out.println("Input: {123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198}");
        System.out.println("Output: " + getMin(array4));

        int[] array5 = {193, 193, 198, 197, 188, 188, 185, 190, 191, 195, 191, 188, 198, 189, 186, 195, 199, 200, 186, 189, 187, 200, 188, 198, 194, 192, 193, 197, 190, 198, 188};
        System.out.println("Input: {193, 193, 198, 197, 188, 188, 185, 190, 191, 195, 191, 188, 198, 189, 186, 195, 199, 200, 186, 189, 187, 200, 188, 198, 194, 192, 193, 197, 190, 198, 188}");
        System.out.println("Output: " + getMin(array5));

        int[] array6 = {263, 229, 244, 249};
        System.out.println("Input: {263, 229, 244, 249}");
        System.out.println("Output: "+ getMin(array6));

        int[] array7 = {185, 166, 194, 201, 220, 198, 176, 179, 160, 138, 196, 150, 149, 157, 160, 222, 109, 169, 196, 197, 124, 119, 224, 152, 123, 116, 142, 119, 218, 123, 131, 188, 187, 177, 210, 205, 196, 166, 120, 214, 165, 192, 154, 200};
        System.out.println("Input: {185, 166, 194, 201, 220, 198, 176, 179, 160, 138, 196, 150, 149, 157, 160, 222, 109, 169, 196, 197, 124, 119, 224, 152, 123, 116, 142, 119, 218, 123, 131, 188, 187, 177, 210, 205, 196, 166, 120, 214, 165, 192, 154, 200}");
        System.out.println("Output: " + getMin(array7));

        int[] array8 = {159, 155, 157, 163, 155, 164, 154, 164, 160, 162, 157, 156, 155, 156, 161, 163, 165};
        System.out.println("Input: {159, 155, 157, 163, 155, 164, 154, 164, 160, 162, 157, 156, 155, 156, 161, 163, 165}");
        System.out.println("Output: "+ getMin(array8));

        int[] array9 = {226, 225, 253, 240, 231, 253, 243, 231, 222, 229, 254, 228, 246, 262, 242, 226, 251, 260, 242, 242, 231, 261, 252, 248, 245, 228, 261, 242, 241, 226, 264, 258, 263, 230, 257};
        System.out.println("Input: {226, 225, 253, 240, 231, 253, 243, 231, 222, 229, 254, 228, 246, 262, 242, 226, 251, 260, 242, 242, 231, 261, 252, 248, 245, 228, 261, 242, 241, 226, 264, 258, 263, 230, 257}");
        System.out.println("Output: "+ getMin(array9));

        int[] array12 = {255, 246, 166, 204, 200, 219, 179, 183, 262, 213, 191};
        System.out.println("Input: {255, 246, 166, 204, 200, 219, 179, 183, 262, 213, 191}");
        System.out.println("Output: "+ getMin(array12));

        int[] array10 = {217, 204, 214, 218, 221, 211, 211, 223, 224, 218, 217, 206, 212, 216, 214, 225, 213, 224, 205, 213, 223, 219, 205, 210, 205, 218, 218};
        System.out.println("Input: {217, 204, 214, 218, 221, 211, 211, 223, 224, 218, 217, 206, 212, 216, 214, 225, 213, 224, 205, 213, 223, 219, 205, 210, 205, 218, 218}");
        System.out.println("Output: "+ getMin(array10));

        int[] array11 = {163, 162, 166, 166, 164, 168, 169, 161, 161, 164, 162, 161};
        System.out.println("Input: {163, 162, 166, 166, 164, 168, 169, 161, 161, 164, 162, 161}");
        System.out.println("Output: "+ getMin(array11));

        int[] array13 = {126, 158, 181, 132};
        System.out.println("Input: {126, 158, 181, 132}");
        System.out.println("Output: "+ getMin(array13));

        int[] array14 = {224, 227, 221, 225, 222, 225, 225, 219, 228, 228, 225, 225, 223, 228, 222, 219, 227, 221, 220, 219, 219, 228, 224, 225, 227, 222, 224, 223, 219, 228, 219, 219};
        System.out.println("Input: {224, 227, 221, 225, 222, 225, 225, 219, 228, 228, 225, 225, 223, 228, 222, 219, 227, 221, 220, 219, 219, 228, 224, 225, 227, 222, 224, 223, 219, 228, 219, 219}");
        System.out.println("Output: "+ getMin(array14));
    }
}
