class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int end = 0;
        int start = 0;

        int max = 0;
        HashSet<Character> map = new HashSet<>();
        while(end < s.length()){
            char ch = s.charAt(end);
            while(map.contains(ch)){
                map.remove(s.charAt(start));
                start++;
            }
            map.add(ch);
            max = Math.max(max,end-start+1);
            end++;

        }
        return max;
    }
}
