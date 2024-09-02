class Solution {
    public String[] solution(String[] quiz) {
        
        
        String[] answer = {};

        answer = new String[quiz.length];

        int i = 0;

        for (String arr : quiz) {

            System.out.println("arr = " + arr);

            String[] splitString = arr.split(" ");

            int split1 = Integer.parseInt(splitString[0]);
            String operator = splitString[1];
            int split2 = Integer.parseInt(splitString[2]);

            int split4 = Integer.parseInt(splitString[4]);

            if (operator.equals("-")) {

                if (split1 - split2 == split4) {

                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            if (operator.equals("+")) {
                if (split1 + split2 == split4) {

                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            i++;

        }

        return answer;
    }
}