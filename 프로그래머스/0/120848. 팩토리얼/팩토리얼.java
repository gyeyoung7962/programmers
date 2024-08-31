class Solution {
    public int solution(int n) {
        
        int answer = 1;
        int i = 1;

        while (true) {

            if (answer > n) {
                return i - 1;
            }
            i++;
            answer *= i;
        }
    }
}