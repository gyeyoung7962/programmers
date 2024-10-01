class Solution {
    public int[] solution(int n) {
        
        int val = n;


        int[] answer = {};

        int count = 0;

        boolean flag = true;
        while (flag) {
            if (n % 2 == 0) {

                n = n / 2;
                count++;
            } else if (n % 2 != 0 && n > 1) {

                n = n * 3 + 1;
                count++;
            } else if (n == 1) {
                count++;
                flag = false;

            }

        }

        answer = new int[count];

        answer[0] = val;

        for (int i = 1; i < answer.length; i++) {


            if (val % 2 == 0) {

                val = val / 2;

                answer[i] = val;
            } else if (val % 2 != 0 && val > 1) {

                val = val * 3 + 1;
                answer[i] = val;
            }

        }
        return answer;
    }
}