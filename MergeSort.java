public class MergeSort{
    public static void main(String[] args) {
        
    }

    public static void mergeShort(int arr[],int l,int r){
        if(l>r) return;
        mergeShort(arr, l, (l+r)/2);
        mergeShort(arr, (l+r)/2, r);
        merge(arr, l,r);
    }
    public static void merge(int arr[],int l,int r){
        
    }
}