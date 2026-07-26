
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

    //     List<String> permutations = new ArrayList<>();
    //     generate(s1.toCharArray(), 0, permutations);

    //     // Check if any generated permutation exists as a substring in s2
    //     for (String perm : permutations) {
    //         if (s2.contains(perm)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    // // Helper method to generate all permutations using backtracking
    // private void generate(char[] chars, int index, List<String> list) {
    //     if (index == chars.length) {
    //         list.add(new String(chars));
    //         return;
    //     }

    //     for (int i = index; i < chars.length; i++) {
    //         swap(chars, index, i);
    //         generate(chars, index + 1, list);
    //         swap(chars, index, i); // Backtrack
    //     }
    // }

    // private void swap(char[] chars, int i, int j) {
    //     char temp = chars[i];
    //     chars[i] = chars[j];
    //     chars[j] = temp;
    // }

    int[] s1count = new int[26];
    int[] s2count = new int[26];

    for(int i=0;i<s1.length();i++){
        s1count[s1.charAt(i) - 'a']++;
        s2count[s2.charAt(i) - 'a']++;
    }

    for(int i=0;i<s2.length()-s1.length();i++){
        if(Arrays.equals(s1count,s2count)){
            return true;
        }
        s2count[s2.charAt(i+s1.length()) -'a']++;
        s2count[s2.charAt(i)-'a']--;
    }
    return Arrays.equals(s1count,s2count);


    }
}