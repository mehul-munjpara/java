package ArrayExamples;
import  java.util.*;


public class _6_PrintSubArray {
     static int PrintSubArray(int[] arr, int startIndex, int endIndex){
          int sum = 0;
         for (int i = startIndex; i<=endIndex;i++){
             sum = sum + arr[i];
         }
         return sum;
     }

    public static void main(String[] args) {


        
    }
}
