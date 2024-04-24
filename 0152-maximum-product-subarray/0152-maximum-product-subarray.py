class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        result = nums[0]
        prod1 =nums[0]
        prod2 = nums[0]
        
        for i in range(1, len(nums)):
            temp = max(nums[i], nums[i]*prod1, nums[i]*prod2)
            prod2 = min(nums[i], nums[i]*prod1, nums[i]*prod2)
            prod1 = temp
            
            result = max(result, prod1)
        
        return result
        