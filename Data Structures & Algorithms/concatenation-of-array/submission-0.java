class Solution {
    public int[] getConcatenation(int[] nums) {
        // in this problem we have to simply concatenate the array 
        int n = nums.length;
        int [] newArray = new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
             newArray[i] = nums[i];
        }
        int j =0;
        for(int i=nums.length;i<newArray.length;i++)
        {
             newArray[i] = nums[j++];
        }
        return newArray;
    }
}