class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastindex = s.lastIndexOf(' ') + 1;
        return s.length()-lastindex;
        
    }
}