public class Cat extends Animal {
    String breed,sex;
    int age;
    double height;

    public Cat(String breed, String sex, int age, double height) {
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    @Override
    void speak(){
        System.out.println("The cat mentioned meows!!");

    }

}
