import java.util.*;

public class _14_String {

    public static void main(String[] args) {
//        String Way1 = "Mehul";

//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();

////Find Which Char is in the which position
//        System.out.println(str1.charAt(2));

////Converrt string to character Array
//        char[] arr = str1.toCharArray();

        //change the string

        StringBuilder change = new StringBuilder("Raju");
        System.out.println(change);
        change.setCharAt(0,'K');
        System.out.println("The changed String is:- " +change);
//To add String
        change.insert(0,'K');
        System.out.println("Now it is Punjabi food name:- " + change);

        //combine two string
//        String firstname = "Mehul";
//        String lastname = "Munjpara";
//        String Fullname = firstname + " "+lastname;
//        System.out.println(Fullname);
//        //For length
//        System.out.println(Fullname.length());

        //To print any startin or ending in string
//        String sentence = "MohitMunjpara";
//        String name = sentence.substring(2,sentence.length());
//        System.out.println("The String would be: -- " +name);


    }
}
