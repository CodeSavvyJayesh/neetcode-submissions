class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // this is the three sum problem 
        // it requires the sorting 
        int n = nums.length;
        Arrays.sort(nums);
        // we need main list 
        List<List<Integer>> mainList = new ArrayList<>();
        // for three sum time complexity is of n^2
        // but wait.... we have to use the concept of two pointer 
        // so ther outer loop will the from 0 to n-1 
        // and inner loop would be the while loop 
        // 
        for(int i=0;i<n;i++)
        {
          // we have to check for the duplicates 
          if(i>0 && nums[i]==nums[i-1]) continue; 
          int low = i+1;
          int high = n-1;
          while(low<high)
          {
             int sum = nums[i]+nums[low]+nums[high];
             if(sum==0)
             {
                 List<Integer> list = new ArrayList<>();
                 list.add(nums[i]);
                 list.add(nums[low]);
                 list.add(nums[high]);
                 mainList.add(list);
                 low++;
                 high--;


                 // again we have to check for the duplicates 
                 while(low<high && nums[low]==nums[low-1]) low++;
                 while(low<high && nums[high]==nums[high+1]) high--;
             }
             else if(sum<0)
             {
                 low++;
             }
             else
             {
                 high--;
             }
          }
        }
        return mainList;
    }
}
