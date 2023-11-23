class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Perfect numbers are greater than 1
        }

        int sum = 1; // Start with 1, as it is a divisor for every number

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
