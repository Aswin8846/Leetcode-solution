class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // If no unique character is found
    }
}
