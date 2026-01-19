import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int n = 0;

        while (sum < N) {
            n++;
            sum+=n;
        }

        int prev = sum - n;
        int k = N - prev;

        int a, b;
        if (n % 2 == 1) {
            a = n + 1 - k;
            b = k;
        } else {
            a = k;
            b = n + 1 - k;
        }

        System.out.println(a + "/" + b);
    }
}
