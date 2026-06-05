class Solution {
    public void rotate(int[] nums, int k) {
        // basically we have to rotate the array 
        // [1,2,3,4,5,6,7,8], k = 4
       int n = nums.length;
        // we have to simply reverse the first array
       k = k%n;

       reverse(nums,0,n-1);

       // then we have to reverse till k element
       reverse(nums,0,k-1);

       reverse(nums,k,n-1);

    }
     private void reverse (int []nums,int left,int right)
     {
          while(left<right)
          {
             int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;

             left++;
             right--;
          }
     }
}