import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int candidates[] = { 2,3,6,7 };
        int target = 7;
        List<List<Integer>> arr = new ArrayList<>();
        int len = candidates.length;

        for (int num : candidates) {

            int sum = 0;
            int i = 0;
            List<Integer> nums = new ArrayList<>();
            nums.add(num);
            sum=num;
            while (i < len) { 
                if (num == target) {
                    nums.add(num);
                    break;
                }
                sum = sum + candidates[i];
                // System.out.println(sum);
                if (sum > target) {
                    i++;
                    sum=num;
                } else if (sum == target) {
                    break;
                } else {
                    System.out.println("in else = "+ candidates[i]);
                    nums.add(candidates[i]);
                }

            }
            System.out.println(nums.toString());
            if (!nums.isEmpty()) {
                arr.add(nums);
            }
        }
        System.out.println("The array = " + arr.toString());
    }
}
