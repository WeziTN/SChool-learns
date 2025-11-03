

public class Square extends Shape {
    double sides;

    public Square(double sides) {
        this.sides=sides;
    }

    @Override
    public double calculateArea(){
        return sides*sides;
    }
    
    

}
