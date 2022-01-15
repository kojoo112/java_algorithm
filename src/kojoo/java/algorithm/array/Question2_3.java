package kojoo.java.algorithm.array;

import java.util.Scanner;

public class Question2_3 {

    // 1: 가위
    // 2: 바위
    // 3: 보
    //   a    :   b
    //   1    :   3
    //   2    :   1
    //   3    :   2

    public static char[] solution(int count, int[] a, int[] b) {
        char[] answer = new char[count];

        for(int i=0; i<count; i++) {
            if(a[i] == b[i]) {
                answer[i] = 'D';
                break;
            }

            if(a[i] == 1 && b[i] == 3) {
                answer[i] = 'A';
            } else if(a[i] == 2 && b[i] == 1) {
                answer[i] = 'A';
            } else if(a[i] == 3 && b[i] == 2) {
                answer[i] = 'A';
            } else {
                answer[i] = 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        int[] b = new int[count];

        for(int i=0; i<count; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<count; i++) {
            b[i] = scanner.nextInt();
        }

        for(int i=0; i<count; i++) {
            System.out.println(solution(count, a, b)[i]);
        }
    }
}
