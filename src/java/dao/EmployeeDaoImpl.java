package dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    
    List<Employee> employees;
    
    public EmployeeDaoImpl(){
        employees = new ArrayList<Employee>();
        Employee employee1 = new Employee("Steven","King",1,24000.0,LocalDate.of(2002,Month.JANUARY,02),"wyższa");
        Employee employee2 = new Employee("Mario", "Bross", 2, 1000.0,LocalDate.of(2012,Month.FEBRUARY,12), "niższa");
        Employee employee3 = new Employee("Donald", "Trump", 3, 30000.0, LocalDate.of(2017,Month.JANUARY,20), "wyższa");
        Employee employee4 = new Employee("Bruce", "Lee", 4, 1200.0, LocalDate.of(1973,Month.JULY,20), "niższa");
        Employee employee5 = new Employee("Stephen", "Wozniak", 5, 3400.0, LocalDate.of(1950,Month.AUGUST,11), "równa");
        Employee employee6 = new Employee("Gary", "Kasparow", 6, 1200.0, LocalDate.of(1963,Month.APRIL,13), "niższa");
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);        
        employees.add(employee6);
    }

    @Override
    public List getAllEmployee() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employees.get(employee.getId()).setFirstName(employee.getFirstName());
    }

    @Override
    public void deleteEmployess(Employee employee) {
        employees.remove(employee.getId());
    }

}
