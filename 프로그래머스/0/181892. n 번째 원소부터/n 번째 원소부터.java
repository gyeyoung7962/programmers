class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = {};


        int count = 0;

        for (int i = n; i <= num_list.length; i++) {

            count++;
        }

        answer = new int[count];


        for (int i = 0; i < num_list.length; i++) { 

            if (i + n <= num_list.length) {

                answer[i] = num_list[i + n - 1];
            }
        }

        return answer;
    }
}