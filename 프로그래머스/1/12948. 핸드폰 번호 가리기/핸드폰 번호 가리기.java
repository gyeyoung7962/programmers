class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String tmp = phone_number.substring(0, phone_number.length() - 4);
        String etc = phone_number.substring(tmp.length(), phone_number.length());

        for (int i = 0; i < tmp.length(); i++) {
            answer += "*";
        }

        answer = answer + etc;
        return answer;
    }
}