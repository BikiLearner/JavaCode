import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedList {
    public static void main(Strings[]args){
        // ListNode[] lists = new ListNode[listsData.length];
    //    ArrayList<List<Integer>> lists = new ArrayList<>();
        // lists.add(Arrays.asList(2, 6));
        shortTwo(lists.add(Arrays.asList(1, 4, 5)),lists.add(Arrays.asList(1, 3, 4))); 
        // // Create linked lists from the input data
        // for (int i = 0; i < listsData.length; i++) {
        //     lists[i] = createList(listsData[i]);
        // }
        // ListNode mergedList = mergeKLists(lists);
    }
    // public ListNode mergeKLists(ArrayList<List<Integer>> lists) {
        
    // }
    public static void shortTwo(List<Integer> a1,List<Integer> a3){
        int i=0,j=0,p=0;
        int[] arr=new int[a1.size()+a3.size()];
        while (i<a1.size() && j< a3.size()) {
            if(a1.get(i)<a3.get(j)){
                arr[p++]=a1.get(i);
            }else if(a1.get(i)>a3.get(j)){
                arr[p++]=a3.get(i);
            }else{
                arr[p++]=a3.get(i);
            }
        }
        while (i<a1.size()) {
            arr[p++]=a1.get(i);
        }
         while (j<a3.size()) {
            arr[p++]=a3.get(i);
        }

        System.err.println(arr);
    }
}
// public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }