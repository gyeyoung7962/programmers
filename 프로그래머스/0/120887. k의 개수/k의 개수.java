class Solution {
    public int solution(int i, int j, int k) {
        
        int result = 0;

        String value = String.valueOf(k);

        for (int num = i; num <= j; num++) {

            String numValue = String.valueOf(num);

            for (int l = 0; l < numValue.length(); l++) {

                if (String.valueOf(numValue.charAt(l)).equals(value)) {
                    result++;
                }
            }

        }
        return result;
    }
}