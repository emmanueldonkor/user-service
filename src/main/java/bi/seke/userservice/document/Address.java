package bi.seke.userservice.document;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
  private String code;
  private String firstName;
  private String lastName;
  private String postCode;
  private String line1;
  private String line2;
  private String country;
  private String email;
  private String phone;
}
