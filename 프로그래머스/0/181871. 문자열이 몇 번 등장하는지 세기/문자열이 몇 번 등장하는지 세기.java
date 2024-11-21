class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int index = 0;

        System.out.println(myString.indexOf(pat));

        while ((index = myString.indexOf(pat, index)) != -1) {

            answer++;
            index++;
        }
        return answer;
    }
}