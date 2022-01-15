package kojoo.java.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question5_2 {

    public static String solution(String input) {
        String answer = "";
        Stack<Character> stack = new Stack();

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(input.charAt(i));
            }
        }

        for(int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }
}
