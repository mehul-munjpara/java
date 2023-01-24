import java.util.Scanner;

public class patternExample {

    // input => n = 4
    // output => 1 2 3 4.........n

//    static void printRow(int n){
//        for(int i = 1;i <= n; i++){
//            System.out.print(i+" ");
//        }
//
//    }


    // input => n=4
    //output => 4 3 2 1

//    static void printDesc(int n){
//        for(int i = n; i>=1 ; i--){
//            System.out.print(i+" ");
//        }
//    }

    // input=> n = 5
//    Output = 1 2 3 4 5 4 3 2 1

//    static void printasc(int n){
//        for(int i = 1 ; i <= n ; i++){
//            System.out.print(i+" ");
//        }
//    }
//    static void printdes(int n) {
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//    }

    // n = 5
    // Ouptput
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

      static void starpattern1(int n){

        for(int i = 1 ; i<=n; i++){
              System.out.print(i+" ");
          }

      }





        public static void main (String[] args){
//        printRow(15);
//        printDesc(10);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

//            printasc(n);
//            printdes(n-1);

            for(int i = 1; i<=n; i++){
                starpattern1(i);
                System.out.println();
            }
        }
    }




