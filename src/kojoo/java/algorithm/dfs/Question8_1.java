package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question8_1 {
    private static int total = 0;
    private static String answer = "NO";
    private static boolean flag = false;

    private static void dfs(int depth, int sum, int[] numbers) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (depth == numbers.length) {
            if (sum == total - sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(depth + 1, sum + numbers[depth], numbers);
            dfs(depth + 1, sum, numbers);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        dfs(0, 0, numbers);

        System.out.println(answer);
    }

}
