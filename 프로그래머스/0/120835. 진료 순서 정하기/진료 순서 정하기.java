
import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];

        int[] sortedEmergency = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();


        for (int i = 0; i < sortedEmergency.length; i++) {

            for (int j = 0; j < sortedEmergency.length; j++) {

                
                if (emergency[i] == sortedEmergency[j]) {
                    answer[i] = j + 1;
                }

            }

        }

        


        return answer;
    }
}