
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {

            int length = strArr[i].length();

            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        Optional<Integer> max = map.values().stream().max(Integer::compareTo);

        return max.get();
    }
}