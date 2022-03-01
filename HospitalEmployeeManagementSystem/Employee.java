// Intent of this class is to represent the employee
public abstract class Employee {
    private String id;
    private String name;
    private String department;
    private boolean working;

    public Employee(String id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", id=" + id + ", name=" + name + ", working=" + working + "]";
    }

    public abstract void performDuties();
      
}
