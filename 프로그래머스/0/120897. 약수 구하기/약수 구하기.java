class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int tmp = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                tmp++;
            }
        }

        answer = new int[tmp];

        answer[0] = 1;

        int index = 1;


        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                answer[index++] = i;
            }
        }
        return answer;
    }
}