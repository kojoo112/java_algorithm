package kojoo.java.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question5_1 {

    public static String solution(String input) {
        String answer = "NO";
        Stack stack = new Stack();

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) {
                    return answer;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }
}
