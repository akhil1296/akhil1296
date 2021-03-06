import java.text.Format;
import java.util.Formattable;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
