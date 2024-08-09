class Solution {
    public int solution(int n) {
        int answer = 0;

        int val = 1;

        boolean flag = true;


        if (n % 6 == 0) {
            answer = n / 6;
        }
        if (n % 6 != 0) {

            while (flag) {

                if ((6 * val)% n == 0) {
                    answer = val;
                    flag = false;
                }
                val++;
            }
        }

        return answer;

    }
}