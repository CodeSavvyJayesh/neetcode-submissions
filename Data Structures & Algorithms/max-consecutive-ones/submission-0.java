class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // to find the maxConsecutive one's
        int ones = 0;
        int maxOnes = 0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==1)
             {
                 ones = ones+1;
             }
             else
             {
                 maxOnes = Math.max(ones,maxOnes);
                 ones = 0;
             }
        }

        maxOnes = Math.max(ones,maxOnes);
        return maxOnes;
    }
}