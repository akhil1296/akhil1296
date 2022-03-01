// public class Chicken extends Bird {
//     public Chicken(int age, int weight, String gender) {
//         super(age, weight, gender);
//     }
//     // overiding
//     public void fly(){
//         System.out.println("Chicken cannot fly");
//     }
// }


public class Chicken implements Flyable {
    
    @Override
    public void fly() {
        System.out.println("Chicken cannot fly");
    }
}