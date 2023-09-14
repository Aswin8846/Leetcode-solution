class Solution {
    public int differenceOfSum(int[] nums) {
        int elemsum = 0;
        int digitsum = 0;
        for(int i : nums){
            elemsum+=i;
            while(i>0){
                digitsum+=i%10;
                i=i/10;
            }
            
            
        }
        return Math.abs(elemsum - digitsum);
        
        
        
    }
}