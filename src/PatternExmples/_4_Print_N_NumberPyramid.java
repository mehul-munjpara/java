package PatternExmples;

import java.util.*;

public class _4_Print_N_NumberPyramid {

    // n = 5
    // Ouptput
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

      static void starpattern1(int n){

        for(int i = 1 ; i<=n; i++){
              System.out.print(i+" ");
          }
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i = 1; i<=n; i++){
                starpattern1(i);
                System.out.println();
            }
    }

}
