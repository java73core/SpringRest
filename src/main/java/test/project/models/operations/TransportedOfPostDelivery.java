package test.project.models.operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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

    public TransportedOfPostDelivery() {
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }
}
