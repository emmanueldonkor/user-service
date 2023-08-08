package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "promotion_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionGroup {
  @Id
  private String uid;
  private String name;
  private Integer percentage;
  private Group group;
}
