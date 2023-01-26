package PatternExmples;

import java.util.Scanner;

public class _5_Print_N_NumberWithAscDescPyramid {


    // n = 5
    // Ouptput
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2
    //1

    static void AscOrder(int n){

        for(int i = 1 ; i<=n; i++){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i = 1; i<=n; i++){
            AscOrder(i);
            System.out.println();
        }
        for(int i = n-1; i>=1; i--){
            AscOrder(i);
            System.out.println();
        }
    }

}
