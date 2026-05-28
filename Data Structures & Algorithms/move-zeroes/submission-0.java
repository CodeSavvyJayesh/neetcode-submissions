class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int j = 0;
        for(int i=0;i<n;i++)
        {
             if(nums[i]!=0)
             {
                 nums[j++] = nums[i];
             }
        }
        // now j = 2 traverse till 0 
        for(int i=j;i<n;i++)
        {
             nums[i] =0;
        }

     
    }
}