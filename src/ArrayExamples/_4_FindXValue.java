package ArrayExamples;
import java.util.*;
public class _4_FindXValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
//Taken Value X from user
        int x = sc.nextInt();
        //output
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("X found in this Index:- " + i);
            }
        }


    }
}
