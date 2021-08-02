package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
    return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }

    @GetMapping("/getByCampanyName")
    public DataResult<List<Employer>> getByCampanyName(@RequestParam String campanyName){
        return this.employerService.getByCampanyName(campanyName);
    }

    @GetMapping("/getByCampanyNameStartsWith")
    public DataResult<List<Employer>> getByCampanyNameStartsWith(@RequestParam String campanyName){
        return this.employerService.getByCampanyNameStartsWith(campanyName);
    }

    @GetMapping("/getByCampanyNameContains")
    public DataResult<List<Employer>> getByCampanyNameContains(@RequestParam String campanyName){
        return this.employerService.getByCampanyNameContains(campanyName);
    }

    @GetMapping("/getByWebAdress")
    public DataResult<List<Employer>> getByWebAdress(@RequestParam String webAdress){
        return this.employerService.getByWebAdress(webAdress);
    }

    @GetMapping("/getByWebAdressStartsWith")
    public DataResult<List<Employer>> getByWebAdressStartsWith(@RequestParam String webAdress){
        return this.employerService.getByWebAdressStartsWith(webAdress);
    }

    @GetMapping("/getByWebAdressContains")
    public DataResult<List<Employer>> getByWebAdressContains(@RequestParam String webAdress){
        return this.employerService.getByWebAdressContains(webAdress);
    }

    @GetMapping("/getByEmployerAndJobAdvertisimenet")
    public DataResult<Employer> getByEmployerAndJobAdvertisimenet(@RequestParam("campanyName") String campanyName, @RequestParam("isActiveted") boolean isActiveted){
        return this.employerService.getByEmployerAndJobAdvertisimenet(campanyName, isActiveted);
    }
}












