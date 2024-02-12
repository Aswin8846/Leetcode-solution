class Solution {
    public int fib(int n) {
        return fibseries(n);
    }
    public int fibseries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int last = fib(n-1);
        int slast = fib(n-2);
        return last + slast;
    }
}