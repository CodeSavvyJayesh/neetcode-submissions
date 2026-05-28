class Solution {
    public boolean isHappy(int n) {
        // happy number 
        // basically it uses the concept of set 
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
             set.add(n);
             int sum = 0;
             while(n>0)
             {
                 int digit = n%10;
                 sum+=digit*digit;
                 n/=10;
             }
             n=sum;
        }
        boolean ans = (n==1)?true:false;
        return ans;
    }
}
