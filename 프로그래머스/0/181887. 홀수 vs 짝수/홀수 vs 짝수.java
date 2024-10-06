class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < num_list.length; i++) {

            if (i % 2 == 0) {
                num2 += num_list[i];
            }
            if (i % 2 != 0) {
                num1 += num_list[i];
            }
        }

        if (num1 > num2 || num1 == num2) {
            answer = num1;
        }
        if (num2 > num1) {
            answer = num2;
        }
        return answer;
    }
}