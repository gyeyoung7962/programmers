class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);

        String[] st = str.split("");

        for (int i = 0; i < st.length; i++) {

            int current = Integer.parseInt(st[i]);
            int next = 0;

            if (i < st.length - 1) {
                next = Integer.parseInt(st[i + 1]);
            }

            if (current == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}