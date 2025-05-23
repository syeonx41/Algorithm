import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();
        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - '0';
            sum += c;
        }

        System.out.println(sum);
    }
}