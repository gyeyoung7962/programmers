
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        answer = new int[k];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }

        Set<Integer> set = new LinkedHashSet<>();


        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        int count = 0;
        
        for (int num : set) {

            if (count >= k) break;

            answer[count] = num;
            count++;
        }
        return answer;
    }
}