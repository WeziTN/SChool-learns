/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-01 14:23

 "Put description here..."

*/
public class Constants {
final double PI=3.14159;
}

class Parent{
    void display(){
        System.out.println("final method this it is...");
    }

}
class child extends Parent{
    void display(){
        System.out.println("last");

    }
}
final class immutableClass{
    void show(){
        System.out.println("not extended this class cant...");
    }
}
