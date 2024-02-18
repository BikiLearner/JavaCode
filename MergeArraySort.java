public class MergeArraySort {
    public static void main(String[] args) {
        int nums[] = { 7,8,9,11,12 };
        int len = nums.length;
        int left=0,right=len-1,i=0;
        int mid=(left+right)/2;
        int arr[]=new int[len];
        while(left<right){
            if(nums[left]<=nums[right]){
                arr[i]=nums[left];
                left++;
            }else if( nums[left]>=nums[right] ){
                arr[i]=nums[right];
                right++;
            }
            i++;
        }
    }
}
