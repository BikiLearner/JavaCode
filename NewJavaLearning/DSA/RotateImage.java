package NewJavaLearning.DSA;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);
    }
//    https://youtu.be/fMSJSS7eO1w?si=VERWzbT_PBE0B0dy
    public static void rotate(int[][] matrix){

        int l=0,r=matrix.length-1;
        while (l<r){
            for(int i=0;i<(r-l);i++){
                int top=l,bottom=r;
                int topLeft = matrix[top][l+i];
                matrix[top][l+i]=matrix[bottom-i][l];
                matrix[bottom-i][l]=matrix[bottom][r-i];
                matrix[bottom][r-i]=matrix[top+i][r];
                matrix[top+i][r]=topLeft;

            }
            r-=1;
            l+=1;
        }

        for(int[] mat:matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
