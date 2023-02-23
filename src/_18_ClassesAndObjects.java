public class _18_ClassesAndObjects {
        static class car{
            int wheelSize;
            String fuelType;
            int mileAge;
        }

        public static void main(String[] args) {

//Here Fortuner is  a Object
            car fortuner = new car();
            fortuner.wheelSize = 13;
            fortuner.fuelType = "Petrol";
            fortuner.mileAge = 17;
            System.out.println(fortuner.fuelType);


// Here p1 is Object
             person p1 = new person();
             p1.name = "Mehul";
             p1.MobileNumber = 898;
            System.out.println("This is " + p1.name + " and his mobilenumber is " + p1.MobileNumber);
        }

           static class person{
                String name;
                int MobileNumber;
            }



}

