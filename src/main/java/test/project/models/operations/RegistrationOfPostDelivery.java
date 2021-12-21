package test.project.models.operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RegistrationOfPostDelivery")
public class RegistrationOfPostDelivery {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dateOfRegistration")
    private Date dateOfRegistration;

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public RegistrationOfPostDelivery() {
    }
}
