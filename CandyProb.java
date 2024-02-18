import java.util.Arrays;

public class CandyProb {
    public static void main(String[] args) {
        int ratings[] = {1,2,87,87,87,2,1};
        int n = ratings.length;
        int sum = 0;
        int rightarray[] = new int[n];
        Arrays.fill(rightarray, 1);
        int leftarray[] = new int[n];
        Arrays.fill(leftarray, 1);
        for (int i = 1; i < n ; i++) {
            if (ratings[i] > ratings[i - 1]) {
                rightarray[i] = rightarray[i-1] + 1;
            }
        }
        System.out.println(Arrays.toString(rightarray));
        for (int i = n-2; i >-1; i--) {
            if (ratings[i] > ratings[i + 1]) {
                rightarray[i] = Math.max(rightarray[i], (rightarray[i+1]+1));
            }
        }
        System.out.println(Arrays.toString(rightarray));
        for(int i=0;i<n;i++){
            sum+=rightarray[i];
        }
        System.out.println(sum);
    }
}
