package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    List<Employer> getByCampanyName(String campanyName);

    List<Employer> getByCampanyNameStartsWith(String campanyName);

    List<Employer> getByCampanyNameContains(String campanyName);

    List<Employer> getByWebAdress(String webAdress);

    List<Employer> getByWebAdressStartsWith(String webAdress); //ne ile baslarsa

    List<Employer> getByWebAdressContains(String webAdress); //icerir

    Employer getByEmployerAndJobAdvertisimenet(String campanyName, boolean isActiveted);
}
