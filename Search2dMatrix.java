public class Search2dMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        boolean istrue = false;
        int target = 3;
        int r = 0;
        int  c = matrix[0].length-1;
        while (r < matrix.length && c >= 0) {
            int cur = matrix[r][c];
            if (cur == target) {
                istrue = true;
                break;
            } else if (cur < target) {
                r++;
            } else {
                c--;
            }
        }
        System.out.println(istrue);
    }
}
