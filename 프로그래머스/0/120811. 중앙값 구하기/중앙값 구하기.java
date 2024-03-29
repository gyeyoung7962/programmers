import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        
        Arrays.sort(array);

        int size = array.length;

        if (size % 2 == 1) {

            answer = array[size / 2];
        } else {

            int middleRight = size / 2;
            int middleLeft = middleRight - 1;

            answer = (array[middleLeft] + array[middleRight]) / 2;
        }
        
        
        return answer;
    }
}