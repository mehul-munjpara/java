public class _18_Classes {
    static class car{
        int wheelSize;
        String fuelType;
        int mileAge;
    }

    public static void main(String[] args) {

        car fortuner = new car();
        fortuner.wheelSize = 13;
        fortuner.fuelType = "Petrol";
        fortuner.mileAge = 17;

        System.out.println(fortuner.fuelType);
    }
}
