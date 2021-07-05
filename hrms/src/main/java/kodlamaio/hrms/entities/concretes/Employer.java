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
@NoArgsConstructor
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Employer extends User{

    @Column(name = "campany_name")
    private String campanyName;

    @Column(name = "web_adress")
    private String webAdress;

    @Column(name = "phone_number")
    private String phoneNumber;

}
