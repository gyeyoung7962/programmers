class Solution {
    public int solution(String my_string) {
        
        
       int answer = 0;
    int temp = 0;

    for (int i = 0; i < my_string.length(); i++) {
        char c = my_string.charAt(i);

        if (Character.isDigit(c)) {
            
            temp = temp * 10 + Character.getNumericValue(c);
        } else {
            
            answer += temp;
            temp = 0;
        }
    }

    answer += temp;

    return answer;

    }
}