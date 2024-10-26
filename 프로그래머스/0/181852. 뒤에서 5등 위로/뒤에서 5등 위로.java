
import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int n = 5;

        answer = new int[num_list.length - n];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {

            answer[i] = num_list[n++];
        }
        return answer;
    }
}