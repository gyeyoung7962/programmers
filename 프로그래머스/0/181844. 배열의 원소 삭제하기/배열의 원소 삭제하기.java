
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);
        }


        for (int num : delete_list) {
            list.remove(Integer.valueOf(num));
        }
        
        answer = new int[list.size()];

        for(int i = 0; i < list.size();i++){

            answer[i] = list.get(i);
        }
        
        return answer;
    }
}