package bi.seke.userservice.repository;

import bi.seke.userservice.document.Address;
import bi.seke.userservice.document.Customer;
import bi.seke.userservice.document.Group;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customer;

    @Test
    void saveCustomer() {
        Address add = Address.builder()
                .phone("6868468486")
                .code("34534")
                .country("Poland")
                .line1("Boni")
                .line2("yt3")
                .firstName("Mike")
                .lastName("King")
                .email("mikeking@gmail.com")
                .build();

        Group g = Group.builder()
                .uid("576")
                .description("The Woo")
                .name("king Group")
                .build();

        Customer c = Customer.builder()
                .email("emmanuelmk42@gmail.com")
                .uid(UUID.randomUUID())
                .lastName("Kevin")
                .firstName("Von")
                .addresses(List.of(add))
                .defaultAddress(add)
                .groups(Set.of(g))
                .build();

        customer.save(c);
    }

    @Test
    public void printAllCustomers() {
        List<Customer> printAllCustomers = customer.findAll();
        System.out.println("customers" + printAllCustomers);
    }
}
