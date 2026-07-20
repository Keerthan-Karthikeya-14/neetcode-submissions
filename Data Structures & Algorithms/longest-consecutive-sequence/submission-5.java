class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
        return 0;
        Arrays.sort(nums);

        List<Integer> list = remove(nums);

        int count = 1;
        int max = 1;
        for(int i=1;i<list.size();i++){
            if((list.get(i)-list.get(i-1)) == 1){
                count++;
               max = Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        return max;
        
    }
    public static List<Integer> remove(int []nums){
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int ele : set){
            list.add(ele);
        }

        return list;

    }
}

