class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);

            if (ch == '1') {
                mode = 1 - mode;
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    answer += ch;
                }
                else if (mode == 1 && idx % 2 != 0) {
                    answer += ch;
                }
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer;
    }
}