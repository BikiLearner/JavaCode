import java.util.Arrays;

public class threesumcloest {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1, l = 0;
        int len = nums.length;
        int sum = 0, minDiff = Integer.MAX_VALUE, p = 0;
        Arrays.sort(nums);
        outerloop: for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    p = sum;
                    break outerloop;
                } else if (sum < target) {
                    left++;

                } else {
                    right--;
                }
                int diff=Math.abs(sum-target);
                if(diff<minDiff){
                    minDiff=diff;
                    p=sum;
                }
            }
        }
        System.out.println("The End Result = " + p);
        
    }

}
// int p = target + sum;
// int q = target + sum1;

// System.out.println(" p = " + p + " q = " + q + " sum = " + sum + " sum1 = " +
// sum1);
// if (((p < 0 && q < 0) || (p > 0 && q > 0))&& (Math.abs(p) <= Math.abs(q))) {
// System.out.println("In Condition 1");
// sum1 = sum;
// }else if(((p<0 && q>0) ||(p>0 && q<0)) && (Math.abs(p) >= Math.abs(q))){
// sum1=sum;
// }else{
// sum1=sum;
// }