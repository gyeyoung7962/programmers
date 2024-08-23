class Solution {
    public String[] solution(String bin1, int n) {
        String[] answer = {};

        String[] str = bin1.split("");


        double strLength = str.length;

        int cnt = (int) Math.ceil(strLength / n);

        answer = new String[cnt];


        for (int i = 0; i < cnt; i++) {

            answer[i] = "";

            int startIndex = i * n;
            int endIndex = (int) Math.min(startIndex + n, strLength);

            for (int j = startIndex; j < endIndex; j++) {

                answer[i] += str[j];
            }
        }

        return answer;
    }
}