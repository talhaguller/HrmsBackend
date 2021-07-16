package kodlamaio.hrms.business.validationRules.concretes;

import kodlamaio.hrms.business.validationRules.abstracts.CandidateValidatorService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.apache.logging.log4j.util.Strings;

public class CandidateValidatorManager extends UserValidatorManager implements CandidateValidatorService {

    @Override
    public Result candidateNullCheck(Candidate candidate) {

        if(!(super.userNullCheck(candidate).isSuccess() && !(Strings.isNotEmpty(candidate.getFirstName())) &&
                !(Strings.isNotEmpty(candidate.getLastName())) && !(Strings.isNotEmpty(candidate.getIdentityNumber())) &&
                !(candidate.getBirthYear() == null))){
            return new ErrorResult("Alanlar Boş Bırakılamaz");

        }
        return new SuccessResult();
    }

    @Override
    public Result nationalIdentityValid(String nationalIdentity) {
        if(nationalIdentity.length() == 11){
            new SuccessResult();
        }
        return new ErrorResult("TC Kimlik Numaranız 11 Haneli Olmalıdır");
    }
}
