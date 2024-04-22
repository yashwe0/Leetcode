class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        import math
        """
        :type nums: List[int]
        :type threshold: int
        :rtype: int
        """
        def DivbyD(nums, div):
            sum = 0
            for i in nums:
                sum+= math.ceil(i/div)
            return sum

        low = 1
        high = max(nums)
        ans = -1
        while (high-low)>=0:
            mid = (high+low)//2
            if DivbyD(nums, mid)<=threshold:
                high = mid-1
            else:
                low = mid+1

        return low 