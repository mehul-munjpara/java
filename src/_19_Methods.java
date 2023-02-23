    public class _19_Methods {

        public static void  main(String[] args){


            person p1 = new person();
            p1.name = "Mehul";

            person p2 = new person();
            p2.name = "Mohit";

            p1.walk();
            p2.eat();

        }


        static class person{
            String name;
            int age;

            void walk(){
                System.out.println(name + " is walking.");
            }
            void eat(){
                System.out.println(name + " is eating. ");
            }
        }

    }
