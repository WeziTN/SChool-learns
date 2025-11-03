/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-09 21:29

 "Put description here..."

*//*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-09 21:17

 "Put description here..."

*/
public class Triangle extends Shape {
    double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        double a = 0.5;
        return a*(base*height);
    }

}
