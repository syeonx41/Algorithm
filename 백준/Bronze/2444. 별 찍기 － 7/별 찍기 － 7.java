import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <= n-1; j++){

            for (int k = 0; k < j ; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n-j) - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

