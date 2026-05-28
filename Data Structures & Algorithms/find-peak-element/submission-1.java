class Solution {
    public int findPeakElement(int[] nums) {
        // basically peak is element graeter than its neighbour 
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high)
        {
             int mid = low+(high-low)/2;
             if(nums[mid]<nums[mid+1])
             {
                 low = mid+1;
             }
             else
             {
                 high = mid;
             }
        }
        return low;
    }
}