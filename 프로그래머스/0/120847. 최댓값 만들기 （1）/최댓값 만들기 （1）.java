import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        
        Arrays.sort(numbers);

        int max = numbers[numbers.length - 1];
        int submax = numbers[numbers.length - 2];

        System.out.println(max);
        System.out.println(submax);

        answer = max * submax;
        
        return answer;
    }
}