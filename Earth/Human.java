public class Human{
    int height;
    String name;
    int age;
    String eyeColour;

    public Human(String name, int height, int age, String eyeColour){
        this.name = name;
        this.height = height;
        this.age = age;
        this.eyeColour = eyeColour;
    }
    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("My height is " + height + " inches");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye colour is " + eyeColour);
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void walk(){
        System.out.println("Walking...");
    }
}