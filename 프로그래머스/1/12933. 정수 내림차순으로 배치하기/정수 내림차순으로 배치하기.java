
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);

        String[] arr = str.split("");

        Arrays.sort(arr);

        int count = 0;

        long[] longTmp = new long[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            longTmp[count++] = Long.parseLong(arr[i]);
        }

        String strLong = "";
        for (int i = 0; i < longTmp.length; i++) {

            strLong += longTmp[i];
        }

        answer = Long.parseLong(strLong);
        return answer;
    }
}