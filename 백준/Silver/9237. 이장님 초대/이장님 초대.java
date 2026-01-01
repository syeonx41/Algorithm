import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Integer[] tree = new Integer[n];
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < tree.length; i++) {
            int day = tree[i] + (i+1);
            if (max < day) {
                max = day;
            }
        }
        System.out.println(max+1);

    }
}