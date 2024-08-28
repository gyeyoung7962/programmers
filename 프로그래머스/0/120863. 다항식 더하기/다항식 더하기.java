
import java.util.*;
class Solution {
    public String solution(String polynomial) {
        
        
        String answer = "";

        String arr = polynomial.replace(" + ", " ");

        int charVal = 0;
        int normalVal = 0;
        int sumVal = 0;

        String[] str = arr.split(" ");

        System.out.println("str = " + Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {

            
            if (str[i].equals("x")) {
                sumVal += 1;
            }
            
            else if (str[i].contains("x")) {
                int coefficient = Integer.parseInt(str[i].replace("x", ""));
                sumVal += coefficient;
            }
            
            else if (Character.isDigit(str[i].charAt(0))) {
                normalVal += Integer.parseInt(str[i]);
            }
        }

        
        if (sumVal != 0) {
            answer += sumVal == 1 ? "x" : sumVal + "x";
        }
        if (normalVal != 0) {
            if (!answer.isEmpty()) answer += " + ";
            answer += normalVal;
        }

        return answer.isEmpty() ? "0" : answer;
    }
}