
import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String[] arr = myStr.split("a|b|c");

        List list = new ArrayList();

        for (String str : arr) {

            if (!str.equals("")) {

                list.add(str);
            }

        }

        answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = (String) list.get(i);
        }

        if (answer.length == 0) {
            answer = new String[1];

            answer[0] = "EMPTY";
        }
        return answer;
    }
}