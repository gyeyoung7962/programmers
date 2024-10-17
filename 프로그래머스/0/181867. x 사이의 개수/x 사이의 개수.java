class Solution {
    public int[] solution(String myString) {
        
        String[] arr = myString.split("x", -1);


        int[] answer = new int[arr.length];


        for (int i = 0; i < answer.length; i++) {

            int count = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) != 'x') {

                    count++;

                    answer[i] = count;
                }
            }
        }
        
        
        return answer;
    }
}