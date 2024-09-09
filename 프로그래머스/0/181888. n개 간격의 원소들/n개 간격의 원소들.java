
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        int count = 0;


        for (int i = 0; i < num_list.length; i = i + n) {

            count++;
        }

        answer = new int[count];


        for (int i = 0; i < count; i++) {

            answer[i] = num_list[i * n];
        }
        
        return answer;
    }
}