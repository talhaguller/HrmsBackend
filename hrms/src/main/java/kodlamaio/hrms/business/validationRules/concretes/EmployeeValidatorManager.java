package kodlamaio.hrms.business.validationRules.concretes;

import kodlamaio.hrms.business.validationRules.abstracts.EmployeeValidatorService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employee;
import org.apache.logging.log4j.util.Strings;

public class EmployeeValidatorManager extends UserValidatorManager implements EmployeeValidatorService {
    @Override
    public Result employeeNullCheck(Employee employee) {
        if(!super.userNullCheck(employee).isSuccess() || (Strings.isNotEmpty(employee.getEmployeeFirstName())) ||
                (Strings.isNotEmpty(employee.getEmployeeLastName()))){
            return new ErrorResult("Alanlar Boş Bırakılamaz");
        }
        return new SuccessResult();
    }

}
