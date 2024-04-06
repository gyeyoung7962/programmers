class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        
        char tmp;

        char[] char_string = my_string.toCharArray();


        char charNum1 = char_string[num1];
        char charNum2 = char_string[num2];

        tmp = char_string[num1];

        char_string[num1] = charNum2;

        char_string[num2] = tmp;

        answer = new String(char_string);

        
        return answer;
    }
}