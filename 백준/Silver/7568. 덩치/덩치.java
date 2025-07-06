import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int people = input.nextInt();

        int[][] bigArr  = new int[people][2];

        for (int i = 0; i < people; i++) {
            bigArr[i][0] = input.nextInt(); //몸무게
            bigArr[i][1] = input.nextInt(); //키
        }

        for (int i = 0; i < people; i++) {
            int rank = 1;
            for (int j = 0; j < people; j++) {
                if (i == j)
                    continue;

                if (bigArr[i][0]<bigArr[j][0] && bigArr[i][1]<bigArr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}

