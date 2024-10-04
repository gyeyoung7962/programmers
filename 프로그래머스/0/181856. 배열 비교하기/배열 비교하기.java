class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int val1 = 0;
        int val2 = 0;

        int answer = 0;
        
        if(arr1.length > arr2.length){

            answer = 1;
        }
        else if(arr2.length > arr1.length){
            answer = -1;
        }

        else{

            for (int i = 0; i < arr1.length; i++) {

                val1 += arr1[i];
            }

            for (int i = 0; i < arr2.length; i++) {

                val2 += arr2[i];
            }

            if(val1 > val2){
                answer = 1;
            }

            else if(val2 > val1) {
                answer = -1;
            }

            else {
                answer = 0;
            }


        }


        return answer;
    }
}