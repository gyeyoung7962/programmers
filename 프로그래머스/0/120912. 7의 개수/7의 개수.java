
import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        int answer = 0;

        String sr = "";

        for (int i = 0; i < array.length; i++) {

            sr += i == array.length - 1 ? String.valueOf(array[i]) : String.valueOf(array[i]) + ",";

        }

        String[] st = sr.split(",");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < st[i].length(); j++) {

                if (st[i].charAt(j) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}