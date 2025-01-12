class Solution {
    public int solution(int a, int b) {
    
        int answer = 0;
        
        int tmpA = a;
        int tmpB = b;

        while (b != 0) {

            int temp = b;

            b = a % b;

            a = temp;
        }

        int gcdA = tmpA / a;
        int gcdB = tmpB / a;

        while (gcdB % 2 == 0) {

            gcdB /= 2;
        }

        while (gcdB % 5 == 0) {
            gcdB /= 5;
        }

        if (gcdB == 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}