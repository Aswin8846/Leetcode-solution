class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 1;
        for(int num:nums){
            if(!set.contains(num-1)){
                int count = 1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
            if(longest>(nums.length)/2) break;
        }
        return longest;
    }
}