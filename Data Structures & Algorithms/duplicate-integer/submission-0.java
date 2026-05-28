class Solution {
    public boolean hasDuplicate(int[] nums) {
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
        // we have to traverse over map
        for(int num:map.values())
        {
             if(num>=2)
             {
                 return true;
             }
        }

        return false;
    }
}