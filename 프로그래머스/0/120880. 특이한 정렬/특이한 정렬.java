
import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {

            list.add(numlist[i]);
        }

        Collections.sort(list, (a, b) -> {

            int disA = Math.abs(a - n);
            int disB = Math.abs(b - n);

            if (disA != disB) {
                return disA - disB;
            }

            return b - a;
        });
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}