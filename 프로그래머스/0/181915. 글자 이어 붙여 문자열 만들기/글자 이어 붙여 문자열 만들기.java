class Solution {
    public String solution(String my_string, int[] index_list) {
        
        
        String answer = "";

        String[] my_arr = my_string.split("");


        for (int i = 0; i < index_list.length; i++) {


            int val = index_list[i];

            answer += my_arr[val];
        }


        return answer;
    }
}