class Solution {
    public int mySqrt(int x) {
        // we are given a number we have to check the sqrt of that number 
        // no use of sqrt math fun
        int low = 1;
        int high = x;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
             long square = (long) mid*mid;
             if(square==x)
             {
                 return mid;
             }
             else if(square>x)
             {
                 high = mid-1;
             }
             else
             {
                 low = mid+1;
             }

        }
        return high;
    }
}