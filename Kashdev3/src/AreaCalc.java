/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-08-11 14:53

 "Revision work from Kashman 3"

*/public class AreaCalc {
    double a;
    double b;

    public AreaCalc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }
    public double calculateArea(double a){
        return Math.PI * a * a;
    }


}
