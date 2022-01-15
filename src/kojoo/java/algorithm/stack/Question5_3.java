package kojoo.java.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question5_3 {

    public static int solution(int boardSize, int[][] board, int movesSize, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int position : moves) {
            for(int i=0; i<boardSize; i++) {
                if(board[i][position-1] != 0) {
                    int temp = board[i][position-1];
                    board[i][position-1] = 0;
                    if(!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boardSize = scanner.nextInt();
        int[][] board = new int[boardSize][boardSize];

        for(int i=0; i<boardSize; i++) {
            for(int j=0; j<boardSize; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int movesSize = scanner.nextInt();
        int[] moves = new int[movesSize];

        for(int i=0; i<movesSize; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.println(solution(boardSize, board, movesSize, moves));
    }
}
