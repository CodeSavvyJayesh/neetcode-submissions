class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // we have to simply return the list of numbers which are appearing more than n/3 times 
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
        List<Integer> list = new ArrayList<>();
        for(int num:map.keySet())
        {
             if(map.get(num)>n/3)
             {
                list.add(num);
             }
        }

        return list;
     
    }
}