class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        

        int val = 1;

        while (val < arr.length) {

            val *= 2;
        }

        answer = new int[val];


        for (int i = 0; i < arr.length; i++) {

            answer[i] = arr[i];

        }
        return answer;
    }
}