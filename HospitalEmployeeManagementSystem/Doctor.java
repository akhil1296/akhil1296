public class Doctor extends Employee{

    public Doctor(String id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();
    }
    
    private void prescribeMedicine(){
        System.out.println("Presecribing the medicines....");
    }

    private void diagnosePatient(){
        System.out.println("Diagnosing the patient....");
    }
}
