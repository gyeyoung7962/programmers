class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 0;
        int numberSum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        for (int j = 0; j < numbers.length; j++) {

            numberSum += numbers[j];
        }

        answer = sum - numberSum;

        System.out.println(answer);
        return answer;
    }
}