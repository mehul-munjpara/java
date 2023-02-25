

// Haven't done yet


    public class _20_Inheritance {

        static class person {
            String name;
            int age;

            public person(int age, String name) {
                this.name = name;
                this.age = age;
            }

            void walk() {
                System.out.println(name + " is walking.");
            }

            void eat() {
                System.out.println(name + " is eating. ");
            }

            //this is also called polymorphism:- used walk() two times.
            void walk(int steps) {
                System.out.println(name + " walked " + steps + " steps.");
            }


            public static void main(String[] args) {
                _19_Methods.person p1 = new _19_Methods.person();
                p1.name = "Mehul";

                _19_Methods.person p2 = new _19_Methods.person();
                p2.name = "Mohit";

                //here we have called walk() and  eat() methods
                p1.walk();
                p2.eat();
                p2.walk(4);


            }
        }


    }

