import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeDuplicate {
    public static void main(String[] args) {
        int nums[] = { 3,2,2,3 };
        int val = 3;

        int p = 0, i = 0;
        int right= nums.length;
        while (i <right) {
            if (val == nums[i]) {
                // System.out.println(nums[i]);
                int swap = nums[i];
                    nums[i] = nums[right-1];
                    nums[right-1] = swap;
                right--;
                p++;
            } else {
                System.out.println("in else");
                i++;
            }
        }
        System.out.println(p);
        System.out.println(nums.length - p);
        for(int c=0;c<(nums.length - p);c++){
            System.out.print("["+nums[i]+",]");
        }
        int x=1534236469;
        System.out.println("The total bit = "+Integer.bitCount(x));
        int arr[]=new int[2];
        System.out.println(arr.length);

    }
}
