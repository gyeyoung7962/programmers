class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String lower = my_string.toLowerCase();
        
        String[] characters = lower.split("");
        java.util.Arrays.sort(characters);
        
        for(String character : characters){
            answer += character;
        }
        
        
        
        
        
        
        
        
        return answer;
    }
}