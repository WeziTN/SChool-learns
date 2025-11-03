/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-09 21:16

 "Put description here..."

*/
public class Rectangle extends Shape {
    double lenth,width;

    public Rectangle(double lenth, double width) {
        this.lenth = lenth;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return lenth*width;

    }


}
