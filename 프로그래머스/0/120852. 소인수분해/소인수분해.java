
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        
        int[] answer = {};

        List<Integer> list = new ArrayList<>();


        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                list.add(i);

                while (n % i == 0) {
                        n = n / i;
                    }
                }
            }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(answer));


        return answer;
        
    }
}