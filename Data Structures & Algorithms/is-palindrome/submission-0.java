class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        String str = s.toLowerCase();
        while(left < right){
            while(left < right && !alphanumeric(str.charAt(left))){
                left++;
            }
            while(left < right && !alphanumeric(str.charAt(right))){
                right--;
            }
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean alphanumeric(char c){
        return (c >='A' && c<='Z' || c>='a' && c<='z' || c>= '0' && c<='9');
    }
}
