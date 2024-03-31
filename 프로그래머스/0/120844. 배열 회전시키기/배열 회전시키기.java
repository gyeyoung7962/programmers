import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : numbers) {
            list.add(i);
        }
        
        if (direction.equals("right")) {

            list.add(0, numbers[numbers.length - 1]);
            list.remove(list.size() - 1);

        } else if (direction.equals("left")) {

            list.add(list.size(), numbers[0]);
            System.out.println(list);
            list.remove(0);
        }
        
        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i);
        }
        
        
        
        
        return answer;
    }
}