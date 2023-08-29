package bi.seke.userservice.document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "employees")
@Data
@NoArgsConstructor
public class Employee extends Principal {
}
