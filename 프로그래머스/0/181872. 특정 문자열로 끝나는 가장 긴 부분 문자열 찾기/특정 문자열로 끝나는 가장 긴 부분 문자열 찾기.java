class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int end = myString.lastIndexOf(pat);

        answer = myString.substring(0, end) + pat;
        return answer;
    }
}