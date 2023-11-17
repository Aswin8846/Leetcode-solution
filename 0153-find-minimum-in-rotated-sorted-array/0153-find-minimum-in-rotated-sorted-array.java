class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]<nums[mid+1]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return nums[start];
        
    }
}