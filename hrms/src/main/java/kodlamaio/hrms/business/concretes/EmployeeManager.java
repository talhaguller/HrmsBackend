package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add( Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Çalışan Eklenmiştir");
    }

    @Override
    public DataResult<Employee> getByEmployeeFirstName(String employeeFirstName) {
        return new SuccessDataResult<Employee>(this.employeeDao.getByEmployeeFirstName(employeeFirstName),"Data listelendi");

    }

    @Override
    public DataResult<List<Employee>> getByEmployeeFirstNameContains(String employeeFirstName) {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.getByEmployeeFirstNameContains(employeeFirstName),"Data listelendi");
    }

    @Override
    public DataResult<List<Employee>> getByEmployeeFirstNameStartsWith(String employeeFirstName) {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.getByEmployeeFirstNameStartsWith(employeeFirstName),"Data listelendi");
    }


}
