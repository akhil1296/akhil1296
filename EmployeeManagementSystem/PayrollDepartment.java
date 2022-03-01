public class PayrollDepartment implements IObserver{
    
    public void callMe(Employee emp, String msg){
        System.out.println("Payroll system is notified...");
        System.out.println(msg + " " + emp.getName());
    }
}
