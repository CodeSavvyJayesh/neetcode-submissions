class Solution {
    public int singleNonDuplicate(int[] nums) {
        // we can simply use the hashmap
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
        // we have to traverse over the values() 
        for(int num:map.keySet())
        {
             if(map.get(num)==1)
             {
                return num;
             }
        }

        return -1;
    }
}