package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserAddService;
import kodlamaio.hrms.core.dataAccess.UserAddDao;
import kodlamaio.hrms.core.entities.UserAdd;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddManager implements UserAddService {

    private UserAddDao userAddDao;

    @Autowired
    public UserAddManager(UserAddDao userAddDao) {
        this.userAddDao = userAddDao;
    }

    @Override
    public Result add(UserAdd userAdd) {
        this.userAddDao.save(userAdd);
        return new SuccessResult("Kullanıcı Kaydedildi");
    }

    @Override
    public DataResult<UserAdd> getByEmail(String email) {
        return new SuccessDataResult<UserAdd>(this.userAddDao.getByEmail(email), "Kullanıcı Bulundu");
    }

}
