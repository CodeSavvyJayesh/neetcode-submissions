class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // in this problem we have to think about duplicated as well 
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // we need to use n^3 time complexity in order to solve the problem 
        for(int i=0;i<n-3;i++)
        {
          // we have to check for duplicates 
          if(i>0 && nums[i]==nums[i-1]) continue;
          for(int j=i+1;j<n-2;j++)
          {
             if(j>i+1 && nums[j]==nums[j-1]) continue;

             int low = j+1;
             int high = n-1;
             while(low<high)
             {
                 long sum = (long)nums[i]+nums[j]+nums[low]+nums[high];
                 if(sum==target)
                 {
                     List<Integer> list = new ArrayList<>();
                     list.add(nums[i]);
                     list.add(nums[j]);
                     list.add(nums[low]);
                     list.add(nums[high]);

                     result.add(list);

                     low++;
                     high--;

                     while(low<high && nums[low]==nums[low-1]) low++;
                     while(low<high && nums[high]==nums[high+1]) high--;

                    
                 }
                 else if(sum<target)
                 {
                     low++;
                 }
                 else
                 {
                     high--;
                 }
             }
          }
        }
        return result;
    }
}