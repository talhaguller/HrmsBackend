package kodlamaio.hrms.business.validationRules.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserValidatorService {
    Result userNullCheck(User user);
}
