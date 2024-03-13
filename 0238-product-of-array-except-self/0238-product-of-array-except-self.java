class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        // Initialize the answer array with all 1s
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }
        
        int leftProduct = 1;
        // Calculate products of elements to the left of current element
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        int rightProduct = 1;
        // Calculate products of elements to the right of current element and multiply with answer
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return answer;
    }
}
