public class Main {
    public static void main(String[] args) {
        AreaCalc areaCalc = new AreaCalc(5, 10);
        System.out.println("Area of rectangle:" + areaCalc.calculateArea());
        System.out.println("Area of circle with radius 5:" + areaCalc.calculateArea(5));
    }

}
