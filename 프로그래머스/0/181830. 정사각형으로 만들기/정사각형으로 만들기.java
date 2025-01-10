
import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows > cols) {

            for (int i = 0; i < rows; i++) {

                arr[i] = Arrays.copyOf(arr[i], rows);
            }
        }

        if (cols > rows) {

            int[][] newArr = new int[cols][cols];
            for (int i = 0; i < rows; i++) {
                newArr[i] = arr[i];
            }

            for (int i = rows; i < cols; i++) {
                newArr[i] = new int[cols];
            }

            arr = newArr;
        }

        return arr;
    }
}