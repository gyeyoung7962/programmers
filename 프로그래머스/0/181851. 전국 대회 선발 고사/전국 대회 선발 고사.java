
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < rank.length; i++) {

            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());

        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        answer = 10000 * a + 100 * b + c;
        
        return answer;
    }
}