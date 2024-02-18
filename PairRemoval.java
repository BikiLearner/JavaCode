import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairRemoval {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(6);
        nums.add(9);
        System.out.println(minLengthAfterRemovals(nums));

    }
    public static int minLengthAfterRemovals(List<Integer> nums) {
        // Map<Integer,Integer> value=new HashMap<Integer,Integer>();
        // for(int num:nums){
        //     if(value.containsKey(num)){
        //         value.put(num, value.get(num)+1);
        //     }else{
        //         value.put(num, 1);
        //     }
        // }

        // return value.size();
     }
}
