package test.project.repository;

import org.springframework.data.repository.CrudRepository;
import test.project.models.PostalDelivery;

public interface PostDeliveryRepo extends CrudRepository<PostalDelivery,Long> {
}
