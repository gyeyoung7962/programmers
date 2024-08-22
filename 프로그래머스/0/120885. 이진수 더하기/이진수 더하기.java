class Solution {
    public String solution(String bin1, String bin2) {
        
        
        String result = "";

        int binary1 = Integer.parseInt(bin1, 2);
        int binary2 = Integer.parseInt(bin2, 2);

        int binaryR = binary1 + binary2;

        result = String.valueOf(Integer.toBinaryString(binaryR));

        return result;
    }
}