package test.project.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "postoffice")
public class PostOffice {

    @Id
    @Column(name = "postoffice_id", nullable = false)
    private Integer postIndex;

    @Column(name = "postname")
    private String postName;

    @Column(name = "postaddress")
    private String postAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PostOffice that = (PostOffice) o;
        return postIndex != null && Objects.equals(postIndex, that.postIndex);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
