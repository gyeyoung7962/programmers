class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        int count = 0;

        for (int num : box) {

            box[count] = num / n;
            
            answer *= box[count];

            count++;
        }
        
        return answer;
    }
}