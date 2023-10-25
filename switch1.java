import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.print("enter 1 to 7 :  ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("FUCK OFF");
                break;
        }
    }
}
