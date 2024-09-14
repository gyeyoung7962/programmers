class Solution {
    public int[] solution(int n, int k) {
        
        
        int[] answer = {};

        int count = 0;

        for (int i = k; i <= n; i = i + k) {

            count++;
        }

        answer = new int[count];


        for (int i = 0; i < count; i++) {


            if (k * (i + 1) <= n) {
                answer[i] = k * (i + 1);
            }


        }

        

        return answer;
    }
}