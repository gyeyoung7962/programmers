class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
    
        boolean tmp1 = false;
        boolean tmp2 = false;

        if (x1 == true && x2 == true) {
            tmp1 = true;
        } else if (x1 == true && x2 == false || x1 == false && x2 == true) {
            tmp1 = true;
        } else if (x1 == false || x2 == false) {
            tmp1 = false;
        }

        if (x3 == true && x4 == true) {
            tmp2 = true;
        } else if (x3 == true && x4 == false || x3 == false && x4 == true) {
            tmp2 = true;
        } else if (x3 == false || x4 == false) {
            tmp2 = false;
        }

        if (tmp1 == false || tmp2 == false) {
            answer = false;
        }
        return answer;
    }
}