import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int num = sc.nextInt();

        int realPrice = 0;

        for(int i = 0; i < num; i++){
            int x= sc.nextInt();
            int y = sc.nextInt();
            realPrice += x*y;
        }

        if(realPrice == price){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}