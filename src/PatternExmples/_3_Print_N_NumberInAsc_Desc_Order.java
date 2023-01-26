package PatternExmples;
import java.util.*;

public class _3_Print_N_NumberInAsc_Desc_Order {

    static void PrintAsc(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    static void PrintDes(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintAsc(n);
        PrintDes(n - 1);
    }
}

