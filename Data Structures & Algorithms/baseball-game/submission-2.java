
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                int a = st.pop();
                int b = st.pop();

                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else if (operations[i].equals("C")) {
                st.pop();
            }
            else if (operations[i].equals("D")) {
                int d = st.peek();
                st.push(2 * d);
            }
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int res = 0;

        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;
    }
}
