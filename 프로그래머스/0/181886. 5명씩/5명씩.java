class Solution {
    public String[] solution(String[] names) {
        
        int size = (names.length+4)/5;

        String[] answer = new String[size];

        for(int i = 0; i < names.length; i += 5){


            answer[i/5] = names[i];
        }
        
        
        return answer;
    }
}