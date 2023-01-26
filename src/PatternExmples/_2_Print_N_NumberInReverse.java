package PatternExmples;

import java.util.Scanner;

public class _2_Print_N_NumberInReverse {
    static void printdesc(int n){

        for(int i=n; i>0; i--){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printdesc(n);
    }
}
