package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Group {
  @Id
  private String uid;
  private String name;
  private String description;
  private List<Principal> members;
}
