import java.util.Scanner;

public class age_if_case {
    public static void main(String[] args) {
        System.out.print("enter your age :  ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.println("you can vote ");
        }

        else {
            System.out.println("you can not vote ");
        }
    }
}
