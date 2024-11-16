class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < queries.length; i++) {

            sb2.append(sb.substring(queries[i][0], queries[i][1] + 1));
            sb2.reverse();

            sb.replace(queries[i][0], queries[i][1] + 1, sb2.toString());

            sb2.setLength(0);

        }

        answer = sb.toString();
        return answer;
    }
}