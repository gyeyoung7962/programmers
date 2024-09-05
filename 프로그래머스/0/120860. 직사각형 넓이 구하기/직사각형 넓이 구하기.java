class Solution {
    public int solution(int[][] dots) {
        
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        
        int width = Math.max(Math.abs(x1 - x2), Math.abs(x1 - x3));
        int height = Math.max(Math.abs(y1 - y2), Math.abs(y1 - y3));

        
        return width * height;
    }
}