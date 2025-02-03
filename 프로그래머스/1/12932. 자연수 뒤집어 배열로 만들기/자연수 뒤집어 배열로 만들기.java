
import java.util.*;
class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);

        String[] arr = str.split("");

        int[] answer = new int[arr.length];


        int count = 0;

        for (int i = answer.length - 1; i >= 0; i--) {

            answer[count++] = Integer.parseInt(arr[i]);

        }
        return answer;
    }
}