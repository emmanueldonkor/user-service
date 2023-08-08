package bi.seke.userservice.repository;

import bi.seke.userservice.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
  @Query("SELECT c FROM Customer c WHERE c.email =?1 OR c.uid=?1")
  Customer findByEmailOrUid(String emailOrUid);
}
