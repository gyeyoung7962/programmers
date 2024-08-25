
import java.util.*;
class Solution {
    public long solution(String numbers) {
        
        
        HashMap<String, String> map = new HashMap<>();

        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        int i = 0;

        StringBuilder sb = new StringBuilder();


        while (i < numbers.length()) {

            for (String word : map.keySet()) {

                if (numbers.startsWith(word, i)) {
                    sb.append(map.get(word));
                    i += word.length();
                    break;
                }
            }


        }


        long answer = Long.parseLong(sb.toString());


        return answer;
    }
}