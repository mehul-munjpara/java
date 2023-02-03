import java.util.*;

public class _15_2D_Array {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int cols = sc.nextInt();

         int[][] _2DArrays = new int[rows][cols];

         //input
        //To Print Rows
         for (int i = 0 ; i<rows; i++){
            //To Print Cols
             for (int j= 0; j<cols; j++){
                 _2DArrays[i][j] = sc.nextInt();
             }
         }

        System.out.println("Your Entered Array WOuld be like this:-- ");
         //For OutPut
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                System.out.print(_2DArrays[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
