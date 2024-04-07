import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = Integer.toString(age);

        String[] val = str.split("");

        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            map.put(i, (char) (i + 1 + 96));
        }

        for (int i = 0; i < val.length; i++) {

            int num = Integer.parseInt(val[i]);
            answer += map.get(num);
        }
        
       return answer;
    }
}