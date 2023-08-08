package bi.seke.userservice.repository;

import bi.seke.userservice.document.Address;
import bi.seke.userservice.document.Customer;
import bi.seke.userservice.document.Group;
import bi.seke.userservice.document.Principal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class CustomerRepositoryTest {

 @Autowired
  private CustomerRepository customer;

  @Test
  void saveCustomer(){
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
    Principal p = Principal.builder()
      .lastName("Kevin")
      .firstName("Von")
      //.groups(List.of(g,g))
      .build();
    Customer c = Customer.builder()
      .email("emmanuelmk42@gmail.com")
      .uid("4B8")
      .addresses(List.of(add))
      .defaultAddress(add)
      .principle(p)
      .build();
    customer.save(c);
  }
  @Test
  public void printAllCustomers(){
    List<Customer> printAllCustomers = customer.findAll();
    System.out.println("customers" + printAllCustomers );
  }
}
