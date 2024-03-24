import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        

        int max = 0;
        int count = 0;
        int size = 0;


        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {

                max = array[i];
                count = i;

            }
        }

        answer = new int[2];

        answer[0] = max;
        answer[1] = count;
        
        
        return answer;
    }
}