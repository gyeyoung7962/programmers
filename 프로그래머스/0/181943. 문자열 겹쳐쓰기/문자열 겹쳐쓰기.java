class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String answer = "";

        String[] my_arr = my_string.split("");
        String[] over_arr = overwrite_string.split("");

        for (int i = s; i <s + overwrite_string.length(); i++) {

            my_arr[i] = over_arr[i - s];


        }

        for (int i = 0; i < my_arr.length; i++) {

            answer += my_arr[i];
        }

        return answer;
    }
}