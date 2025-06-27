import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Member{
        int age;
        String name;
        int id;

        public Member(int age, String name, int id) {
            this.age = age;
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String line = sc.nextLine();

            String[] parts = line.split(" ");
            int age = Integer.parseInt(parts[0]);
            String name = parts[1];

            memberList.add(new Member(age, name, i));
        }

        memberList.sort((a, b) -> {
            if (a.age != b.age) {
                return a.age - b.age;
            } else {
                return a.id - b.id;
            }
        });

        for(Member member : memberList) {
            System.out.println(member.age + " " + member.name);
        }

    }

}