class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int count = my_string.length() / m;

        System.out.println(count);

        for (int i = 0; i < count; i++) {

            int start = i * m;

            answer += my_string.charAt(start + c - 1);
        }
        return answer;
    }
}