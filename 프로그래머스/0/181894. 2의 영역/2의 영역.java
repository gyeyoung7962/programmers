class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        
        
        if (start == -1) {
            return new int[]{-1};
        }

        
        int count = end - start + 1;
        answer = new int[count];

        
        int val = 0;
        for (int i = start; i <= end; i++) {
            answer[val++] = arr[i];
        }
        return answer;
    }
}
