public class StockProblem {
    public static void main(String[] args) {
        int k = 2;
        int prices[] = { 3, 2, 6, 5, 0, 3 };
        maxProfit(k, prices);
    }

    public static int maxProfit(int k, int[] prices) {
        int maxProfit = 0;
        int buy = -1, sell = -1, sum = 0;

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < prices.length - 1; j++) {
                for (int p = j + 1; p < prices.length; p++) {
                    sum = prices[p] - prices[j];
                    if (sum > maxProfit && j!=buy && p!=sell) {
                        maxProfit = sum;
                        buy = j;
                        sell = p;
                    }
                }
            }
            System.out.println(maxProfit + " " + prices[buy] + " " + prices[sell]);

        }

        return maxProfit;

    }
}
