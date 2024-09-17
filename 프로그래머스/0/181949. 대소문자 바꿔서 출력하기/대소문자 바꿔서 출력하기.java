import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] split_a = a.split("");

        String answer = "";

        for (int i = 0; i < a.length(); i++) {

            if (Character.isUpperCase(a.charAt(i))) {

                split_a[i] = split_a[i].toLowerCase();
            }

            if (Character.isLowerCase(a.charAt(i))) {

                split_a[i] = split_a[i].toUpperCase();
            }
        }

        for (int i = 0; i < split_a.length; i++) {
            answer += split_a[i];
        }

        System.out.println(answer);
    }
}