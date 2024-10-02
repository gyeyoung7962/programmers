import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        String str = "";

        String[] arr = my_string.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].trim().isEmpty()) {
                arr[i] = arr[i].trim();
            }


        }



        ArrayList<String> list = new ArrayList<>(List.of(arr));

        list.removeIf(e -> e.trim().isEmpty());

        answer = new String[list.size()];

    

        for(int i = 0; i < list.size();i++){

            answer[i] = list.get(i).trim();
        }
        return answer;
    }
}