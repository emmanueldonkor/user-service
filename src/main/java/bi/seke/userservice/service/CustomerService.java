package bi.seke.userservice.service;

import bi.seke.userservice.document.Customer;


import java.util.List;

public interface CustomerService {
  //Get customers by Id Method
  Customer getCustomerById(String uid);
  //Get All customers list
  List<Customer> getAllCustomers();

  //Save customer
  Customer saveCustomer( Customer customer);

  Customer getCustomerByEmailOrUid(String emailOrUid);
}
