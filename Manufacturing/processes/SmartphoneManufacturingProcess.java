package processes;
public class SmartphoneManufacturingProcess  extends GeneralManufacturingProcess{

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }   

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled Smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing Smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packing Smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing Smartphone");
    }
    
}
