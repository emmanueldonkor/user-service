package bi.seke.userservice.repository;

import bi.seke.userservice.document.Principal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface PrincipleRepository extends MongoRepository<Principal, String> {
}
