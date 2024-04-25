class Solution(object):
    def maximalSquare(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        n = len(matrix)
        m = len(matrix[0])
        dp = [[0 for i in range(m)]for j in range(n)]
        ans = 0
        for i in range(0, n):
            for j in range(0,m):
                if i ==0 or j==0:
                    if matrix[i][j]=="1":
                        dp[i][j] =1
            
                else:
                    if matrix[i][j] == "1":
                        dp[i][j] = 1+ min(dp[i-1][j], min(dp[i-1][j-1], dp[i][j-1]))

                ans = max(ans, dp[i][j])
                        
        return ans**2