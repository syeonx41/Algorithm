import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        int sum = 0;

        for (int i = 0; i < stack.size(); i++) {
            int num = stack.get(i);
            sum += num;
        }
        
        System.out.println(sum);
    }
}
