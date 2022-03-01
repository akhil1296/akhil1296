public class Earth {
    public static void main(String args[]){
        System.out.println("----------------------------------------");

        Human human1 = new Human("Tom", 164, 24, "Brown");
        human1.speak();
        human1.eat();
        human1.walk();

        System.out.println("----------------------------------------");

        Human human2 = new Human("Hoe", 154, 14, "Black");
        human2.speak();
        human2.eat();
        human2.walk();

        System.out.println("----------------------------------------");

        Human human3 = new Human("Mike", 194, 44, "Blue");
        human3.speak();
        human3.eat();
        human3.walk();

        System.out.println("----------------------------------------");
    }
}
