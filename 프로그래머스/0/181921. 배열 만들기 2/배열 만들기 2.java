
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        for (int i = (l % 5 == 0 ? l : (l / 5 + 1) * 5); i <= r; i += 5) {

            String str = Integer.toString(i);
            boolean isValid = true;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) != '0' && str.charAt(j) != '5') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                list.add(i);
            }


        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}