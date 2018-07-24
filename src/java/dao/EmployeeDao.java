
package dao;
import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployee();
    public Employee getEmployee(int id);
    public double getAverageSalary();
//    public void updateEmployee(Employee employee);
//    public void deleteEmployess(Employee employee);
}
