class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int x = queries[i][0];
            int y = queries[i][1];
            int z = queries[i][2];

            int minVal = Integer.MAX_VALUE;

            boolean tmp = false;

            for (int j = x; j <= y; j++) {

                if (arr[j] > z) {

                    minVal = Math.min(minVal, arr[j]);
                    tmp = true;
                }
            }

            answer[i] = tmp ? minVal : -1;
        }
        return answer;
    }
}