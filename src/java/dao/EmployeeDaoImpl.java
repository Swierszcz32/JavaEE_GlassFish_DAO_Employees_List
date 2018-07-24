package dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    
    private double averageSalary;
    
    List<Employee> employees;
    
    public EmployeeDaoImpl(){
        employees = new ArrayList<Employee>();
        Employee employee1 = new Employee("Steven","King",24000.0,LocalDate.of(2002,Month.JANUARY,02));
        Employee employee2 = new Employee("Mario", "Bross", 1000.0,LocalDate.of(2012,Month.FEBRUARY,12));
        Employee employee3 = new Employee("Donald", "Trump", 30000.0, LocalDate.of(2017,Month.JANUARY,20));
        Employee employee4 = new Employee("Bruce", "Lee", 1200.0, LocalDate.of(1973,Month.JULY,20));
        Employee employee5 = new Employee("Stephen", "Wozniak", 3400.0, LocalDate.of(1950,Month.AUGUST,11));
        Employee employee6 = new Employee("Gary", "Kasparow", 1200.0, LocalDate.of(1963,Month.APRIL,13));
        Employee employee7 = new Employee("Pawel Edmund", "Strzelecki", 900.0, LocalDate.of(1797,Month.JULY,20));
        Employee employee8 = new Employee("Fred", "Brooks", 5050.0, LocalDate.of(1931,Month.APRIL,19));
        Employee employee9 = new Employee("Albert", "Einstein", 8343.00, LocalDate.of(1955,Month.APRIL,18));
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);        
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);

    }

    @Override
    public List getAllEmployee() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    
    public double getAverageSalary(){
        double tmp = 0;
        int i =0;
        for(Employee emp : employees){
            i++;
            tmp = tmp + emp.getSalary();
            averageSalary = tmp/i;
        }
        return averageSalary;
    }
//    @Override
//    public void updateEmployee(Employee employee) {
//        employees.get(employee.getId()).setFirstName(employee.getFirstName());
//    }
//
//    @Override
//    public void deleteEmployess(Employee employee) {
//        employees.remove(employee.getId());
//    }

}
