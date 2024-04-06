class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        
        arr3=[]
        i = 0
        j = 0
        
        n1 = len(nums1)
        n2 = len(nums2)
        n = n1+n2
        
        while i<n1 and j<n2:
            if nums1[i]<nums2[j]:
                arr3.append(nums1[i])
                i+=1
            else:
                arr3.append(nums2[j])
                j+=1
        
        while i<n1:
            arr3.append(nums1[i])
            i+=1
        
        while j<n2:
            arr3.append(nums2[j])
            j+=1
            
        if n%2==1:
            return arr3[n//2]
        else:
            return (arr3[n//2]+arr3[(n//2)-1])/2