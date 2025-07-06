import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] people = new int[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = input.nextInt(); // 몸무게
            people[i][1] = input.nextInt(); // 키
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
