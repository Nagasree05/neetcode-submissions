
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int curr = asteroids[i];
            boolean alive = true;

            while (alive && curr < 0 && !st.isEmpty() && st.peek() > 0) {

                if (st.peek() < Math.abs(curr)) {
                    st.pop();
                }
                else if (st.peek() == Math.abs(curr)) {
                    st.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(curr);
            }
        }

        int[] result = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}
