package bi.seke.userservice.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Customer extends Principal {
    private List<Address> addresses;
    private Address defaultAddress;
}
