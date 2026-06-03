class Solution {
    public int climbStairs(int n) {
        // basically we need dp of size n+1
        int [] dp = new int[n+1];
        if(n==1) return 1;
        if(n==2) return 2;
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
             dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
