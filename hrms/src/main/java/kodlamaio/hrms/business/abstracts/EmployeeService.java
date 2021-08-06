package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Employee;
import lombok.Data;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();

    DataResult<List<Employee>> getAll(int pageNo, int pageSize);

    Result add(Employee employee);

    DataResult<Employee> getByEmployeeFirstName(String employeeFirstName);

    DataResult<List<Employee>> getByEmployeeFirstNameContains(String employeeFirstName);

    DataResult<List<Employee>> getByEmployeeFirstNameStartsWith(String employeeFirstName);
}
