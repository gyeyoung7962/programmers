class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] tmp = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < my_string.length(); i++) {

            char ch = my_string.charAt(i);

            boolean vowel = false;

            for (int j = 0; j < tmp.length; j++) {
                if (Character.toString(ch).equals(tmp[j])) {
                    vowel = true;
                    break;
                }
            }
            if (!vowel) {
                answer += ch;
            }

        }
        
        return answer;
    }
}