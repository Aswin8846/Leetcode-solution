class Solution {
    public int maxRepeating(String sequence, String word) {
        String ans = word;
        int count = 0;
        while(sequence.contains(ans)){
            ans+=word;
            count++;
        }
        return count;
        
        
    }
}