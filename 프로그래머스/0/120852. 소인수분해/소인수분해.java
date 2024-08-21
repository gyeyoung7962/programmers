
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        
        int[] answer = {};


        boolean flag = true;

        List<Integer> list = new ArrayList<>();


        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                list.add(i);

                while (flag) {
                    if (n % i == 0) {

                        list.add(i);

                        n = n / i;
                        i++;
                    } else if (n % i != 0) {
                        break;
                    }
                }
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < answer.length;i++){

                answer[i] = list.get(i);
        }

        int[] arr = Arrays.stream(answer).distinct().toArray();



        return arr;
    }
}