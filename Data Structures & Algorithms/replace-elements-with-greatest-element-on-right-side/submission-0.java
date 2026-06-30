class Solution {
    public int[] replaceElements(int[] arr) {
        // here basically we are replacing the every element with the greater element on its right 
        // or the element which is the second highest than that 
        // we have to check... 
       // we can do travesal from it right ?
       int n = arr.length;
       int maxRight = arr[n-1];
       arr[n-1] = -1;
       for(int i=n-2;i>=0;i--)
       {
         int current = arr[i];
         arr[i] = maxRight;
         maxRight = Math.max(maxRight,current);
       }

       return arr;
        
    }
}