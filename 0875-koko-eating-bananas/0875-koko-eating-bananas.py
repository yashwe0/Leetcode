class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int


        """
        def func(mid):
            time = 0
            for i in range(0, len(piles)):
                if piles[i]%mid == 0:
                    time+= piles[i]//mid
                else:
                    time += piles[i]//mid + 1
            
            if time <=h:
                return True
            else:
                return False

        low = 1
        high = max(piles)
        while(high-low)>1:
            mid = (high+low)//2
            if func(mid):
                high= mid
            else:
                low = mid+1
        
        if func(low):
            return low
        else:
            return high
