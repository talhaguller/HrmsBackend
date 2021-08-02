package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "quota")
    private int quota;

    @Column(name = "appeal_deadline")
    private LocalDate appealDeadline;

    @Column(name = "is_activeted")
    private boolean isActivated;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;

    @ManyToOne()
    @JoinColumn(name = "job_titele_id")
    private JobTitle jobTitle;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;
}
