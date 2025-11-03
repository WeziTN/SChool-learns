
/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-08-11 14:27

 "Revision work from Kashman"

*/
public class Car {
    String brand;
    String model;
    int year;


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year
        + "\n");
    }

}
