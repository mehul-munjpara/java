package ArrayExamples;
import java.util.*;

public class _3_2DArray {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] test = new int[rows][cols];

    //Input
        // rows
        for (int i = 0; i<rows; i++){
      //cols
            for (int j = 0; j<cols; j++){
            test[i][j] = sc.nextInt();
        }
    }

        //Output
        for(int i = 0;i < rows; i++){
        for (int j = 0; j < cols; j++) {
            System.out.print( test[i][j]+" ");
        }
        System.out.println();
     }
    }
}
