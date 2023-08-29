package bi.seke.userservice.repository;

import bi.seke.userservice.document.Principal;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrincipleRepository extends MongoRepository<Principal, ObjectId> {
    Optional<Principal> findByUidOrEmail(UUID uid, String email);
}
