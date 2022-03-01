public class Fish extends Animal {

    public Fish(int age, int weight, String gender) {
        super(age, weight, gender);
    }
    
    public void swim(){
        System.out.println("Swimming...");
    }

    @Override
    public void move() {
        System.out.println("Fish can swim...");
    }
}
