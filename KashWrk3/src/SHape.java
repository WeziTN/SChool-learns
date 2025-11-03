abstract class SHape {
    abstract double area();

}

class circle extends SHape{

    double radius;

    public circle(double radius) {
        this.radius=radius;
    }


    double area(){
        return Math.PI*radius*radius;
    }

    
}
class Rectangle extends SHape{
    double lenth,width;

    Rectangle(double lenth,double width) {
        this.lenth=lenth;
        this.width=width;
    }
    double area(){
        return lenth*width/;
    }


    
}



