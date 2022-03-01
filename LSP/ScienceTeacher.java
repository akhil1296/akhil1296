public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Science...");
    }
    
}
