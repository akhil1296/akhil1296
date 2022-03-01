import java.util.Date;

public class Employee {
    private String name;
    private Date hireDate;
    private long salary;
    private boolean working;
    public int employeeId;

    private static int COUNTER;

    public Employee(String name, Date hireDate, long salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
        employeeId = ++COUNTER;
    }

    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + ", name=" + name + ", salary=" + salary
                + ", working=" + working + "]";
    }

}
