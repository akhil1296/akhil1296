public class EnglishTeacher extends SchoolStaff implements CourseInstructor{
    
    public EnglishTeacher(String name) {
        super(name);
        teach();
    }

    @Override
    public void teach() {
        System.out.println("Teaching English...");
    }
    
}
