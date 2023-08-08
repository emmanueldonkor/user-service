package bi.seke.userservice.repository;

import bi.seke.userservice.document.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepo;
    @Test
     public void saveAddress(){
      Address address = Address.builder()
        .email("emmmanuelmk42@gmail.com")
        .phone("48698013291")
        .country("Poland")
        .code("MXR")
        .firstName("Emmanuel")
        .lastName("Donkor")
        .postCode("02-930")
        .line1("Boni")
        .line2("Ul")
        .build();
      addressRepo.save(address);
     }

     @Test
    public void printAddress(){
      List<Address> address = addressRepo.findAll();
       System.out.println("add = " + address);
     }
}
