import java.util.Arrays;

public class NotEqualAvg {
    public static void main(String[] args) {
       int nums[] = {6,2,0,9,7};
       System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int l=0,i=1,r=i+1,sc=1;
        while(l<i && r>i && i<len && r<len){
            l=i-1;
            r=i+1;
            if (nums[i] == (float)(nums[l] + nums[r]) / 2.0f){
                int swap=nums[r];
                int p=r;
                while(p <len-1){
                    nums[p]=nums[p+1];
                    p++;
                }
                nums[p]=swap;
            }else{
                i++;
                sc=0;
            }
            // System.out.println(Arrays.toString(nums));
        }
        return nums;            
    }
}
