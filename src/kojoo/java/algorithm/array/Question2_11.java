package kojoo.java.algorithm.array;

import java.util.Scanner;

public class Question2_11 {

    public static int solution(int students, int[][] classArray) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<students; i++) {
            int count = 0;
            for(int j=1; j<=students; j++) {
                for(int k=1; k<=5; k++) {
                    if(classArray[i][k] == classArray[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if(count > max) {
              max = count;
              answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int[][] classArray = new int[students+1][6];

        for(int i=1; i<=students; i++) {
            for(int j=1; j<=5; j++) {
                classArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(students, classArray));
    }
}
