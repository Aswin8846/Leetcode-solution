class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int num1;
        int num2;
        while(i<j){
            num1 = numbers[i];
            num2 = numbers[j];
            if(num1+num2==target){
                break;
            }
            if((num1+num2)>target){
                j--;
                continue;
            }else{
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
}