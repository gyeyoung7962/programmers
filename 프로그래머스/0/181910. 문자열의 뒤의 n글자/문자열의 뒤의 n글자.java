class Solution {
    public String solution(String my_string, int n) {
        
        
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string).reverse();

        String val = String.valueOf(sb);

        for (int i = n - 1; i >= 0; i--) {

            answer += val.charAt(i);
        }


        return answer;
    }
}