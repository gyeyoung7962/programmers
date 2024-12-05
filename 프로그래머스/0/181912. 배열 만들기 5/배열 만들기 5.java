class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};

        int count = 0;

        for (int i = 0; i < intStrs.length; i++) {

            int val = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (val > k) {
                count++;
            }
        }

        answer = new int[count];

        int index = 0;

        for (int i = 0; i < intStrs.length; i++) {

            int val = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (val > k) {
                answer[index++] = val;
            }
        }
        return answer;
    }
}