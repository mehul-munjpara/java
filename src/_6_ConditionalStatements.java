import java.util.Scanner;
public class _6_ConditionalStatements {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
//            int age = sc.nextInt();

//            if(age > 18){
//                System.out.println("You are eligible to apply for Licence");
//            }else{
//                System.out.println("You are not eligible");
//            }

//   if , else, ladder
//        if(age > 18){
//            System.out.println("You are eligible to apply for Licence");
//        }else if (age == 18){
//            System.out.println("You will be eligible to apply for Licence");
//        }else if (age == 17){
//            System.out.println("You are eligible to apply for Learning-Licence");
//        }
//        else{
//            System.out.println("You are not eligible");
//        }

//
//        System.out.println("Enter Your Age:- ");
//        int age = sc.nextInt();
//
//        switch(age){
//            case 18:
//                System.out.println("You are adult");
//                break;
//            case 30:
//                System.out.println("You have to marry");
//                break;
//            case 60:
//                System.out.println("You should retired");
//                break;
//            default:
//                System.out.println("Life is a journey");
//
//        }


          String str = sc.nextLine();

          switch(str){
              case "a" ->{
                  System.out.println("You'r answer is wrong");
              }
              case "b" ->{
                  System.out.println("This is near your target sum");
              }
              case "c" ->{
                  System.out.println("You'r answer is right");
              }
              default -> System.out.println("Thid option is not available");
          }


    }
}
