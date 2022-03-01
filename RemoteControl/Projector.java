public class Projector implements Device{

    @Override
    public void performAction() {
        openingLens();       
        display();
        closingLens();
    }
    private void display(){
        System.out.println("Displaying from projector...");
    }
    private void openingLens(){
        System.out.println("Opening lens of the projector...");
    }
    private void closingLens(){
        System.out.println("Closing lens of the projector...");
    }
    
}