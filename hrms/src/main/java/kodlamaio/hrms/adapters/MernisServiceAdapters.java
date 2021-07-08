package kodlamaio.hrms.adapters;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.service.CheckRealPerson;
import mernisService.IEFKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapters implements CheckRealPerson {

    @Override
    public boolean checkİfRealPerson(Candidate candidate) {

        IEFKPSPublicSoap check = new IEFKPSPublicSoap();

        boolean result = true;

        try {
            result = check.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()),
                    candidate.getFirstName().toUpperCase(new Locale("tr")),
                    candidate.getLastName().toUpperCase(new Locale("tr")),
                    candidate.getBirthYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
