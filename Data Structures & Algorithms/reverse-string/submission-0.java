class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char [] ans = new char[n];
        int j = 0;
        for(int i=n-1;i>=0;i--)
        {
            ans[j++] = s[i]; 
        }
        // you have to copy back to the s array
        for(int i=0;i<ans.length;i++)
        {
             s[i] = ans[i];
        }

    }
}