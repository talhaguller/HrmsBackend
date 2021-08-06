package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();

    DataResult<List<Employer>> getAll(int pageNo, int pageSize);

    Result add(Employer employer);

    DataResult<List<Employer>> getByCampanyName(String campanyName);

    DataResult<List<Employer>> getByCampanyNameStartsWith(String campanyName);

    DataResult<List<Employer>> getByCampanyNameContains(String campanyName);

    DataResult<List<Employer>> getByWebAdress(String webAdress);

    DataResult<List<Employer>> getByWebAdressStartsWith(String webAdress);

    DataResult<List<Employer>> getByWebAdressContains(String webAdress);

    DataResult<Employer> getByEmployerAndJobAdvertisimenet(String campanyName, boolean isActiveted);

}
