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
        //  one way is to override

        // better way is to create interface

        // via overriding
        // Chicken chick1 = new Chicken(12, 232, "M");
        // via interfaces
        Chicken chick1 = new Chicken();
        chick1.fly();

        Sparrow s1 = new Sparrow(12, 421, "F");
        s1.fly();
        s1.eat();
        s1.sleep();
        
    }
}