package kojoo.java.algorithm.string;

import java.util.Scanner;

public class Question1_5 {

    private static String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(!Character.isAlphabetic(c[left])) {
                left++;
            } else if(!Character.isAlphabetic(c[right])) {
                right--;
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));
    }



}
