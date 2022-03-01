public class MathTeacher extends SchoolStaff implements CourseInstructor{
    public MathTeacher(String name) {
        super(name);
        teach();
    }
    
    @Override
    public void teach() {
        System.out.println("Teaching Maths...");
    }
   
}
