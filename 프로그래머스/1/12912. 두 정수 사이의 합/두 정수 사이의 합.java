class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(b > a){
        
            for(long i = a; i <= b;i++){
            
                answer += i;
            }
        }
        
        else if(a > b){
            
            for(long i = b; i <= a;i++){
                answer += i;
            }
        }
        else{
            return a;
        }
        
        
        
        
        
        return answer;
    }
}