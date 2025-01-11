
import java.util.*;
class Solution {
    public int solution(String a, String b) {
        
        
        int answer = 0;
        
        String tmpAB = a;
        
        if (a.equals(b)) {
            return 0;
        }
        
        
        for (int i = 0; i < a.length(); i++) {
        
            String indexA = tmpAB.substring(tmpAB.length() - 1);
            String indexB = tmpAB.substring(0, tmpAB.length() - 1);
            tmpAB = indexA + indexB;

            answer++;

            if (tmpAB.equals(b)) {
                return answer;
            }
        }

        return -1;
    }
}