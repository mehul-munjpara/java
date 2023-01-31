import java.util.Scanner;

public class _10_array {


    public static void main(String[] args){

        //There Are Three Methods for array
      //1st method
//        int[] marks = {23,45,78,2225,67};
//        System.out.println(marks[4]);

     //2nd method
//
//        int[] marks3 = new int[5];
//        marks3[0] = 200;
//        marks3[1] = 10;
//        marks3[2] = 60;
//        marks3[3] = 30;
//        marks3[4] = 80;
//        System.out.println(marks3[1]);


        //3rd method
//        int[] marks2;
//        marks2 = new int[5];
//        marks2[0] = 200;
//        marks2[1] = 10;
//        marks2[2] = 60;
//        marks2[3] = 30;
//        marks2[4] = 80;
//        System.out.println(marks2[3]);


        // Print All Array's using for loop
//        double[] sub = new double[4];
//        sub[0] = 4242.2323;
//        sub[1] = 454.003;
//        sub[2] = 111.5545;
//        sub[3] = 888.76;
//
//        for (int i = 0; i<4; i++ ){
//            System.out.println(sub[i]);
//        }

        //Take Array From User
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
//Input
        for (int i = 0 ; i<size; i++){
            number[i] = sc.nextInt();
        }
//Output
        for(int i = 0; i<size; i++){
            System.out.print(" " +number[i]);
        }

    }
}
