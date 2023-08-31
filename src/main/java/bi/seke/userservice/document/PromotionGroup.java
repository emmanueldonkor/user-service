package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "promotion_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionGroup extends Group {
    private Integer percentage;
}
