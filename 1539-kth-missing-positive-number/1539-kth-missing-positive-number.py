class Solution(object):
    def findKthPositive(self, arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """

        low = 0
        high = len(arr)-1

        while (high-low)>=0:
            mid =(high+low)//2
            missing = arr[mid]-mid-1

            if missing<k:
                low = mid+1
            else:
                high = mid-1
        return high+1+k
                
        