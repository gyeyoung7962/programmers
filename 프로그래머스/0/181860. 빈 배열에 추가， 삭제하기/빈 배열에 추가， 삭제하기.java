
import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {

            if (flag[i] == true) {

                int size = arr[i] * 2;

                for (int j = 0; j < size; j++) {

                    list.add(arr[i]);
                }
            } else {

                int size = arr[i];

                for (int j = 0; j < size; j++) {

                    list.remove(list.size() - 1);
                }

            }

        }
        
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = list.get(i);
        }
        
        return answer;
    }
}