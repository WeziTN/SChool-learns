public class Main {
    public static void main(String[] args) {
        Vehicle mycar=new Car("ugati","mazaratti",4,123,"black");
        Vehicle mybike = new Bike("Kawasaki", "ninja400", 2, 400, "black");

        mycar.fueltype();
        mybike.fueltype();
    }

}
