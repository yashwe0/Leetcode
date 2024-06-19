class Solution {

    public static int subb(int[] nums, int ind, int[] dp){
        if(ind == 0){
            return nums[0];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }

        int pick = nums[ind] + subb(nums, ind-2, dp);
        int non_pick = 0 + subb(nums, ind-1, dp);
        return dp[ind] = Math.max(pick, non_pick);

    }
    public int rob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length+1];
        Arrays.fill(dp, -1);
        int result = subb(nums, length-1, dp);
        return result;
        
    }
}