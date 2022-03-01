import java.util.*;

public class EmployeeManagementSystem implements ISubject{

    private List<IObserver> observers;
    private List<Employee> employees;

    private EmployeeDAO employeeDAO;

    public EmployeeManagementSystem() {

        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();

    }

    private Employee employee;
    private String msg;
    
    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(IObserver departments  : observers){
            departments.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employee = emp;
        msg = " New Hire "; 
        employees.add(emp);
        notifyObserver();
    }

    public void modifyEmployeeName(int id, String newName){
       boolean notify = false ;
       for(Employee emp : employees){
            if(id == emp.employeeId){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
       }

       if(notify){
           notifyObserver();
       }
    }

    
}
