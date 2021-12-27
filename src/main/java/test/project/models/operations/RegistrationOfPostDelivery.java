package test.project.models.operations;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "RegistrationOfPostDelivery")
public class RegistrationOfPostDelivery {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dateOfRegistration")
    private Date dateOfRegistration;
}
