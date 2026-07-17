class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> res = new HashMap<>();
        for(String S : strs){
            char[] chararray = S.toCharArray();
            Arrays.sort(chararray);

            String str = new String(chararray);
            res.putIfAbsent(str,new ArrayList<>());
            res.get(str).add(S);
        }
        return new ArrayList<>(res.values());
        
    }
}
