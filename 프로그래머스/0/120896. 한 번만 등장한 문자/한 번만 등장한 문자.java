
import java.util.*;
class Solution {
    public String solution(String s) {
        
        
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> charList = new ArrayList<>();

        for(char c : map.keySet()){
            if(map.get(c) == 1){
                charList.add(c);
            }
        }

        Collections.sort(charList);


        for(char c : charList){
            answer += c;
        }


        return answer;

    }
}