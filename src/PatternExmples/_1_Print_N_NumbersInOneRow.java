package PatternExmples;

import java.util.Scanner;

public class _1_Print_N_NumbersInOneRow {
    // input => n = 4
    // output => 1 2 3 4.........n

    static void printRow(int n){
        for(int i = 1;i <= n; i++){
            System.out.print(i+" ");
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRow(n);

    }
}


