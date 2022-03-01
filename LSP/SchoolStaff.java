public class SchoolStaff {
    private String name;

    public SchoolStaff(String name) {
        this.name = name;
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
    }

    private void makeAnnouncements() {
        System.out.println("Making Announcements");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void takeAttendance() {
        System.out.println("Taking Attendance");
    }

    private void collectPaperWork() {
        System.out.println("Collecting paper work ");
    }

    private void conductHallwayDuties() {
        System.out.println("Conducting hallway duties");
    }
}
