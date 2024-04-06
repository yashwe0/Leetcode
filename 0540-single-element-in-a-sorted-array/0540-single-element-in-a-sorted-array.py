class Solution(object):
    def singleNonDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        low = 0
        high = len(nums)-1

        while high>low:
            mid = (low+high)//2
            if mid%2==0:
                if nums[mid]!=nums[mid+1]:
                    high = mid
                else:
                    low = mid+1
            else:
                if nums[mid]!=nums[mid-1]:
                    high = mid
                else:
                    low = mid+1
        
        return nums[low]

            
        