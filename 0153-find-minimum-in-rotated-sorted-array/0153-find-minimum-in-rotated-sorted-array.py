class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        low = 0
        high = len(nums)-1
        while high-low>0:
            mid = (high+low)//2
            if nums[mid]>nums[high]:
                low = mid+1
            else:
                high = mid

        return min(nums[low], nums[high])