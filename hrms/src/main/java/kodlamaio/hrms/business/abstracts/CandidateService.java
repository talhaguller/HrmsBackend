package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>>  getAll();

    DataResult<List<Candidate>> getAll(int pageNo, int pageSize);

    Result add(Candidate candidate);
}
