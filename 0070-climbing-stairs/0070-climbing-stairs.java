class Solution {
    public static int rep(int index, int[] dp){

        if(dp[index]!=-1){
            return dp[index];
        }
        dp[index - 1] = rep(index-1, dp);
        dp[index - 2] = rep(index-2, dp);
        return dp[index] = dp[index-1] + dp[index-2];
        
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        return rep(n, dp);
        
    }
}