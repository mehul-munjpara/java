import java.util.Scanner;

public class kilometertomiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KiloToMile = sc.nextInt();

        double KiloToMilefinal = KiloToMile * 0.62137119;

        System.out.println("Final:-- " + KiloToMilefinal);
    }
}
