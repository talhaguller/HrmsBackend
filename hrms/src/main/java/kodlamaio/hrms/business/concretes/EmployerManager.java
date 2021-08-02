package kodlamaio.hrms.business.concretes;


import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İş Veren Eklenmiştir");
    }

    @Override
    public DataResult<List<Employer>> getByCampanyName(String campanyName) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByCampanyName(campanyName),"Veri Listelendi");
    }

    @Override
    public DataResult<List<Employer>> getByCampanyNameStartsWith(String campanyName) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByCampanyNameStartsWith(campanyName),"Veri Listelendi");

    }

    @Override
    public DataResult<List<Employer>> getByCampanyNameContains(String campanyName) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByCampanyNameContains(campanyName),"Veri Listelendi");
    }

    @Override
    public DataResult<List<Employer>> getByWebAdress(String webAdress) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByWebAdress(webAdress),"Veri Listelendi");
    }

    @Override
    public DataResult<List<Employer>> getByWebAdressStartsWith(String webAdress) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByWebAdressStartsWith(webAdress),"Veri Listelendi");
    }

    @Override
    public DataResult<List<Employer>> getByWebAdressContains(String webAdress) {
        return new SuccessDataResult<List<Employer>>(this.employerDao.getByWebAdressContains(webAdress),"Veri Listelendi");
    }

    @Override
    public DataResult<Employer> getByEmployerAndJobAdvertisimenet(String campanyName, boolean isActiveted) {
        return new SuccessDataResult<Employer>(this.employerDao.getByEmployerAndJobAdvertisimenet(campanyName, isActiveted),"Veri Listelendi");
    }


}
