class Solution {
    public int[] sortArray(int[] nums) {
        // we can simply use the merge sort in this problem 
        // we are supposed to sort the array
        int n=nums.length;
        Arrays.sort(nums);
        int [] ans = new int[n];
        for(int i=0;i<n;i++)
        {
             ans[i] = nums[i];
        }
        return ans;
    }
}