class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = String.valueOf(order);

        System.out.println("str = " + str);
        System.out.println(order);

        String[] st = str.split("");
        
        for(int i = 0 ; i < st.length; i++){
            System.out.println("st[i] = " + st[i]);

            int stParse = Integer.parseInt(st[i]);

            if(stParse == 3 || stParse == 6 || stParse == 9){

                answer++;
            }
        }

        return answer;
    }
}