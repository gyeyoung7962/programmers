class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int service = 2000;


        int meat = 12000 * n;
        int drink = 2000 * k;

        int tmp = n / 10;
        int count = tmp * service;

        answer = meat + drink - count;
        
        
        return answer;
    }
}