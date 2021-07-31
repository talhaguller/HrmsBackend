package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee getByEmployeeFirstName(String employeeFirstName);

    List<Employee> getByEmployeeFirstNameContains(String employeeFirstName);

    List<Employee> getByEmployeeFirstNameStartsWith(String employeeFirstName);

}
