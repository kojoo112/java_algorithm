package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question7_6 {
    static int[] check;
    static int number;

    private static void dfs(int depth) {
        if(depth == number +1) {
            for (int i = 1; i <= number; i++) {
                if(check[i] == 1)
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } else {
            check[depth] = 1;
            dfs(depth + 1);
            check[depth] = 0;
            dfs(depth + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
        number = 3;
        check = new int[number + 1];
        dfs(1);
    }

}
