public class HRDepartment implements IObserver{

    public void callMe(Employee emp, String msg){
        System.out.println("HR Department is notified...");
        System.out.println(msg + " " + emp.getName());
    }
}
