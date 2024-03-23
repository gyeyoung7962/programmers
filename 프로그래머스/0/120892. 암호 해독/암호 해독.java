class Solution {
    public String solution(String cipher, int code) {
        
        
        
        String answer = "";
        
        
        for (int i = 0; i < cipher.length(); i++) {

            if (i % code == 0 && i + code - 1 < cipher.length()) {

                answer += cipher.charAt(i + code - 1);

            }
        }
     
        return answer;
    }
}