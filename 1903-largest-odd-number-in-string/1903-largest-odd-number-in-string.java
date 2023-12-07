class Solution {
    public String largestOddNumber(String num) {
        String largestOdd = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            char currentChar = num.charAt(i);
            if (Character.getNumericValue(currentChar) % 2 != 0) {
                largestOdd = num.substring(0, i + 1);
                break;
            }
        }
        return largestOdd;
    }
}
