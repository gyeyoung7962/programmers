
import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        int count = 0;

        for (int i = 0; i < my_string.length(); i++) {

            count++;
        }

        answer = new String[count];

        for (int i = 0; i < my_string.length(); i++) {

            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}