import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
       int count = 0;
        int val = 0;
        int num = 0;

        for (int i = 0; i < my_string.length(); i++) {

            if (Character.isDigit(my_string.charAt(i))) {

                count++;
            }
        }

        answer = new int[count];

        for (int i = 0; i < my_string.length(); i++) {

            if (Character.isDigit(my_string.charAt(i))) {


                char ch = my_string.charAt(i);
                val = Character.getNumericValue(ch);

                answer[num++] = val;
            }

        }

        Arrays.sort(answer);
        return answer;
    }
}