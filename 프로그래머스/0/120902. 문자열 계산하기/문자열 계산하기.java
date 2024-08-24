


class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        
        String[] parts = my_string.split(" ");
        
        answer = Integer.parseInt(parts[0]);
        
        
        
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int nextNumber = Integer.parseInt(parts[i + 1]);

            if (operator.equals("+")) {
                answer += nextNumber;
            } else if (operator.equals("-")) {
                answer -= nextNumber;
            }
        }

        return answer;
    }
}