import java.util.Scanner;

public class _16_BitMsnipulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        //Get [AND( & ) ] Bit
//        if ((bitMask & n) == 0){
//            System.out.println("Bit Was Zero");
//        }else {
//            System.out.println("Bit Was One");
//        }

        //set [OR ( | ) ] Bit
//       int newNumber = bitMask | n;
//        System.out.println(newNumber);


        //Clear Bit [ AND with NOT (~) ]
//        int notBitMask = ~(bitMask);
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);


        //Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int bitMaskUpdate = 1<<pos;

        if(oper == 1){
            //set
            int newNumber = bitMaskUpdate | n;
            System.out.println(newNumber);
        }else{
            //clear
           int newBitMask = ~(bitMaskUpdate);
           int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
