class Solution {
    public int solution(int slice, int n) {
        
        int answer = 0;

        int pizza = n / slice;

        int count = n % slice == 0 ? 0 : 1;


        return pizza + count;
    }
}