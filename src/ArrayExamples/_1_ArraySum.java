package ArrayExamples;


public class _1_ArraySum {

    static int arraysum(int[] arr) {

        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,4,5,6};
        System.out.println(arraysum(arr));
    }
}

