package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Principal {
  private String firstName;
  private String lastName;

 // private List<Group> groups;
}
