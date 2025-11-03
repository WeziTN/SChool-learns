public class App {
    public static void main(String[] args){
        Human human1 = new Human("wezi", 19, 1.75);
        Bird bird1 = new Bird("sparrow", 2, 0.25);

        human1.breathe();
        human1.eat();

        bird1.breathe();
        bird1.eat();

    
    }
}
