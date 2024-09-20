class Solution {
    public int solution(int a, int b) {
        
        
        int answer = 0;

        StringBuilder sb1 = new StringBuilder();

        sb1.append(a);
        sb1.append(b);

        StringBuilder sb2 = new StringBuilder();

        sb2.append(b);
        sb2.append(a);

        int val1 = Integer.parseInt(String.valueOf(sb1));
        int val2 = Integer.parseInt(String.valueOf(sb2));

        if (val1 > val2) {
            answer = val1;
        } else if (val2 > val1) {
            answer = val2;
        }
        else{
            answer = val1;
        }


        return answer;
    }
}