class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        temp = []
        n = len(nums)
        temp.append(nums[0])

        for i in range(1, n):
            if nums[i]>temp[-1]:
                temp.append(nums[i])
            else:
                ind = bisect.bisect_left(temp, nums[i], lo =0, hi = len(temp)-1)
                temp[ind]= nums[i]
        return len(temp)