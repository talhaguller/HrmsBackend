package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {

    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {
        return this.jobAdvertisementService.getAll(pageNo,pageSize);
    }

    @GetMapping("/getAllAsc")
    public DataResult<List<JobAdvertisement>> getAllSortedAsc() {
        return this.jobAdvertisementService.getAllSortedAsc();
    }

    /*@GetMapping("/getAllDesc")
    public DataResult<List<JobAdvertisement>> getAllSortedDesc() {
        return this.jobAdvertisementService.getAllSortedDesc();
    }
*/
        @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getByActivatedIs")
    public DataResult<List<JobAdvertisement>> getByActivatedIs(){
        return this.jobAdvertisementService.getByActivatedIs();
    }

    @GetMapping("/getByAppealDeadline")
    public DataResult<List<JobAdvertisement>> getByAppealDeadline(){
        return this.jobAdvertisementService.getByAppealDeadline();
    }

    @GetMapping("/getJobAdvertisementWithEmployerDetails")
    public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails(){
        return this.jobAdvertisementService.getJobAdvertisementWithEmployerDetails();
    }
}

