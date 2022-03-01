import javax.xml.crypto.Data;

public class EmployeeDAO {

    public void saveEmployee(Employee emp){
        //DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
        System.out.println("Saving the employee from the database" + emp);
    }
    public void deleteEmployee(Employee emp){
        System.out.println("Deleting the employee from the database" + emp);
    }
    
}
