public class _16_BitMsnipulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
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
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}
