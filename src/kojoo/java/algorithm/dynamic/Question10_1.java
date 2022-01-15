package kojoo.java.algorithm.dynamic;

import java.util.Scanner;

public class Question10_1 {
    static int[] dy;

    private static int solution(int number) {
        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i <= number; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }


        return dy[number];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        dy = new int[number+1];

        System.out.println(solution(number));
    }
}
