class Solution {
    public int singleNumber(int[] nums) {
        // basically use the xor opeation 
        int n = nums.length;
        int ans = 0;
        for(int num:nums)
        {
             ans = ans^num;
        }
        return ans;
    }
}
