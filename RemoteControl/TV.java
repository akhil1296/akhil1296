public class TV implements Device  {
    @Override
    public void performAction() {
        openingLens();       
        display();
        closingLens();
    }
    private void display(){
        System.out.println("Displaying from TV...");
    }
    private void openingLens(){
        System.out.println("Opening lens of the TV...");
    }
    private void closingLens(){
        System.out.println("Closing lens of the TV...");
    }
}
