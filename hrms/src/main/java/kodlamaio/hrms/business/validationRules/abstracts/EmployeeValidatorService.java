package kodlamaio.hrms.business.validationRules.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeValidatorService {
    Result employeeNullCheck(Employee employee);
}
