package test.project.models.operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @Column(name = "status_id",  nullable = false)
    private long id;

    public Status() {
    }

}
