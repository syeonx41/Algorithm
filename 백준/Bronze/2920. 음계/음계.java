import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean asc = true, desc = true;

        for (int i = 0; i < 7; i++) {
            if (arr[i+1] - arr[i] != 1) {
                asc = false;
            }
            if (arr[i] - arr[i+1] != 1) {
                desc = false;
            }
        }
        if (asc){
            System.out.println("ascending");
        }
        else if (desc){
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }

}