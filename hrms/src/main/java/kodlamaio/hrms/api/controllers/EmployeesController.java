package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.business.concretes.EmployeeManager;
import kodlamaio.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeeManager employeeManager;

    @Autowired
    public EmployeesController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return this.employeeManager.getAll();
    }
}
