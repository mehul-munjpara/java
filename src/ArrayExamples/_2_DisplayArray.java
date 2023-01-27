package ArrayExamples;

public class _2_DisplayArray {
    public static void main(String[] args) {
//        int[] arr = {11,22,33,44,55};
//
//        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//        //reverse Array
//        System.out.println("Printing Reverse Array:--");
//        for(int i= arr.length-1; i>=0;i--){
//            System.out.println(arr[i]);
//        }


        //How to Write and Display 2-D Array
        int[][] arr2d = new int[2][3];
        arr2d[0][0]  = 111;
        arr2d[0][1]  = 222;
        arr2d[0][2]  = 333;
        arr2d[1][0]  = 444;
        arr2d[1][1]  = 555;
        arr2d[1][2]  = 666;


        System.out.println("Here is the example of 2-D Array:- ");
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++ ){
                System.out.print(arr2d[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }


    }


}
