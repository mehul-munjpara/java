public class _8_loops {


    public static void main(String[] args) {

//        System.out.println("Using _8_loops:- ");
//        int i = 1;
//        while(i<=3){
//            System.out.println(i);
//            i++;
//        }


//        int a = 0;
//        do{
//            System.out.println(a);
//            a++;
//        }while(a<5);


// Print Odd Number
//       Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for(int i =1; i<=a; i+=2){
//            System.out.print(" "+ i);
//        }

        // Print Even Number
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for(int i =0; i<=a; i+=2){
//            System.out.print(" "+ i);
//        }

        //decrement the number using loop

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for(int i =a; i>=0; i--){
//            System.out.print(" "+ i);
//        }


        // How to use Break using loop


//        int a = 5;
//
//        for(int i =0; i<=a; i++){
//            System.out.print(" "+ i+ " ");
//            System.out.println(" Will End Loop after this");
//        if(i==3){
//            System.out.println("End loop");
//            break;
//        }
//        }



        // How to use Continue using loop

        int a = 5;

        for(int i=0; i<=a;i++){
            if(i==2){
                System.out.println("This is only for 2 :) :) ");
                continue;
            }
            System.out.println(i);
        }





    }
}
