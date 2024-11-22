class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        boolean flag;

        do {

            flag = false;

            for (int i = 0; i < arr.length; i++) {

                int prev = arr[i];

                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }


                if (arr[i] != prev) {
                    flag = true;
                }
            }
            answer++;

        } while (flag);
        return answer-1;
    }
}