class Solution {
    public String decodeString(String s) {

        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> stt = new Stack<>();

        int num = 0;
        StringBuilder curr = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                st.push(num);
                stt.push(curr);

                num = 0;
                curr = new StringBuilder();
            }
            else if (ch == ']') {
                int count = st.pop();
                StringBuilder prev = stt.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(curr);
                }

                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
