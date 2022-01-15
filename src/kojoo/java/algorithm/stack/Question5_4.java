package kojoo.java.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question5_4 {

    public static int solution(String input) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int right = stack.pop();
                int left = stack.pop();

                if(c == '+') {
                    stack.push(left + right);
                } else if(c == '-') {
                    stack.push(left - right);
                } else if(c == '*') {
                    stack.push(left * right);
                } else if (c == '/') {
                    stack.push(left / right);
                }
            }
        }
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }
}
