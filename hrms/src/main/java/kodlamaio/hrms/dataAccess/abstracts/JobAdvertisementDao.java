package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> getByActivatedIs();

    List<JobAdvertisement> getByAppealDeadline();

    @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto(j.jobAdvertisementId, e.campanyName, j.isActivated ) " +
            "FROM  Employer e Inner Join e.jobAdvertisements j")
    List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails();
}
