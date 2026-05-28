class Solution {
    public boolean isAnagram(String s, String t) {
        // for this problem we can simply maintain 2 hashmap and then atlast we just have to check whether they are matching or not 
        int m = s.length();
        int n = t.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        // in map1 we will keep track of s string 
        for(int i=0;i<m;i++)
        {
             char ch = s.charAt(i);
             if(map1.containsKey(ch))
             {
                 map1.put(ch,map1.get(ch)+1);

             }
             else
             {
                map1.put(ch,1);
             }
        }
        for(int i=0;i<n;i++)
        {
             char ch = t.charAt(i);
             if(map2.containsKey(ch))
             {
                 map2.put(ch,map2.get(ch)+1);
             }
             else
             {
                 map2.put(ch,1);
             }
        }
        // now we have to 2 hashtables we just have to compare both the hashtables 
        return map1.equals(map2);
    }
}
