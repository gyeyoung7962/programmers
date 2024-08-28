
import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0;

        for (int val : array) {
            int count = map.getOrDefault(val, 0);
            map.put(val, count + 1);
        }

        System.out.println(map);

        Optional<Map.Entry<Integer, Integer>> max = map.entrySet().stream().max(Map.Entry.comparingByValue());

        if (!max.isPresent()) {
            answer = -1;
        }

        int maxVal = max.get().getValue();

        long maxCount = map.values().stream().filter(e -> e == maxVal).count();

        answer = maxCount > 1 ? -1 : max.get().getKey();


        return answer;
    }
}