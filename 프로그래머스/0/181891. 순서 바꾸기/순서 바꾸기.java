
import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        
        int[] answer = new int[num_list.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {

            list.add(num_list[i]);
        }

        for (int j = 0; j < n; j++) {

            list.add(num_list[j]);
        }

        for (int i = 0; i < answer.length; i++) {

            answer[i] = list.get(i);
        }
        
        return answer;
    }
}