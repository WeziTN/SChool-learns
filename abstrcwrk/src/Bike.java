/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-02 21:00

 "Put description here..."

*/
class Bike extends Vehicle {
    int cc;
    String color;

    public Bike(String make,String model,int wheels,int cc,String color) {
        super();
        this.cc=cc;
        this.color=color;
    }

    
    
    void fueltype(){
        System.out.println("diesel is the type... ");
    }


}
