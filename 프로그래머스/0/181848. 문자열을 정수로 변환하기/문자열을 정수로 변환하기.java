class Solution {
    public int solution(String n_str) {
        int answer = 0;
        
        String val = "";

        for (int i = 0; i < n_str.length(); i++) {

            val += String.valueOf(n_str.charAt(i));

        }

        answer = Integer.parseInt(val);
        return answer;
    }
}