class Solution {
    public int lengthOfLongestSubstring(String s) {
        // we have to return the longest sunstring which is not repeating any character again 
        // we have to use the hashset appraoch in order to solve this problme 
        HashSet<Character> set = new HashSet<>();
        // we have to use the sliding window aprpoach 
        // definately we need dynamic sliding window 
        // obvious approach would be for loop inside that while loop 
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++)
        {
             // we have to check whether the character is 
             char currentChar = s.charAt(right);
             while(set.contains(currentChar))
             {
                 set.remove(s.charAt(left));
                 left++;
             }
             set.add(currentChar);

             maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
