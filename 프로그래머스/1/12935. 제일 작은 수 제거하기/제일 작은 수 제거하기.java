
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {

            return new int[]{-1};
        }

        int min = arr[0];

        for(int i = 1; i < arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }

        answer = new int[arr.length -1];

        int index = 0;

        for(int i = 0 ; i< arr.length;i++)
        {
            if(arr[i] != min){
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}