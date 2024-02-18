import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        int [][] newMat=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.println(i);
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][j] = 0;
                    }
                    for (int column = 0; column < matrix.length; column++) {
                        matrix[i][column] = 0;
                    }
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
    }
}
