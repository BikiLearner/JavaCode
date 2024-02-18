public class DynamicArray {
    int length, i = 0;
    int arr[] ;

    public DynamicArray(int len) {
        this.length = len;
        this.arr= new int[length];
    }
    public void insert(int val) {
        if(i<length){
            arr[i] = val;
            i++;
        }else{
            System.out.println("Out Of bound exception");
        }
    }

    public void removeAt(int index) {

        for (int j = 0; j <= i; j++) {
            if (j == index) {
                for (int p = j; j < i; j++) {
                    arr[p] = arr[p + 1];
                }
                i--;
            }
        }

    }
    public int indexOf(int val){
        for(int p=0;p<i;p++){
            if(arr[p]==val)
                return p;
        }
        return -1;
    }
    public void print() {
        for (int p = 0; p < i; p++) {
            System.out.println(arr[p]);
        }
    }
}
