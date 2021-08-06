package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_titeles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class JobTitle {

    @Id
    @Column(name = "job_titele_id")
    private int jobTiteleId;

    @Column(name = "titele")
    private String titele;

    @OneToMany(mappedBy = "job_titeles")
    private List<JobAdvertisement> jobAdvertisements;

}
