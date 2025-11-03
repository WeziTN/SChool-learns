/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-09 21:16

 "Put description here..."

*/
public class circle extends Shape {
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }


}
