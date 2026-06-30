class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     // here the answer is based on the nums2 
     // and the size of final array is based on the nums1 
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    HashMap<Integer,Integer> map = new HashMap<>();
     // we have to make sure that we are travesing the main array which is nums2 
     for(int i=nums2.length-1;i>=0;i--)
     {
         // here we have to write the condition 
         while(!stack.isEmpty() && stack.peek()<=nums2[i])
         {
             // in this case we have to pop it 
             stack.pop();
         }
         // if our stack is empty then there is not greater element on the right 
         // in this case we have to make sure taht we are making that place -1 
         if(stack.isEmpty())
         {
             map.put(nums2[i],-1);
         }

         // otherwise 
         // the top of stack is the first greater elmeent 
         else 
         {
             map.put(nums2[i],stack.peek());
         }

         // push the current element on to the stack 
         stack.push(nums2[i]);
     }

     int [] ans = new int[nums1.length];

     // we can get the answer directly from the hahsmap 
     for(int i=0;i<nums1.length;i++)
     {
         ans[i] = map.get(nums1[i]);
     }

     return ans;
        
    }
}