package test.project.models.operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "addresses")
public class Addresses {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dateOfDelivery")
    private Date dateOfDelivery;

    public Addresses() {
    }

    public Addresses(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }
}
