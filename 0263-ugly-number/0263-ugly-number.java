class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers are positive integers
        }
        
        while (n % 2 == 0) {
            n /= 2; // Divide by 2 while n is divisible by 2
        }
        while (n % 3 == 0) {
            n /= 3; // Divide by 3 while n is divisible by 3
        }
        while (n % 5 == 0) {
            n /= 5; // Divide by 5 while n is divisible by 5
        }
        
        return n == 1; // If n becomes 1, it's an ugly number
    }
}
