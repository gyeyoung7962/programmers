class Solution {
    public int[] solution(int start_num, int end_num) {

        
        int[] answer = {};

        int count = 0;

        for(int i = start_num; i >= end_num; i--){
            count++;
        }

        answer = new int[count];

        for(int i = 0 ; i < count; i++){

            if(start_num >= end_num){

                answer[i] = start_num;
            }
            start_num--;
        }
        
        return answer;
    }
}