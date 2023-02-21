package Projects;
import  java.util.Scanner;
public class Mini_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number:-- ");
        int num_1 = sc.nextInt();
        System.out.print("Enter Second number:-- ");
        int num_2 = sc.nextInt();


        System.out.print("Enter 0 for Addition, 1 for Subtraction, 2 for Multiplication, 3 for Division :--  ");
        int input = sc.nextInt();
        switch (input){
            case 0:
                System.out.print("Addition of two numbers is:-- ");
                System.out.println(num_1 + num_2);
                break;
            case 1:
                System.out.print("Subtraction of two numbers is:-- ");
                System.out.println(num_1 - num_2);
                break;
            case 2:
                System.out.print("Multiplication of two numbers is:-- ");
                System.out.println(num_1 * num_2);
                break;
            case 3:
                System.out.print("Division of two numbers is:-- ");
                System.out.println(num_1 / num_2);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
