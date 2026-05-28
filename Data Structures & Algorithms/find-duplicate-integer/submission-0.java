class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
             if(set.contains(num))
             return num;
             else
             set.add(num);
        }
        return -1;
    }
}
