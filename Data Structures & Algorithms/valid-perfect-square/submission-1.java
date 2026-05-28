class Solution {
    public boolean isPerfectSquare(int num) {
        // we can check using binary search to find the root 
        // if we dont get the element simlpy return false 
        long low = 0;
        long high = num;
        while(low<=high)
        {
             long mid = low + (high-low)/2;
             if(mid*mid==num)
             {
                return true;
             }
             else if(mid*mid<num)
             {
                 low = mid+1;
             }
             else
             {
                 high = mid-1;
             }
        }
        return false;
    }
}