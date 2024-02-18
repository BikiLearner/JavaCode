import java.util.Arrays;
public class CountWeakRow {
    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k=3;
        int arr[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat.length;j++){
                sum+=mat[i][j];
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
