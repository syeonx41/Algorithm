import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] count = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int number = s.charAt(i) - '0';
            count[number]++;
            }

        int sixNine = count[6] + count[9];
        count[6] = (sixNine + 1) / 2;
        count[9] = 0;

        Arrays.sort(count);
        System.out.println(count[9]);
        }
    }

