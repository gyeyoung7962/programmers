
import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        
    
        int indexIdx = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            
            if (indexIdx < indices.length && i == indices[indexIdx]) {
                indexIdx++;
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}