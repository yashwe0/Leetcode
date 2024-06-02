class Solution {
    public int maxSubArray(int[] nums) {
        int sum= 0;
        int maxi = nums[0];

        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
            maxi = Math.max(sum, maxi);
            if(sum<0){
                sum = 0;
            }
        }

        return maxi;
        
    }
}