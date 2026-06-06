class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // here we have to maintain the hashset 
        // also we need 1D Dp approach in order to store true/false 
        int n = s.length();
        HashSet<String> set = new HashSet<>(wordDict);
        boolean [] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=1;i<=n;i++)
        {
             for(int j=0;j<=i;j++)
            {
                if(dp[j] && set.contains(s.substring(j,i)))
                {
                     dp[i] = true;
                     break;
                }
            }
        }
        return dp[n];
    }
}
