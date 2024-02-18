import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = { 1, 1 };
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < len; i++) {
            int p = Math.abs(nums[i]) - 1;

            if (p < 0 || p > len - 1) {
                continue;
            } else {
                if (nums[p] == 0) {
                    nums[p] = -1 * (len + 1);
                } else {
                   nums[p]*=(nums[0]<0)?1:-1;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int n = 1;
        for (int i = 0; i < len; i++) {
            int p = n - 1;
            if (p < 0 || p > len - 1)
                continue;
            else {
                if (nums[p] < 0) {
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}
