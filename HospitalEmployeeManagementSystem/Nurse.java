public class Nurse extends Employee {

    public Nurse(String id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        checkPatientArea();
    }

    private void checkVitalSigns() {
        System.out.println("Checking vital signs ....");
    }

    private void drawBlood() {
        System.out.println("Drawing the blood....");
    }

    private void checkPatientArea() {
        System.out.println("Checking the patient area....");
    }

}
