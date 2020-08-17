class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n < 2) return 0;
        
        int p1_min_left = prices[0], p2_max_right = prices[n-1];
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        // this is T(N) for time complexity N is the number of time complexity
        for(int i = 1; i < n; ++i){
//             go from the left with pmin
            profit1[i] = Math.max(profit1[i-1], prices[i] - p1_min_left);
            p1_min_left = Math.min(p1_min_left, prices[i]);
//             at the same time go from the right with pmax
            int j = n-1-i;
            profit2[j] = Math.max(profit2[j+1], p2_max_right - prices[j]);
            p2_max_right = Math.max(p2_max_right, prices[j]);
        }
        
//         sum from both side to
// CREATE profit vectors to store the results from left and right T(N) for space complexity
        int profit = 0;
        for(int i = 0; i < n; ++i)
            profit = Math.max(profit, profit1[i] + profit2[i]);
        return profit;
    }
}
