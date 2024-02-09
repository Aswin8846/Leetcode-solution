class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count = 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                count = 1;
                while(set.contains(i+1)){
                    i++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}