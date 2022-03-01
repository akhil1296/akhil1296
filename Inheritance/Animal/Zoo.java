public class Zoo{
    public static void main(String args[]) {
        Animal animal1 = new Animal(12, 123, "M");
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird(3, 34, "F");
        bird1.sleep();
        bird1.eat();
        bird1.fly();

        Fish fish1 = new Fish(32, 314, "F");
        fish1.sleep();
        fish1.eat();
        fish1.swim();

    }
}