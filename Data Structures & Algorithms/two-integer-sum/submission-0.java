class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];
        int i = 0;
        while(i<nums.length){
             int deff = target - nums[i];
            if((map.containsKey(deff))){
                 arr[0] = map.get(deff);
        arr[1] = i;
            }
            map.put(nums[i],i);
        i++;
        }
       return arr;
      
    }
}
