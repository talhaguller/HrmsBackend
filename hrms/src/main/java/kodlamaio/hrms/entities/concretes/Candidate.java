package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
/*@NoArgsConstructor*/
@Table(name = "candidate")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Candidate extends User{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private int birthYear;

    public Candidate() {

    }


}
