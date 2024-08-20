class Solution {
    public int solution(String s) {
        
        
        int answer = 0;
        int lastValue = 0;

        String[] sArr = s.split(" ");

        for (int i = 0; i < sArr.length; i++) {

            String current = sArr[i];

            if (current.equals("Z")) {

                answer -= lastValue;
            } else {

                int val = Integer.parseInt(current);
                answer += val;
                lastValue = val;
            }

        }
        return answer;
    }
}