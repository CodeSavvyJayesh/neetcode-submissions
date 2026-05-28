class Solution {
    public int[] findErrorNums(int[] nums) {
        // acdtually we have to return the array with missing no. and duplicate no.
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
             int num = nums[i];
             if(map.containsKey(num))
             {
                 map.put(num,map.get(num)+1);
             }
             else
             {
                 map.put(num,1);
             }
        }
        // we have to find the duplicate 
        int duplicated = -1;
        for(int num:map.keySet())
        {
             if(map.get(num)>1)
             {
                 duplicated = num;
             }
        }
        // basically hashMap will tell you which the duplicate element 
        // now what about the missing element 
        int expectedSum = (n*(n+1))/2;
        int currentSum = 0;
        for(int i=0;i<n;i++)
        {
             currentSum += nums[i];
        }
        int missingNum = expectedSum - currentSum + duplicated;

        return new int[]{duplicated,missingNum};
        

    }
}