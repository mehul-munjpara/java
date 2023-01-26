public class _7_function {

    static int sum(int a, int b){
        int s = a + b;
        return s;
    }

    static int sub(int c, int d){
        int sub = c - d;
        return sub;
    }

    //if we don't want to return anything
    static void PrintName(){
        System.out.println("Mehul Munjpara");
    }


    public static void main(String[] args) {
        int s1= sum(3,6);
        int s2= sum(34,66);
        int s3= sum(93,62);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //This is only for PrintName _7_function
        PrintName();

        int x= 19;
        int y= 17;
        int sub1 = sub(x,y);
        System.out.println(sub1);
    }
}
