package test.project.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "postaldelivery")
public class PostalDelivery {

    @Id
    @Column(name = "postaldelivery_id", nullable = false)
    private Integer id;

    @Column(name = "type_of_delivery")
    @Enumerated(EnumType.STRING)
    private TypeOfDelivery typeOfDelivery;

    @Column(name = "indexRecipient")
    private int indexRecipient;

    @Column(name = "addressRecipient")
    private String addressRecipient;

    @Column(name = "recipientsName")
    private String recipientsName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PostalDelivery that = (PostalDelivery) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
