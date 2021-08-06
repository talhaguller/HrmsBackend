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
@Table(name = "candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class Candidate extends User{

    @Id
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "candidate_first_name")
    private String candidateFirstName;

    @Column(name = "candidate_last_name")
    private String candidateLastName;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private int birthYear;

    @OneToMany(mappedBy = "candidate")
    private List<User> users;


}
