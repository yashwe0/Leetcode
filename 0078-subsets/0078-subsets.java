
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subs = 1 << n; // Total number of subsets
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterate through each possible subset
        for (int i = 0; i < subs; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Check if the j-th element is in the i-th subset
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
    }
