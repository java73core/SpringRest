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
@Table(name = "TransportedOfPostDelivery")
public class TransportedOfPostDelivery {

    @Id
    @Column(name = "id",  nullable = false)
    private long id;

    @Column(name = "dateOfArrival")
    private Date dateOfArrival;

    @Column(name = "dateofDeparture")
    private Date dateOfDeparture;
}
