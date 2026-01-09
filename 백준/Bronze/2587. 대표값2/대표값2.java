import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i=0; i<5; i++){
            int n = Integer.parseInt(br.readLine());
            array[i] = n;
        }

        Arrays.sort(array);
        int sum = 0;
        for (int i=0; i<5; i++){
            sum += array[i];
        }
        System.out.println(sum/5);
        System.out.println(array[2]);
    }
}