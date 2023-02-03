package ArrayExamples;
import javax.swing.*;
import java.util.*;
public class _5_FindXValueIn2DArray {

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
    //Take X Array Value from the user
    int x = sc.nextInt();

    for(int i = 0;i < rows; i++){
        for (int j = 0; j < cols; j++) {
            if (_2DArrays[i][j] == x) {
                System.out.println("value of X is at this location:- " + "(" +i+ "," +j+ ")");
            }
        }
    }
  }
}


