public class Zoo{
    public static void main(String args[]) {
        // Implementing the abstract classes

        Animal sparrow1 = new Sparrow(12, 123, "F");
        // sparrow1.move();
        moveAnimals(sparrow1);
        
        Animal fish1 = new Fish(134, 131, "M");
        // fish1.move();
        moveAnimals(fish1);
    }

    public static void moveAnimals(Animal animal){ // Demosntrating polymorphism also
        animal.move();
    }
}