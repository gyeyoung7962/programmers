class Solution {
    public int solution(int chicken) {
        
         int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int newChickens = coupons / 10;  
            answer += newChickens;   
            coupons = coupons % 10 + newChickens;
        }
        
        return answer;
    }
}