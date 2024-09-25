class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String val = String.valueOf(a) + String.valueOf(b);
        int val1 = Integer.parseInt(val);

        int val2 = 2 * a * b;

        if (val1 > val2) {
            answer = val1;
        }
        if (val2 > val1) {
            answer = val2;
        }
        
        return answer;
    }
}