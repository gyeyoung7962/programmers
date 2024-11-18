class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        int sum = 0;

        for (int i = 0; i < intervals.length; i++) {

            sum += intervals[i][1] - intervals[i][0] + 1;
        }

        answer = new int[sum];

        int index = 0;
        for (int i = 0; i < intervals.length; i++) {

            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {

                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}