//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        int count = 0;
        int n = N;
     // Store the original number to use later

        while(N != 0){
            int ld = N % 10; // Get the last digit
             // Move to the next digit

            if(ld != 0 && n % ld == 0){ // Check for division by zero and evenly divisible
                count++;
            }
            N /= 10;
        }

        return count; // Return the count of evenly dividing digits
    }
}
