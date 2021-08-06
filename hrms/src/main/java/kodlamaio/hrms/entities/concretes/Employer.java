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
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class Employer extends User{


    @Id
    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "campany_name")
    private String campanyName;

    @Column(name = "web_adress")
    private String webAdress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private List<User> users;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;


}
