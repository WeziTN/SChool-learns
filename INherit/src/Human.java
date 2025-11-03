/*
 * Author: Wezi.TN
 * Email: Nyirendawezi2004@gmail.com
 * 
 * Creation Date: 2025-08-19 21:26
 * 
 * Description:
 * This class represents a Human, which extends the Animal class.
 * It includes properties such as name, age, and height, and provides
 * methods for speaking and sleeping, as well as retrieving the name.
 */
public class Human extends Animal {
    String name;
    int age;
    double height;

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void speak(){
        System.out.println("this guy "+name+"speaks");
    }
    @Override
    void sleep(){
        System.out.println(name+"sleeps");
    }
    
    public String getName(){
        return name;

    }
}
