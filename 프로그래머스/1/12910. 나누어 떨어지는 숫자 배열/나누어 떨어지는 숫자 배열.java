
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {

                count++;
            }
        }

        answer = new int[count];

        if(count == 0){
            
            return new int[]{-1};

        }

        int countTmp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                answer[countTmp++] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}