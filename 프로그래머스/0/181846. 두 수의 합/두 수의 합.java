
import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);

        BigInteger sum = big1.add(big2);

        answer = String.valueOf(sum);
        return answer;
    }
}