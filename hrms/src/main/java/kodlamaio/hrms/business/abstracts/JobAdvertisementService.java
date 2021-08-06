package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> getAll();

    DataResult<List<JobAdvertisement>> getAllSortedAsc();

/*
    DataResult<List<JobAdvertisement>> getAllSortedDesc();
*/

    DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize);

    Result add(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>> getByActivatedIs();

    DataResult<List<JobAdvertisement>> getByAppealDeadline();

    DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails();
}
