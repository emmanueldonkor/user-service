package bi.seke.userservice.repository;

import bi.seke.userservice.document.PromotionGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionGroupRepository extends MongoRepository<PromotionGroup, String> {
}
