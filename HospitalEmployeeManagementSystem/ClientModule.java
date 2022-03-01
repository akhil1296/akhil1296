public class ClientModule {
    public static void main(String[] args) {
        Employee doctor = new Employee("a1b1c1", "Doctor", "Pathology", true);
        Employee wardBoy = new Employee("a2b1c1", "Ward Boy", "Haemotology", true);
        Employee trayMan = new Employee("a1b2c1", "Tray Man", "Staff", true);
        Employee stretcherMan = new Employee("a1b1c2", "Stretcher Man", "xRay", true);

        hireNewEmployee(doctor);
        hireNewEmployee(wardBoy);
        hireNewEmployee(trayMan);
        hireNewEmployee(stretcherMan);

        printEmployeeReport(doctor, FormatType.XML);
        printEmployeeReport(wardBoy, FormatType.CSV);
        printEmployeeReport(trayMan, FormatType.XML);
        printEmployeeReport(stretcherMan, FormatType.CSV);

        terminateEmployee(doctor);
        terminateEmployee(wardBoy);
        terminateEmployee(trayMan);
        terminateEmployee(stretcherMan);

    }

    public static void hireNewEmployee(Employee employee) {

        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("Hiring...");
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {

        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("Terminating...");
        employeeDAO.deleteEmployee(employee);

    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println("Printing Employee Report..." + formatter.getFormattedEmployee());
    }
}