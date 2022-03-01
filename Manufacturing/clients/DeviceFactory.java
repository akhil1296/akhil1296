package clients;
import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String args[]){
        GeneralManufacturingProcess manuacturer = new SmartphoneManufacturingProcess("Iphone");
        manuacturer.launchProcess();

        GeneralManufacturingProcess manuacturer2 = new LaptopManufacturingProcess("Dell");
        manuacturer2.launchProcess();
    }
}
