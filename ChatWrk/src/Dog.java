/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-09 21:10

 "Put description here..."

*/
public class Dog extends Animal {
    String breed,sex;
    int age;
    double height;

    public Dog(String breed, String sex, int age, double height) {
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    @Override
    void speak(){
        System.out.println("The dog mentioned speaks!!");
    }


}
