package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends User {

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "employee_first_name")
    private String employeeFirstName;

    @Column(name = "employee_last_name")
    private String employeeLastName;

    @OneToMany(mappedBy = "employee")
    private List<User> users;

}
