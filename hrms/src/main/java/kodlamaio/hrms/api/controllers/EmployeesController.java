package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Employee>> getAll(int pageNo, int pageSize) {
        return this.employeeService.getAll(pageNo,pageSize);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
        return this.employeeService.add(employee);
    }

    @GetMapping("/getByEmployeeFirstName")
    public DataResult<Employee> getByEmployeeFirstName(@RequestParam String employeeFirstName){
        return this.employeeService.getByEmployeeFirstName(employeeFirstName);
    }

    @GetMapping("/getByEmployeeFirstNameContains")
    public DataResult<List<Employee>> getByEmployeeFirstNameContains(@RequestParam String employeeFirstName){
        return this.employeeService.getByEmployeeFirstNameContains(employeeFirstName);
    }

    @GetMapping("/getByEmployeeFirstNameStartsWith")
    public DataResult<List<Employee>> getByEmployeeFirstNameStartsWith(@RequestParam String employeeFirstName){
        return this.employeeService.getByEmployeeFirstNameStartsWith(employeeFirstName);
    }

}
