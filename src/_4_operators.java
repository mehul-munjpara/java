import java.util.Scanner;

public class _4_operators {
    public static void main(String[] args) {
//
//        int a = (6 * 6) - (6*6);
//
//        int b = 6*6-6*6;
//
//        System.out.println(a);
//        System.out.println(b);

// if both value is true then print True
        System.out.println(123>42 && 123>312312);

//if any one condition is true then will print True
        System.out.println(123>42 || 123>312312);

// Example = Given KiloMeter to convert Miles

        Scanner sc = new Scanner(System.in);
        int KiloToMile = sc.nextInt();
        double KiloToMilefinal = KiloToMile * 0.62137119;
        System.out.println("Final:-- " + KiloToMilefinal);


    }
}
