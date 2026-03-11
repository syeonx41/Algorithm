import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= max)
                max = score[i];
            sum += score[i];
        }
        System.out.println(sum*100.0/N/max);
    }
}
