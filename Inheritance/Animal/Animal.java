public class Animal{
    private int age;
    private int weight;
    private String gender;

    public Animal(int age, int weight, String gender){
        this.age = age ;
        this.weight = weight ;
        this.gender = gender ;
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}