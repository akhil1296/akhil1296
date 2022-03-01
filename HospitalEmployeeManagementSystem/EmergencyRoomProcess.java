public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagamentSystem ERDirector = new HospitalManagamentSystem();

        Employee john = new Doctor("a1b1c1", "Doctor", "Pathology", true);
        Employee meena = new Nurse("a2b1c1", "Nurse", "Haemotology", true);

        ERDirector.callUpon(john);
        ERDirector.callUpon(meena);

    }
}
