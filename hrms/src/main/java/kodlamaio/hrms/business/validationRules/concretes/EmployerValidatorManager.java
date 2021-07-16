package kodlamaio.hrms.business.validationRules.concretes;

import kodlamaio.hrms.business.validationRules.abstracts.EmployerValidatorService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employer;
import org.apache.logging.log4j.util.Strings;

public class EmployerValidatorManager extends UserValidatorManager implements EmployerValidatorService {
    @Override
    public Result employerNullCheck(Employer employer) {
        if(!super.userNullCheck(employer).isSuccess() || (Strings.isNotEmpty(employer.getCampanyName())) ||
                (Strings.isNotEmpty(employer.getPhoneNumber())) || (Strings.isNotEmpty(employer.getWebAdress()))){
            return new ErrorResult("Alanlar Boş Bırakılamaz");
        }
        return new SuccessResult();
    }

    @Override
    public Result domainEmailCheck(Employer employer) {
        String email = employer.getEmail();
        String webAdress = employer.getWebAdress();

        String domain = webAdress.split("www.")[1];
        if (domain.equals(email.split("@")[1])){
            return new SuccessResult();
        }
        return new ErrorResult("Domain Geçersiz");
    }
}
