class Solution {
    static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0,longest = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        for(int num: nums) {
            if(!set.contains(num - 1)) {
                count = 1;
                while(set.contains(num+1)) {
                    num++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
