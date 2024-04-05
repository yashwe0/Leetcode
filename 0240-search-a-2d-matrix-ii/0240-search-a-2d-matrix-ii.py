class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        def binary(m, target):
            low = 0
            high = len(m)-1
        
            while high-low>=0:
                mid = (low+high)//2
                if m[mid]==target:
                    return True
                elif m[mid]> target:
                    high = mid-1
                else:
                    low = mid+1
            return False
        
        for i in range(0, len(matrix)):
            flag = binary(matrix[i], target)
            if flag:
                return True
   
        return False
        