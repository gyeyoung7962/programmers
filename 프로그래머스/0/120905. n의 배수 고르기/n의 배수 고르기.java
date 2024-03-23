class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int size = 0;
        int count = 0;


        for (int num : numlist) {

            if (num % n == 0) {

                size++;
            }
            answer = new int[size];
        }


        for (int num : numlist) {

            if (num % n == 0) {

                answer[count] = num;
                count++;
            }
        }
        
        return answer;
    }
}