package kodlamaio.hrms.business.validationRules.concretes;

import kodlamaio.hrms.business.validationRules.abstracts.UserValidatorService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.User;
import org.apache.logging.log4j.util.Strings;

public class UserValidatorManager implements UserValidatorService {
    @Override
    public Result userNullCheck(User user) {
        if(Strings.isNotEmpty(user.getEmail()) || Strings.isNotEmpty(user.getPassword())){
            return new ErrorResult("Alanlar Boş Bırakılamaz");
        }
        return new SuccessResult();
    }
}
