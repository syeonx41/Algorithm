import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println(min + " " + max);
    }

}
