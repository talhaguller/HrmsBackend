package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concretes.City;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Veri Listelendi");
    }

    @Override
    public DataResult<List<City>> getAll(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo,pageSize);

        return new SuccessDataResult<List<City>>(this.cityDao.findAll(pageable).getContent(), "Veri Sıralandı");
    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("Şehir Eklendi");
    }
}
