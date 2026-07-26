class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();

        int res = 0;

        int right = 0,maxfrq = 0;

        for(int end = 0;end < s.length();end++){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);
            maxfrq = Math.max(maxfrq,map.get(s.charAt(end)));

            while((end - right + 1) - maxfrq > k){
                map.put(s.charAt(right),map.get(s.charAt(right)) - 1);
                right++;
            }
            res = Math.max(res,end - right + 1);
        }
        return res;
    }

// String str = propstring(s,k);
// // Map<Character,Integer> map = new HashMap<>();

// int count = 1;
// int max = 1;
// for(int i=1;i<str.length();i++){
//     if(str.charAt(i)==str.charAt(i-1)){
//         count++;
//         max = Math.max(count,max);
//     }
//     else{
//         count = 1;
//     }

// }
// return max;

//     }


// public static String propstring(String str , int k){
// char replacechar = mostfreqelement(str);
// int count = 0;

// if(k == 0){
//     return new String(str);
// }
// char[] arr = str.toCharArray();
//         for(int i=0;i<str.length();i++){
//             // if(str.charAt(i)!=replacechar){
//             //     str.charAt(i) = replacechar;
//             //     count++;
//             //     if(count == k){
//             //         break;
//             //     }
//             // }
//             if(arr[i] != replacechar){
//                 arr[i]=replacechar;
//                 count++;

//                 if(count == k){
//                     break;
//                 }
//             }

//         }
//         return new String(arr);
//     }
//     public static char mostfreqelement(String str){
//         Map<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<str.length();i++){
//             map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0) + 1);
//         }
// int max = 0;
// char ch = ' ';
//         for(Map.Entry<Character,Integer> res : map.entrySet()){
//             if(res.getValue() > max){
//     max = res.getValue();
//     ch = res.getKey();
// }
//         }
        
//         return ch;
//     }
}
