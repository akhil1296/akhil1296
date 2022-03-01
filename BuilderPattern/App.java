public class App{
    public static void main(String args[]){
        Vehicle car = new Vehicle.Builder("Maruti", "VXI")
        .color("White")
        .doors(4)
        .horsePower(150)
        .price(100000)
        .type("car")
        .build();

        System.out.println(car.toString());
    }
}