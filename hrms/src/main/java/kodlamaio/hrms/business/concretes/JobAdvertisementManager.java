package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Veri Listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSortedAsc() {
        Sort sort = Sort.by(Sort.Direction.ASC,"quota");
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Veri Listelendi");
    }

   /* @Override
    public DataResult<List<JobAdvertisement>> getAllSortedDesc() {
        Sort sort = Sort.by(Sort.Direction.DESC,"");
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Veri Listelendi");
    }*/


    @Override
    public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo,pageSize);

        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(pageable).getContent(),"Veri Sıralandı");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş İlanı Eklenmiştir");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByActivatedIs() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActivatedIs(), "Aktif İş İlanları Listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByAppealDeadline() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByAppealDeadline(), "Son Başvuru İlanları Listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails() {
        return new SuccessDataResult<List<JobAdvertisementWithEmployerDto>>(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails(), "Veri Listelendi");
    }
}
