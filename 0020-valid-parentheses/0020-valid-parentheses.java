class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char i: s.toCharArray()) {
            if(i=='(' || i=='[' || i=='{') {
                st.push(i);
            } else {
                if(st.empty() || (st.peek()=='(' && i!=')') || (st.peek()=='[' && i!=']') || (st.peek()=='{' && i!='}')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}