import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = { 2, 2, 2 };
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            digits[i]++;
            

            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                System.out.println(Arrays.toString(digits));
            }
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));

    }
}
