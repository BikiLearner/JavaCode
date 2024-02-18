import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiplyString {
    public static void main(String[] args) {
        // System.out.println(convertIntoInt("2390"));
        String num1 = "123";
        String num2 = "456";
        System.out.println(solve(num1, num2));

    }

    public static String solve(String n1, String n2) {
        StringBuilder reversed = new StringBuilder(n1).reverse();
        n1 = reversed.toString();
        reversed = new StringBuilder(n2).reverse();
        n2 = reversed.toString();
        String result = "";
        int sum[] = new int[n2.length() + n1.length()];
        for (int i = 0; i < n2.length(); i++) {
            System.out.println("part");
            for (int j = 0; j < n1.length(); j++) {
              
                int s = sum[(i + j)] + convertIntoInt(n1.charAt(j)) * convertIntoInt(n2.charAt(i));
                if (s > 9) {
                    sum[i + j] = s % 10;
                    sum[(i + j) + 1]+= s / 10;
                } else {
                    sum[i + j] = s;
                }
                System.out.println(Arrays.toString(sum));
            }
        }
        int p=0;
       
        for (int i = sum.length-1; i >-1; i--) {
            result += sum[i];
        }
        while (p < result.length() - 1 && result.charAt(p) == '0') {
            p++;
        }
        return result.substring(p);
    }

    public static int convertIntoInt(char ch) {
        return (ch - '0');
    }

    public static String convertToString(int num) {
        String str = "";
        while (num != 0) {
            int rem = num % 10;
            char ch = (char) ('0' + rem);
            ;
            str = ch + str;
            num = num / 10;
        }
        return str;
    }
}
