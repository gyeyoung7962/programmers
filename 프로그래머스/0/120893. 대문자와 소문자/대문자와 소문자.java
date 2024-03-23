class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {

            char character = my_string.charAt(i);

            if (Character.isUpperCase(character)) {

                answer += Character.toLowerCase(character);
            } else {
                answer += Character.toUpperCase(character);
            }
        }
        
        return answer;
    }
}