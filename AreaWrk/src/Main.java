public class Main {
        public static void main(String[] args) {
            circle circle = new circle(15.1);
            Rectangle rectangle = new Rectangle(5.6,9);
            Triangle triangle = new Triangle(5.3,8.2);
            Square square = new Square(6);

            System.out.println("Circle area: " + circle.calculateArea());
            System.out.println("Rectangle area: " + rectangle.calculateArea());
            System.out.println("Triangle area: " + triangle.calculateArea());
            System.out.println("Square area: " + square.calculateArea());
        }

}
