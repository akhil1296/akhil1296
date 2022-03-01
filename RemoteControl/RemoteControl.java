public class RemoteControl {
    public static void connectTo(Device device) {
        turnOn();
        device.performAction();
        turnOff();
    }

    public static void turnOn() {
        System.out.println("Turning on....");
    }

    public static void turnOff() {
        System.out.println("Turning off....");
    }
}
