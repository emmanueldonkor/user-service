package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Principal {
    @Id
    private ObjectId id;
    private UUID uid;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;

    private Set<Group> groups;
}
