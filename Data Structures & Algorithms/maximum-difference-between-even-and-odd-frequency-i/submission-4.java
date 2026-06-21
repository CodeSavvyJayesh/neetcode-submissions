class Solution {
    public int maxDifference(String s) {

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : map.values()) {

            if (num % 2 == 1) {
                if (num > maxOdd) {
                    maxOdd = num;
                }
            }

            if (num % 2 == 0) {
                if (num < minEven) {
                    minEven = num;
                }
            }
        }

        return maxOdd - minEven;
    }
}