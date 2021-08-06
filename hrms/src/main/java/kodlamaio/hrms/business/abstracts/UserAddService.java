package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.entities.UserAdd;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

public interface UserAddService {
    Result add(UserAdd userAdd);

    DataResult<UserAdd> getByEmail(String email);
}
